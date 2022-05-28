
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;



public class BalanceEnquiry extends JFrame implements ActionListener {
    
    JButton back;
    String pinnumber;
    
    BalanceEnquiry(String change){
        this.pinnumber = change;
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("bank/management/system/icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(750,750,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,750,750);
        add(image);
        
        back = new JButton("Back");
        back.setBounds(300,435,130,20);
        back.addActionListener(this);
        image.add(back);
        
        conn Conn = new conn();
        int balance = 0;
            try{
             ResultSet rs = Conn.s.executeQuery("select * from bank where pin = '"+pinnumber+"'");
             while(rs.next()){
                 if(rs.getString("type").equals("deposit")){
                     balance+=Integer.parseInt(rs.getString("amount"));
                 }else{
                     balance-=Integer.parseInt(rs.getString("amount"));
                 }
             }
            }catch(Exception e){
                     System.out.println(e);
                     }
            
            JLabel text = new JLabel("Your account balance in Rs. " + balance);
            text.setForeground(Color.WHITE);
            text.setBounds(140,300,300,20);
            image.add(text);
            
      
        
        setLayout(null);
        setSize(750,750);
        setLocation(350,50);
        getContentPane().setBackground(Color.WHITE);
        setUndecorated(true);
        setVisible(true);
        
        
    }
    
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Transactions(pinnumber).setVisible(true);
    }
    
    
    public static void main(String [] args){
        
        new BalanceEnquiry("");
        
    }
    
}
