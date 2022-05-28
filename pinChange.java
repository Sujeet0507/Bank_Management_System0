
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class pinChange extends JFrame implements ActionListener {
    
    JPasswordField pinfield,repinfield;
    JButton change,back;
    String pinnumber;
    
    pinChange(String pinnumber){
        
        this.pinnumber = pinnumber;
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("bank/management/system/icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(750,750,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,750,750);
        add(image);
        
        JLabel l1 = new JLabel("CHANGE YOUR PIN");
        l1.setBounds(200,250,250,20);
        l1.setFont(new Font("System",Font.BOLD,16));
        l1.setForeground(Color.WHITE);
        image.add(l1);
        
        JLabel pin = new JLabel("NEW PIN: ");
        pin.setBounds(130,280,250,20);
        pin.setFont(new Font("System",Font.BOLD,16));
        pin.setForeground(Color.WHITE);
        image.add(pin);
        
        pinfield = new JPasswordField();
        pinfield.setBounds(280,280,150,20);
        pinfield.setFont(new Font("Raleway",Font.BOLD,14));
        image.add(pinfield);
        
        JLabel repin = new JLabel("Re- Enter New PIN:");
        repin.setBounds(130,310,250,20);
        repin.setFont(new Font("System",Font.BOLD,16));
        repin.setForeground(Color.WHITE);
        image.add(repin);
        
        repinfield = new JPasswordField();
        repinfield.setBounds(280,310,150,20);
        repinfield.setFont(new Font("Raleway",Font.BOLD,14));
        image.add(repinfield);
        
        change = new JButton("Change");
        change .setBounds(300,410,130,20);
        change.addActionListener(this);
        image.add(change);   
       
        back = new JButton("Back");
        back.setBounds(300,435,130,20);
        back.addActionListener(this);
        image.add(back); 
        
        
        
        
        setLayout(null);
        setSize(750,750);
        setLocation(400,50);
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == change){
            try{
                String npin = pinfield.getText();
                String rpin = repinfield.getText();
                
                if(!npin.equals(rpin)){
                    JOptionPane.showMessageDialog(null,"Entered pin doesn't match");
                    return;
                }
                if(npin.equals("")){
                    JOptionPane.showMessageDialog(null,"Please Enter New PIN");
                    return;
                }
                if(rpin.equals("")){
                    JOptionPane.showMessageDialog(null,"Please Re-Enter New PIN");
                    return;
                }
                
                conn c = new conn();
                String query1 ="update bank set pin ='"+rpin+"' where pin = '"+pinnumber+"'";
                String query2 ="update login set pinNumber ='"+rpin+"' where pinNumber ='"+pinnumber+"'";
                String query3 ="update signupthree set pinNumber = '"+rpin+"' where pinNumber= '"+pinnumber+"'";
                
                c.s.executeUpdate(query1);
                c.s.executeUpdate(query2);
                c.s.executeUpdate(query3);
                
                JOptionPane.showMessageDialog(null,"PIN changed sucessfully");
                setVisible(false);
                new Transactions(rpin).setVisible(true);
                
            }catch(Exception e){
                System.out.println(e);
            }
        }else{
            setVisible(false);
            new Transactions(pinnumber).setVisible(true);
        }
        
    }
    
    public static void main(String [] args){
        new pinChange("");
    }
    
}
