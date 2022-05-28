
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener {
    
    JButton login,clear,signup;
    JTextField t1,t2;
    
    Login(){
        setTitle("AUTOMATED TELLER MACHINE");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("bank/management/system/icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(70,10,100,100);
        setLayout(null);
        add(l1);
        
        JLabel text = new JLabel("WELCOME TO ATM");
        text.setBounds(170,40,400,40);
        text.setFont(new Font("Osworld",Font.BOLD,38));
        add(text);
        
        JLabel cardNo = new JLabel("Card No:");
        cardNo.setFont(new Font ("Raleway",Font.BOLD,28));
        cardNo.setBounds(150,150,150,30);
        add(cardNo);
        
        t1 = new JTextField();
        t1.setFont(new Font("arial",Font.BOLD,14));
        t1.setBounds(310,150,250,30);
        //t1.setBorder(BorderFactory.createEmptyBorder());
        add(t1);
        
        JLabel pin = new JLabel("PIN:");
        pin.setFont(new Font("raleway",Font.BOLD,28));
        pin.setBounds(150,230,150,30);
        add(pin);
        
        t2 = new JPasswordField();
        t2.setFont(new Font("arial",Font.BOLD,14));
        t2.setBounds(310,230,250,30);
        //t2.setBorder(BorderFactory.createEmptyBorder());
        add(t2);
        
        login = new JButton("SIGN IN");
        login.setBounds(310,300,100,30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);
        
        clear = new JButton("CLEAR");
        clear.setBounds(460,300,100,30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);
        
        signup = new JButton("SIGN UP");
        signup.setBounds(310,350,250,30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);
        add(signup);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(800,480);
        setLocation(350,200);
        setVisible(true);
        
    }
   
    public void  actionPerformed(ActionEvent ae){
        if(ae.getSource() == clear){
            t1.setText("");
            t2.setText("");
            
        }else if(ae.getSource() == login){
            conn Conn = new conn();
            String cardnumber = t1.getText();
            String pinnumber = t2.getText();
            String query = "select * from login where cardNumber = '"+cardnumber+"' and pinNumber = '"+pinnumber+"'";
            
            try{
                ResultSet rs = Conn.s.executeQuery(query);
                if(rs.next()){
                    setVisible(false);
                    new Transactions(pinnumber).setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(null,"INCORRRECT CARD NUMBER OR PIN");
                }
            }catch(Exception e){
                System.out.println(e);
            }
        }else if(ae.getSource() == signup){
            setVisible(false);
            new SignupOne().setVisible(true);
            
        }
        
    }
    
    
    
    public static void main(String [] args){
        new Login();
        
        
    }
}
