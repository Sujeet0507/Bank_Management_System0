package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

    public class SignupTwo extends JFrame implements ActionListener  {
        
       JTextField panfield,aadharfield;
       JRadioButton yes , no , syes , sno;
       JButton next;
       JComboBox religion,category,income,eduqua,occupation;
       String formno;
       
    public SignupTwo(String formno){
        
         setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
         this.formno = formno;
         setLayout(null);
         
         JLabel l2 = new JLabel("PAGE 2: ADDITIONAL DETAILS");
         l2.setBounds(200,100,500,30);
         l2.setFont(new Font("Osworld",Font.BOLD,22));
         add(l2);
         
         JLabel rlgnlbl = new JLabel("RELIGION: ");
         rlgnlbl.setBounds(100,150,120,30);
         rlgnlbl.setFont(new Font ("Raleway",Font.BOLD,20));
         add(rlgnlbl);
         
         String valreligion [] = {"Hindu","Muslim","Christian","Sikh","Others"};
         religion = new JComboBox(valreligion);
         religion.setBackground(Color.WHITE);
         religion.setBounds(300,150,400,30);
         add(religion);
         
         JLabel CategoryLbl = new JLabel("CATEGORY: ");
         CategoryLbl.setBounds(100,200,200,30);
         CategoryLbl.setFont(new Font("Raleway",Font.BOLD,20));
         add(CategoryLbl);
         
         String [] valCategory = {"General","OBC","SC","ST"};
         category = new JComboBox(valCategory);
         category.setBounds(300,200,400,30);
         category.setBackground(Color.WHITE);
         add(category);
         
         
         JLabel incomeLbl = new JLabel("INCOME: ");
         incomeLbl.setBounds(100,250,200,30);
         incomeLbl.setFont(new Font("Raleway",Font.BOLD,20));
         add(incomeLbl);
         
         String [] valIncome = {"NULL","< 100000","< 150000","< 250000","upto 10 lacs"};
         income = new JComboBox(valIncome);
         income.setBounds(300,250,200,30);
         income.setBackground(Color.WHITE);
         add(income);
         
         
         JLabel edulbl = new JLabel("EDUCATIONAL");
         edulbl.setBounds(100,330,200,30);
         edulbl.setFont(new Font("Raleway",Font.BOLD,20));
         add(edulbl);
         
         
         JLabel qualbl = new JLabel("QUALIFICATION: ");
         qualbl.setBounds(100,350,200,30);
         qualbl.setFont(new Font("Raleway",Font.BOLD,20));
         add(qualbl);
         
         
         String valedu []= {"Non-Graduate","Graduate","Post- Graduate","Doctrate","Others"};
         eduqua = new JComboBox(valedu);         
         eduqua.setBounds(300,350,400,30);
         eduqua.setBackground(Color.WHITE);
         eduqua.setFont(new Font("arial",Font.BOLD,14));
         add(eduqua);
         
         
         JLabel occupationlbl = new JLabel("OCCUPATION: ");
         occupationlbl.setBounds(100,400,200,30);
         occupationlbl.setFont(new Font("Raleway",Font.BOLD,20));
         add(occupationlbl);
         
         String [] vaOccupation = {"Salaried","Self Employed","Business","Student","Retired","Other"};
         occupation = new JComboBox(vaOccupation);
         occupation.setBounds(300,400,400,30);
         occupation.setBackground(Color.WHITE);
         add(occupation);
         
         
         JLabel panlbl = new JLabel("PAN NUMBER: ");
         panlbl.setBounds(100,450,200,30);
         panlbl.setFont(new Font("Raleway",Font.BOLD,20));
         add(panlbl);
         
         panfield = new JTextField();
         panfield.setBounds(300,450,400,30);
         panfield.setFont(new Font("arial",Font.BOLD,14));
         add(panfield);
         
         
         JLabel aadharlbl = new JLabel("AADHAR NUMBER: ");
         aadharlbl.setBounds(100,500,200,30);
         aadharlbl.setFont(new Font ("Raleway",Font.BOLD,20));
         add(aadharlbl);
         
         aadharfield = new JTextField();
         aadharfield.setBounds(300,500,400,30);
         aadharfield.setFont(new Font("arial",Font.BOLD,14));
         add(aadharfield);
         
         JLabel SeniorCitizen = new JLabel("SENIOR CITIZEN: ");
         SeniorCitizen.setBounds(100,550,200,30);
         SeniorCitizen.setFont(new Font("Raleway",Font.BOLD,20));
         add(SeniorCitizen);
         
         syes = new JRadioButton("Yes");
         syes.setBounds(300,550,100,30);
         syes.setFont(new Font("arial",Font.BOLD,14));
         add(syes);
         
         sno = new JRadioButton("No");
         sno.setBounds(500,550,100,30);
         sno.setFont(new Font("arial",Font.BOLD,14));
         add(sno);
         
         
         ButtonGroup SeniorCiti = new ButtonGroup();
         SeniorCiti.add(syes);
         SeniorCiti.add(sno);
         
         JLabel ExistingAccount = new JLabel("EXISTING ACCOUNT: ");
         ExistingAccount.setBounds(100,600,200,30);
         ExistingAccount.setFont(new Font("Raleway",Font.BOLD,18));
         add(ExistingAccount);
         
         yes = new JRadioButton("Yes");
         yes.setBounds(300,600,100,30);
         yes.setFont(new Font("arial",Font.BOLD,14));
         add(yes);
         
         no = new JRadioButton("No");
         no.setBounds(500,600,100,30);
         no.setFont(new Font("arial",Font.BOLD,14));
         add(no);
         
         ButtonGroup ExistingAcc = new ButtonGroup();
         ExistingAcc.add(yes);
         ExistingAcc.add(no);
         
         
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
        String sreligion = (String)religion.getSelectedItem();
        String scategory = (String)category.getSelectedItem();
        String sincome = (String)income.getSelectedItem();
        String seduqua = (String)eduqua.getSelectedItem();
        String soccupation = (String)occupation.getSelectedItem();
        
        String pan = panfield.getText();
        String aadhar = aadharfield.getText();
        //String dob = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        
        String SeniorCitizen = null;
        if(syes.isSelected()){
            SeniorCitizen = "Yes";
        }else if(sno.isSelected()){
                  SeniorCitizen = "No";
                    }
            
        String ExistngAccount = null;
        if(yes.isSelected()){ 
        ExistngAccount = "Yes";
        }else if(no.isSelected()){ 
            ExistngAccount = "No";
            }
    
        
        try{
        if(aadhar.equals("")){
            JOptionPane.showMessageDialog(null,"Aadhar number is required");
        }else {
            conn c = new conn();
            String query = "insert into signupTwo values('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seduqua+"','"+soccupation+"','"+pan+"','"+aadhar+"','"+SeniorCitizen+"','"+ExistngAccount+"')";
            c.s.executeUpdate(query);
            
            //signup3 object
            setVisible(false);
            new SignupThree(formno).setVisible(true);
        }
        } catch(Exception e){
        System.out.println(e);
        } 
    }
    
        
    

    public static void main(String args []) {
    SignupTwo Sign2 = new SignupTwo("");
    
    }
 
        
}

