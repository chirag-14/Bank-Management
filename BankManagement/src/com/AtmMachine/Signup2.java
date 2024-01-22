package com.AtmMachine;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;



public class Signup2 extends JFrame implements ActionListener{

    JTextField  pan,aadhar;
    JRadioButton syes,sno,eyes,eno;
    JButton next;
    JComboBox religion,catagory,education,Occupation,income;
    String formno;
     
     
        Signup2(String formno){
        this.formno = formno;
		setLayout(null);
		setTitle("NEW ACCOUNT FORM - PAGE 2");
		
		JLabel AdditionalDetails = new JLabel("Page 2: AdditionalDetails");
		AdditionalDetails.setBounds(290,80,400,30);
		AdditionalDetails.setFont(new Font("Raleway",Font.BOLD,22));
		add(AdditionalDetails );
		
		JLabel name = new JLabel("Religion:");
		name.setFont(new Font("Raleway",Font.BOLD,20));
		name.setBounds(100,140,100,30);
		add(name);
		
		String valReligion[] = {"Hindu","Muslim","Chirstian","Sikh","other"};
	    religion = new JComboBox(valReligion);
		religion.setBounds(300,140,400,30);
		religion.setBackground(Color.white);
		add(religion);
		
	    JLabel fname = new JLabel("Catagory Name:");
		fname.setFont(new Font("Raleway",Font.BOLD,20));
		fname.setBounds(100,190,200,30);
		add(fname);
		
		String valcatagory[] = {"General","OBC","SC","ST","Others"};
		catagory = new JComboBox(valcatagory);
		catagory.setBounds(300,190,400,30);
		catagory.setBackground(Color.WHITE);
		add(catagory);
		
        JLabel dob = new JLabel("Income:");
		dob.setFont(new Font("Raleway",Font.BOLD,20));
		dob.setBounds(100,240,200,30);
		add(dob);
		
		String valincome[] = {"Null","< 1,50,000","< 2,50,000","< 5,00,000","up to 10,00,000"};
		income = new JComboBox(valincome);
		income.setBounds(300,240,400,30);
		income.setBackground(Color.WHITE);
		add(income);
		
		
		JLabel gender = new JLabel("Educational");
		gender.setFont(new Font("Raleway",Font.BOLD,20));
		gender.setBounds(100,290,200,30);
		add(gender);
		
		JLabel email = new JLabel("Qualification:");
		email.setFont(new Font("Raleway",Font.BOLD,20));
		email.setBounds(100,315,200,30);
		add(email);
		
		String educationValues[] = {"Non-Graduate","Graduate","Graduate","Post-Graduate","Doctarate","Others"};
	    education = new JComboBox(educationValues);
		education.setBounds(300,315,400,30);
		education.setBackground(Color.WHITE);
		add(education);
		
		JLabel Martial = new JLabel("Occupation:");
		Martial.setFont(new Font("Raleway",Font.BOLD,20));
		Martial.setBounds(100,390,200,30);
		add(Martial);
		
		String OccupationValues[] = {"Salaried","Self employed","Business","Student","Retired","Others"};
		Occupation = new JComboBox(OccupationValues);
		Occupation.setBounds(300,390,400,30);
		Occupation.setBackground(Color.WHITE);
		add(Occupation);
		
		JLabel Adress = new JLabel("PAN NO:");
		Adress.setFont(new Font("Raleway",Font.BOLD,20));
		Adress.setBounds(100,440,200,30);
		add(Adress);
		
	    pan = new JTextField();
	    pan.setFont(new Font("Raleway",Font.BOLD,14));
	    pan.setBounds(300,440,400,30);
		add(pan);
		
		JLabel City = new JLabel("Aadhar no:");
		City.setFont(new Font("Raleway",Font.BOLD,20));
		City.setBounds(100,490,200,30);
		add(City);
		
		aadhar= new JTextField();
		aadhar.setFont(new Font("Raleway",Font.BOLD,14));
		aadhar.setBounds(300,490,400,30);
		add(aadhar);
		
		
		
		JLabel State = new JLabel("Senior Citizen:");
		State.setFont(new Font("Raleway",Font.BOLD,20));
		State.setBounds(100,540,200,30);
		add(State);
		
		syes = new JRadioButton("YES");
		syes.setBounds(300,540,100,30);
		syes.setBackground(Color.white);
		add(syes);
		
		sno = new JRadioButton("NO");
		sno.setBounds(450,540,100,30);
		sno.setBackground(Color.white);
        add(sno);
        
		
		 ButtonGroup  maritalgroup = new ButtonGroup();
		 maritalgroup.add(syes);
		 maritalgroup.add(sno);
		
		
		JLabel Pincode = new JLabel("Existing Account:");
		Pincode.setFont(new Font("Raleway",Font.BOLD,20));
		Pincode.setBounds(100,590,200,30);
		add(Pincode);
		
		eyes = new JRadioButton("YES");
		eyes.setBounds(300,590,100,30);
		eyes.setBackground(Color.white);
		add(eyes);
		
		eno = new JRadioButton("NO");
		eno.setBounds(450,590,100,30);
		eno.setBackground(Color.white);
        add(eno);
        
		
		 ButtonGroup  maritalgroup1 = new ButtonGroup();
		 maritalgroup1.add(eyes);
		 maritalgroup1.add(eno);
		
		
		next = new JButton("Next");
		next.setBackground(Color.black);
		next.setForeground(Color.white);
		next.setFont(new Font("Raleway",Font.BOLD,14));
		next.setBounds(620,650,80,30);
		next.addActionListener(this);
		add(next);
		
		getContentPane().setBackground(Color.white);
		
		setSize(850,800);
		setLocation(350,10);
		setVisible(true);
	}
	
	
	public void actionPerformed(ActionEvent ae ) {
		
		String sreligion = (String)religion.getSelectedItem();
		String scatagory = (String)catagory.getSelectedItem();
		String sincome = (String)income.getSelectedItem();
		String seducation = (String)education.getSelectedItem();
		String soccupation = (String)Occupation.getSelectedItem();
		String seniorcitizen = null;
		if(syes.isSelected()) {
			seniorcitizen = "YES";
		}else if(syes.isSelected()) {
			seniorcitizen = "NO";
		}
		
		String existingaccount = null;
		if(eyes.isSelected()) {
			existingaccount ="YES";
		} else if(eno.isSelected()) {
			existingaccount ="NO";
		}
		String span = pan.getText();
		String saadhar =aadhar.getText();
		
		try {
			
				Conn c = new Conn();
				String query = "insert into signup2 values('"+formno+"', '"+sreligion+"' , '"+scatagory+"' , '"+sincome+"' , '"+seducation+"' , '"+soccupation+"', '"+span+"', '"+saadhar+"','"+seniorcitizen+"','"+existingaccount+"')";
			    c.s.executeUpdate(query);
		       //signup3 object
			    setVisible(false);
			    new Signup3(formno).setVisible(true);
			
		}catch(Exception e) {
			System.out.println(e);
		}
	
	}
public static void main(String[] args) {
	new Signup2("");
}
}
