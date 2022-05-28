
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;



public class SignupThree extends JFrame implements ActionListener{
    
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton submit,cancel;
    String formno;
    
   SignupThree(String formno){
        formno = this.formno;
       JLabel l1 = new JLabel("PAGE 3: ACCOUNT DETAILS");
       l1.setBounds(220,40,400,20);
       l1.setFont(new Font("Raleway",Font.BOLD,20));
       add(l1);
       
       JLabel l2 = new JLabel("Account Type:");
       l2.setBounds(50,110,200,30);
       l2.setFont(new Font("Raleway",Font.BOLD,20));
       add(l2);
        
       r1 = new JRadioButton("Savings Account");
       r1.setBounds(50,150,200,30);
       r1.setBackground(Color.WHITE);
       r1.setFont(new Font("Raleway",Font.BOLD,16));
       add(r1);
       
       r2 = new JRadioButton("Fixed Deposit Account");
       r2.setBounds(350,150,200,30);
       r2.setBackground(Color.WHITE);
       r2.setFont(new Font("Raleway",Font.BOLD,16));
       add(r2);
       
       r3 = new JRadioButton("Current Account");
       r3.setBounds(50,200,200,30);
       r3.setBackground(Color.WHITE);
       r3.setFont(new Font("Raleway",Font.BOLD,16));
       add(r3);
       
       r4 = new JRadioButton("Recurring Deposit Account");
       r4.setBounds(350,200,250,30);
       r4.setBackground(Color.WHITE);
       r4.setFont(new Font("Raleway",Font.BOLD,16));
       add(r4);
       
       
       ButtonGroup groupAccount = new ButtonGroup();
       groupAccount.add(r1);
       groupAccount.add(r2);
       groupAccount.add(r3);
       groupAccount.add(r4);
       
       JLabel card = new JLabel("CARD NUMBER:");
       card.setBounds(50,260,200,30);
       card.setFont(new Font("Raleway",Font.BOLD,16));
       add(card);
       
       JLabel l4 = new JLabel("Your 16 digit Card Number");
       l4.setBounds(50,295,300,12);
       l4.setFont(new Font("Raleway",Font.BOLD,12));
       add(l4);
       
       JLabel cardnum = new JLabel("XXXX-XXXX-XXXX-4184");
       cardnum.setBounds(350,270,400,30);
       cardnum.setFont(new Font("Raleway",Font.BOLD,16));
       add(cardnum);
       
        JLabel pin = new JLabel("PIN:");
       pin.setBounds(50,320,200,30);
       pin.setFont(new Font("Raleway",Font.BOLD,16));
       add(pin);
       
       JLabel pinlbl = new JLabel("Your 4 digit Password");
       pinlbl.setBounds(50,345,200,12);
       pinlbl.setFont(new Font("Raleway",Font.BOLD,12));
       add(pinlbl);
       
       
       JLabel password = new JLabel("XXXX");
       password.setBounds(350,320,200,30);
       password.setFont(new Font("Raleway",Font.BOLD,16));
       add(password);
       
       JLabel service = new JLabel("Service Required:");
       service.setBounds(50,370,200,30);
       service.setFont(new Font("Raleway",Font.BOLD,16));
       add(service);
       
       c1= new JCheckBox("ATM CARD");
       c1.setBounds(50,410,200,30);
       c1.setFont(new Font("Raleway",Font.BOLD,16));
       c1.setBackground(Color.WHITE);
       add(c1);
       
       c2= new JCheckBox("INTERNET BANKING");
       c2.setBounds(350,410,200,30);
       c2.setFont(new Font("Raleway",Font.BOLD,16));
       c2.setBackground(Color.WHITE);
       add(c2);
       
       c3= new JCheckBox("MOBILE BANKNG");
       c3.setBounds(50,450,200,30);
       c3.setFont(new Font("Raleway",Font.BOLD,16));
       c3.setBackground(Color.WHITE);
       add(c3);
       
       c4= new JCheckBox("EMAIL & SMS ALERT");
       c4.setBounds(350,450,200,30);
       c4.setFont(new Font("Raleway",Font.BOLD,16));
       c4.setBackground(Color.WHITE);
       add(c4);
       
       c5= new JCheckBox("CHEQUE BOOK");
       c5.setBounds(50,490,200,30);
       c5.setFont(new Font("Raleway",Font.BOLD,16));
       c5.setBackground(Color.WHITE);
       add(c5);
       
       c6= new JCheckBox("E-Statement");
       c6.setBounds(350,490,200,30);
       c6.setFont(new Font("Raleway",Font.BOLD,16));
       c6.setBackground(Color.WHITE);
       add(c6);
       
       c7= new JCheckBox("I hereby declare that the above entered details are correct.");
       c7.setBounds(50,540,600,30);
       c7.setFont(new Font("Raleway",Font.BOLD,14));
       c7.setBackground(Color.WHITE);
       add(c7);
       
       cancel = new JButton("CANCEL");
       cancel.setBounds(200,600,100,30);
       cancel.setFont(new Font("Raleway",Font.BOLD,16));
       cancel.setBackground(Color.BLACK);
       cancel.setForeground(Color.WHITE);
       cancel.addActionListener(this);
       add(cancel);
       
       submit = new JButton("SUBMIT");
       submit.setBounds(350,600,100,30);
       submit.setFont(new Font("Raleway",Font.BOLD,16));
       submit.setBackground(Color.BLACK);
       submit.setForeground(Color.WHITE);
       submit.addActionListener(this);
       add(submit);
       
       
       
       setLayout(null);
       setSize(700,700);
       setLocation(400,100);
       getContentPane().setBackground(Color.WHITE);
       setVisible(true);

   }
   
   public void actionPerformed(ActionEvent ae){
       if(ae.getSource() == submit){
          String accountType = null;
          if(r1.isSelected()){
             accountType = "Savings Account"; 
          }else if(r2.isSelected()){
              accountType = "Fixed Deposit Account";
          }else if(r3.isSelected()){
              accountType = "Current Account";
          }else if(r4.isSelected()){
              accountType = "Recurring Deposit Account";
          }
          
          Random random = new Random();
          Long card = (random.nextLong() % 90000000L) + 5040936000000000L;
          String cardNumber = "" + Math.abs(card);
          
          Long pin = (random.nextLong() % 90000L) + 1000L;
          String pinNumber = "" + Math.abs(pin);
          
          String facility = "";
          if(c1.isSelected()){
              facility = facility + "ATM CARD";
          }else if(c2.isSelected()){
              facility = facility + "Internet Banking";
          }else if(c3.isSelected()){
              facility = facility + "Mobile Banking";
          }else if(c4.isSelected()){
              facility = facility + "Email & SMS alert";
          }else if(c5.isSelected()){
              facility = facility + "Cheque Book";
          }else if(c6.isSelected()){
              facility = facility + "E-Statement";
          }
          
          try{
              if(accountType.equals("")){
                  JOptionPane.showMessageDialog(null,"Account Type is Required");
              }else{
                  conn Conn = new conn();
                  String query1 = "insert into signupthree values('"+formno+"','"+accountType+"','"+cardNumber+"','"+pinNumber+"','"+facility+"')";
                  String query2 = "insert into login values('"+formno+"','"+cardNumber+"','"+pinNumber+"')";
                  Conn.s.executeUpdate(query1);
                  Conn.s.executeUpdate(query2);
                  JOptionPane.showMessageDialog(null,"CARD NUMBER:" + cardNumber + "\n PIN:" + pinNumber);
                  setVisible(false);
                  new Deposit(pinNumber).setVisible(true);
              }
          }catch(Exception e){
              System.out.println(e);
          }
       }else if(ae.getSource() == cancel){
           setVisible(false);
           new Login().setVisible(true);
   }
   }



public static void main(String [] args){
SignupThree signup3 = new SignupThree("");

        }
}
