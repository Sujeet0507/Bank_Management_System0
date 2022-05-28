
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
import com.toedter.calendar.JDateChooser;


    public class SignupOne extends JFrame implements ActionListener {
       long random;
       JTextField nameField,fnameField,emailfield,dobfield,addressfield,pinfield,cityfield,statefield;
       JDateChooser dateChooser;
       JRadioButton male,female,single,married,other;
       JButton next;
       
    public SignupOne(){
        
         setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 1");
         setLayout(null);
         
         Random ran = new Random();
         long random=Math.abs((ran.nextLong()%9000L) +1000L);
         JLabel l1 = new JLabel("APPLICATION FORM NO. " + random);
         l1.setLocation(150,50);
         l1.setSize(600,30);
         l1.setFont(new Font ("Raleway",Font.BOLD,32));
         add(l1);
         
         JLabel l2 = new JLabel("PAGE 1: PERSONAL DETAILS");
         l2.setBounds(200,100,500,30);
         l2.setFont(new Font("Osworld",Font.BOLD,22));
         add(l2);
         
         JLabel name = new JLabel("NAME: ");
         name.setBounds(100,150,100,30);
         name.setFont(new Font ("Raleway",Font.BOLD,20));
         add(name);
         
         nameField = new JTextField();
         nameField.setFont(new Font("arial",Font.BOLD,14));
         nameField.setBounds(300,150,400,30);
         add(nameField);
         
         JLabel fname = new JLabel("FATHER's NAME: ");
         fname.setBounds(100,200,200,30);
         fname.setFont(new Font("Raleway",Font.BOLD,20));
         add(fname);
         
         fnameField = new JTextField();
         fnameField.setBounds(300,200,400,30);
         fnameField.setFont(new Font("arial",Font.BOLD,14));
         add(fnameField);
         
         JLabel dob = new JLabel("DATE OF BIRTH: ");
         dob.setBounds(100,250,200,30);
         dob.setFont(new Font("Raleway",Font.BOLD,20));
         add(dob);
         
         
         dateChooser = new JDateChooser();
         dateChooser.setBounds(300,250,200,30);
         add(dateChooser);
         
         
         JLabel gender = new JLabel("GENDER: ");
         gender.setBounds(100,300,200,30);
         gender.setFont(new Font("Raleway",Font.BOLD,20));
         add(gender);
         
         male = new JRadioButton("MALE");
         male.setBounds(300,300,60,30);
         male.setBackground(Color.WHITE);
         add(male);
         
         female = new JRadioButton("FEMALE");
         female.setBounds(450,300,80,30);
         female.setBackground(Color.WHITE);
         add(female);
         
         ButtonGroup gendergrp = new ButtonGroup();
         gendergrp.add(male);
         gendergrp.add(female);
         
         JLabel email = new JLabel("E-MAIL: ");
         email.setBounds(100,350,200,30);
         email.setFont(new Font("Raleway",Font.BOLD,20));
         add(email);
         
         emailfield = new JTextField();
         emailfield.setBounds(300,350,400,30);
         emailfield.setFont(new Font("arial",Font.BOLD,14));
         add(emailfield);
         
         
         JLabel maritial = new JLabel("MARITIAL STATUS: ");
         maritial.setBounds(100,400,200,30);
         maritial.setFont(new Font("Raleway",Font.BOLD,20));
         add(maritial);
         
         
         single = new JRadioButton("SINGLE");
         single.setBounds(300,400,80,30);
         single.setBackground(Color.WHITE);
         add(single);
         
         married = new JRadioButton("MARRIED");
         married.setBounds(450,400,80,30);
         married.setBackground(Color.WHITE);
         add(married);
         
         other = new JRadioButton("OTHER ");
         other.setBounds(600,400,80,30);
         other.setBackground(Color.WHITE);
         add(other);
         
         ButtonGroup maritialgrp = new ButtonGroup(); 
         maritialgrp.add(single);
         maritialgrp.add(married);
         maritialgrp.add(other);
         
         JLabel address = new JLabel("ADDRESS: ");
         address.setBounds(100,450,200,30);
         address.setFont(new Font("Raleway",Font.BOLD,20));
         add(address);
         
         addressfield = new JTextField();
         addressfield.setBounds(300,450,400,30);
         addressfield.setFont(new Font("arial",Font.BOLD,14));
         add(addressfield);
         
         
         JLabel city = new JLabel("CITY: ");
         city.setBounds(100,500,200,30);
         city.setFont(new Font ("Raleway",Font.BOLD,20));
         add(city);
         
         cityfield = new JTextField();
         cityfield.setBounds(300,500,400,30);
         cityfield.setFont(new Font("arial",Font.BOLD,14));
         add(cityfield);
         
         JLabel pin = new JLabel("PIN CODE: ");
         pin.setBounds(100,550,200,30);
         pin.setFont(new Font("Raleway",Font.BOLD,20));
         add(pin);
         
         pinfield = new JTextField();
         pinfield.setBounds(300,550,400,30);
         pinfield.setFont(new Font("arial",Font.BOLD,14));
         add(pinfield);
         
         JLabel state = new JLabel("STATE: ");
         state.setBounds(100,600,200,30);
         state.setFont(new Font("Raleway",Font.BOLD,20));
         add(state);
         
         statefield = new JTextField();
         statefield.setBounds(300,600,400,30);
         statefield.setFont(new Font("arial",Font.BOLD,14));
         add(statefield);
         
         
         next = new JButton("Next");
         next.setBounds(620,650,80,30);
         next.setBackground(Color.BLACK);
         next.setForeground(Color.WHITE);
         next.setFont(new Font("Raleway",Font.BOLD,14));
         next.addActionListener(this);
         add(next);
         
         
         
         setVisible(true);
        
        
        setSize(800,750);
        setLocation(400,50);
        
        setVisible(true);
        getContentPane().setBackground(Color.WHITE);
        
        
    }
    public void actionPerformed(ActionEvent ae){
        String formno = " " + random;
        String name = nameField.getText();
        String fname = fnameField.getText();
        String dob = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(male.isSelected()){
            gender = "Male";
        }else if(female.isSelected()){
                    gender = "Female";
                    }
    
        String Email = emailfield.getText();
        
        String maritialStatus = null;
        
        if(single.isSelected()){ 
        maritialStatus = "single";
        }else if(married.isSelected()){ 
            maritialStatus = "married";
            }else if(other.isSelected()){
                maritialStatus = "other";
            }
        
        String address = addressfield.getText();
        String city = cityfield.getText();
        String pin = pinfield.getText();
        String state = statefield.getText();
    
        
        try{
        if(name.equals("")){
            JOptionPane.showMessageDialog(null,"Name is required");
        }else {
            conn c = new conn();
            String query = "insert into signup values('"+formno+"','"+name+"','"+ fname +"','"+dob+"','"+gender+"','"+Email+"','"+maritialStatus+"','"+address+"','"+city+"','"+pin+"','"+state+"')";
            c.s.executeUpdate(query);
            setVisible(false);
           new SignupTwo(formno).setVisible(true);
        }
        } catch(Exception e){
        System.out.println(e);
        } 
    }
    
        
    

    public static void main(String args []) {
    SignupOne Sign = new SignupOne();
    
    }
 
        
}
