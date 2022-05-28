
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;



public class Deposit extends JFrame implements ActionListener{
     
    JButton deposit,back;
    String pinnumber;
    
    Deposit(String pinnumber){
        
     this.pinnumber = pinnumber;   
     ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("bank/management/system/icons/atm.jpg"));
     Image i2 = i1.getImage().getScaledInstance(750,750,Image.SCALE_DEFAULT);
     ImageIcon i3 = new ImageIcon(i2);
     JLabel img = new JLabel(i3);
     img.setBounds(0,0,750,750);
     add(img);
     
     JLabel l1 = new JLabel("Enter the amount you want to deposit");
     l1.setBounds(150,250,700,30);
     l1.setFont(new Font("System",Font.BOLD,14));
     l1.setForeground(Color.WHITE);
     img.add(l1);
     
     JTextField t1 = new JTextField();
     t1.setBounds(170,285,210,20);
     t1.setFont(new Font ("Raleway",Font.BOLD,18));
     img.add(t1);
     
     deposit = new JButton("Deposit");
     deposit.setBounds(320,405,100,20);
     deposit.addActionListener(this);
     img.add(deposit);
     
     back = new JButton("Back");
     back.setBounds(320,435,100,20);
     back.addActionListener(this);
     img.add(back);
     
        
    setLayout(null);
    setSize(750,750);
    setLocation(350,50);
    getContentPane().setBackground(Color.WHITE);
    setVisible(true);
    
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == deposit){
            String number = deposit.getText();
            Date date = new Date();
            if(number.equals("")){
                JOptionPane.showMessageDialog(null,"Please enter the amount");
            }else{
                try{
                conn c = new conn();
                String query =("insert into bank values('"+pinnumber+"','"+date+"','deposit','"+number+"')");
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Rs "+ number +" deposited sucessfully");
                setVisible(false);
                new Transactions(pinnumber).setVisible(true);
                }catch(Exception e){
                    System.out.println(e);
                }
            }
        }else if(ae.getSource() == back){
            setVisible(false);
            new Transactions(pinnumber).setVisible(true);
        }
    }
    
    
    
    public static void main(String [] args){
        
        new Deposit("").setVisible(true);
    }
}
