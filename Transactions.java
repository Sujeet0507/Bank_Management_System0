
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Transactions extends JFrame implements ActionListener{
    
    JButton deposit,cashwid,fastcash,mini,pinchange,balance,exit;
    String pinnumber;
    
    Transactions(String pinnumber){
        
     pinnumber = this.pinnumber;
     
     ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("bank/management/system/icons/atm.jpg"));
     Image i2 = i1.getImage().getScaledInstance(750,750,Image.SCALE_DEFAULT);
     ImageIcon i3 = new ImageIcon(i2);
     JLabel image = new JLabel(i3);
     image.setBounds(0,0,750,750);
     add(image);
     
     JLabel text = new JLabel("Please select your Transaction");
     text.setForeground(Color.WHITE);
     text.setBounds(170,280,700,30);
     text.setFont(new Font("Raleway",Font.BOLD,14));
     image.add(text);
     
     deposit = new JButton("Deposit");
     deposit.setBounds(130,350,100,20);
     deposit.addActionListener(this);
     image.add(deposit);
     
     cashwid = new JButton("Cash Withdrawl");
     cashwid.setBounds(300,350,130,20);
     cashwid.addActionListener(this);
     image.add(cashwid);
     
     fastcash = new JButton("Fast Cash");
     fastcash.setBounds(130,380,100,20);
     fastcash.addActionListener(this);
     image.add(fastcash);
     
     mini = new JButton("Mini Statement");
     mini.setBounds(300,380,130,20);
     mini.addActionListener(this);
     image.add(mini);
     
      pinchange = new JButton("Pin Change");
      pinchange.setBounds(130,410,100,20);
      pinchange.addActionListener(this);
      image.add(pinchange);
     
     balance = new JButton("Balance Inquiry");
     balance.setBounds(300,410,130,20);
     balance.addActionListener(this);
     image.add(balance);   
       
     exit = new JButton("EXIT");
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
            System.exit(0);
        }else if(ae.getSource() == deposit){
            setVisible(false);
            new Deposit(pinnumber).setVisible(true);
        }else if(ae.getSource() == cashwid){
            setVisible(false);
            new Withdrawl(pinnumber).setVisible(true);
        }else if(ae.getSource() == fastcash){
            setVisible(true);
            new FastCash(pinnumber).setVisible(true);
        }else if(ae.getSource() == pinchange){
            setVisible(false);
            new pinChange(pinnumber).setVisible(true);
        }else if(ae.getSource() == balance){
            setVisible(false);
            new BalanceEnquiry(pinnumber).setVisible(true);
        }else if(ae.getSource() == mini){
            new MiniStatement(pinnumber).setVisible(true);
            
        }
    }
    
    public static void main(String [] args){
        new Transactions("");
    }
    
}
