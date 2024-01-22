package com.AtmMachine;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import com.toedter.calendar.JDateChooser;


public class Signup1 extends JFrame implements ActionListener{
	
	JTextField nameTextField,fnameTextField,emailTextField,dobTextField,addressTextField,cityTextField,StateTextField,PincodeTextField;
    JRadioButton male,female,other,married,unmarried;
    JDateChooser datechooser;
    JButton next;

   
        long Random;
        Signup1(String formno){
		setLayout(null);
		Random ran = new Random();
	    Random = (Math.abs((ran.nextLong() % 9000L + 1000L)));
		
		JLabel formno1 = new JLabel("APPLICATION FORM NO. " + Random);
		formno1.setFont(new Font("Raleway",Font.BOLD,38));
		formno1.setBounds(140,20,600,40);
		add(formno1);
		
		JLabel personalDetails = new JLabel("Page 1: PersonalDetails");
		personalDetails.setFont(new Font("Raleway",Font.BOLD,22));
		personalDetails.setBounds(290,80,400,30);
		add(personalDetails );
		
		JLabel name = new JLabel("Name:");
		name.setFont(new Font("Raleway",Font.BOLD,20));
		name.setBounds(100,140,100,30);
		add(name);
		
	    nameTextField = new JTextField();
		nameTextField.setFont(new Font("Raleway",Font.BOLD,14));
		nameTextField.setBounds(300,140,400,30);
		add(nameTextField);
		

		JLabel fname = new JLabel("Father's Name:");
		fname.setFont(new Font("Raleway",Font.BOLD,20));
		fname.setBounds(100,190,200,30);
		add(fname);
		
	    fnameTextField = new JTextField();
		fnameTextField.setFont(new Font("Raleway",Font.BOLD,14));
		fnameTextField.setBounds(300,190,400,30);
		add(fnameTextField);
		
		JLabel dob = new JLabel("Date of Birth:");
		dob.setFont(new Font("Raleway",Font.BOLD,20));
		dob.setBounds(100,240,200,30);
		add(dob);
		
	    datechooser = new JDateChooser();
		datechooser.setBounds(300,240,400,30);
		datechooser.setForeground(new Color(105,105,105));
		add(datechooser);
		
		JLabel gender = new JLabel("Gender:");
		gender.setFont(new Font("Raleway",Font.BOLD,20));
		gender.setBounds(100,290,200,30);
		add(gender);
		
		male = new JRadioButton("Male");
		male.setBounds(300,290,60,30);
		male.setBackground(Color.white);
		add(male);
		
		female = new JRadioButton("Female");
		female.setBounds(450,290,90,30);
		female.setBackground(Color.white);
        add(female);
		
		ButtonGroup gendergroup = new ButtonGroup();
		gendergroup.add(female);
		gendergroup.add(male);
		
		JLabel email = new JLabel("Email Address:");
		email.setFont(new Font("Raleway",Font.BOLD,20));
		email.setBounds(100,340,200,30);
		add(email);
		
	    emailTextField = new JTextField();
		emailTextField.setFont(new Font("Raleway",Font.BOLD,14));
		emailTextField.setBounds(300,340,400,30);
		add(emailTextField);
		
		JLabel Martial = new JLabel("Martial Status:");
		Martial.setFont(new Font("Raleway",Font.BOLD,20));
		Martial.setBounds(100,390,200,30);
		add(Martial);
		
		married = new JRadioButton("Married");
		married.setBounds(300,390,100,30);
		married.setBackground(Color.white);
		add(married);
		
		unmarried = new JRadioButton("Unmarried");
		unmarried.setBounds(450,390,100,30);
		unmarried.setBackground(Color.white);
        add(unmarried);
        
        other = new JRadioButton("Other");
        other.setBounds(630,390,100,30);
		other.setBackground(Color.white);
        add(other);
		
		 ButtonGroup  maritalgroup = new ButtonGroup();
		 maritalgroup.add(married);
		 maritalgroup.add(unmarried);
		 maritalgroup.add(other);
		
		
		JLabel Adress = new JLabel("Address:");
		Adress.setFont(new Font("Raleway",Font.BOLD,20));
		Adress.setBounds(100,440,200,30);
		add(Adress);
		
		addressTextField = new JTextField();
		addressTextField.setFont(new Font("Raleway",Font.BOLD,14));
		addressTextField.setBounds(300,440,400,30);
		add(addressTextField);
		
		JLabel City = new JLabel("City:");
		City.setFont(new Font("Raleway",Font.BOLD,20));
		City.setBounds(100,490,200,30);
		add(City);
		
		cityTextField = new JTextField();
		cityTextField.setFont(new Font("Raleway",Font.BOLD,14));
		cityTextField.setBounds(300,490,400,30);
		add(cityTextField);
		
		
		
		JLabel State = new JLabel("State:");
		State.setFont(new Font("Raleway",Font.BOLD,20));
		State.setBounds(100,540,200,30);
		add(State);
		
		StateTextField = new JTextField();
		StateTextField.setFont(new Font("Raleway",Font.BOLD,14));
		StateTextField.setBounds(300,540,400,30);
		add(StateTextField);
		
		JLabel Pincode = new JLabel("Pin Code:");
		Pincode.setFont(new Font("Raleway",Font.BOLD,20));
		Pincode.setBounds(100,590,200,30);
		add(Pincode);
		
		PincodeTextField = new JTextField();
		PincodeTextField.setFont(new Font("Raleway",Font.BOLD,14));
		PincodeTextField.setBounds(300,590,400,30);
		add(PincodeTextField);
		
		
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
		String formno = "" + Random;
		String name = nameTextField.getText();
		String fname = fnameTextField.getText();
		String dob = ((JTextField) datechooser.getDateEditor().getUiComponent()).getText();
		String gender = null;
	
		if(male.isSelected()) {
			gender = "Male";
		}else if(female.isSelected()) {
			gender = "FeMale";
		}
		
		String email = emailTextField.getText();
		String marital = null;
		if(married.isSelected()) {
			marital ="Married";
		} else if(unmarried.isSelected()) {
			marital ="UnMarried";
		}else if(other.isSelected()) {
			marital = "Other";
		}
		String address = addressTextField.getText();
		String city = cityTextField.getText();
		String state = StateTextField.getText();
		String pincode = PincodeTextField.getText();
		try {
			if(name.equals("")) {
				JOptionPane.showMessageDialog(null,"Name is Required");
			}else {
				Conn c = new Conn();
				String query = "insert into signup values('"+formno+"', '"+name+"' , '"+fname+"' , '"+dob+"' , '"+gender+"' , '"+email+"', '"+marital+"', '"+address+"','"+city+"','"+pincode+"','"+state+"')";
			    c.s.executeUpdate(query);
			    
			    setVisible(false);
			    new Signup2(formno).setVisible(true);
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
	
	}
public static void main(String[] args) {
	new Signup1("");
}
}
