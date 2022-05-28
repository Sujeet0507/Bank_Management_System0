package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Date;

public class FastCash extends JFrame implements ActionListener{
    
    JButton deposit,cashwid,fastcash,mini,pinchange,balance,exit;
    String pinnumber;
    
    FastCash(String pinnumber){
        
     pinnumber = this.pinnumber;
     
     ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("bank/management/system/icons/atm.jpg"));
     Image i2 = i1.getImage().getScaledInstance(750,750,Image.SCALE_DEFAULT);
     ImageIcon i3 = new ImageIcon(i2);
     JLabel image = new JLabel(i3);
     image.setBounds(0,0,750,750);
     add(image);
     
     JLabel text = new JLabel("SELECT WITHDRAWL AMOUNT");
     text.setForeground(Color.WHITE);
     text.setBounds(170,280,700,30);
     text.setFont(new Font("Raleway",Font.BOLD,14));
     image.add(text);
     
     deposit = new JButton("Rs 100");
     deposit.setBounds(130,350,100,20);
     deposit.addActionListener(this);
     image.add(deposit);
     
     cashwid = new JButton("Rs 500");
     cashwid.setBounds(300,350,130,20);
     cashwid.addActionListener(this);
     image.add(cashwid);
     
     fastcash = new JButton("Rs 1000");
     fastcash.setBounds(130,380,100,20);
     fastcash.addActionListener(this);
     image.add(fastcash);
     
     mini = new JButton("Rs 2000");
     mini.setBounds(300,380,130,20);
     mini.addActionListener(this);
     image.add(mini);
     
      pinchange = new JButton("Rs 5000");
      pinchange.setBounds(130,410,100,20);
      pinchange.addActionListener(this);
      image.add(pinchange);
     
     balance = new JButton("Rs 10000");
     balance.setBounds(300,410,130,20);
     balance.addActionListener(this);
     image.add(balance);   
       
     exit = new JButton("BACK");
     exit.setBounds(300,435,130,20);
     exit.addActionListener(this);
     image.add(exit); 
        
        
    setLayout(null);
    setSize(750,750);
    setLocation(350,50);
    getContentPane().setBackground(Color.WHITE);
    setUndecorated(true);
    setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== exit){
            setVisible(false);
            new Transactions(pinnumber).setVisible(true);
        }else {
            String amount = ((JButton)ae.getSource()).getText().substring(3);
            conn Conn = new conn();
            try{
             ResultSet rs = Conn.s.executeQuery("select * from bank where pin = '"+pinnumber+"'");
             int balance = 0;
             while(rs.next()){
                 if(rs.getString("type").equals("deposit")){
                     balance+=Integer.parseInt(rs.getString("amount"));
                 }else{
                     balance-=Integer.parseInt(rs.getString("amount"));
                 }
             }
             if(ae.getSource() != exit && balance < Integer.parseInt("amount")){
                 JOptionPane.showMessageDialog(null,"Insuffficient Balance");
                 return;
             }
             
             Date date = new Date();
             String query = "insert into bank values('"+pinnumber+"','"+date+"','withdrawl','"+amount+"')";
             Conn.s.executeUpdate(query);
             JOptionPane.showMessageDialog(null,"Rs "+amount + "Debited Sucessfully");
             
             setVisible(false);
             new Transactions(pinnumber).setVisible(true);
             
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
    
    public static void main(String [] args){
        new FastCash("");
    }
    
}
