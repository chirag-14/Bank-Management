package com.AtmMachine;                                            
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Signup3 extends JFrame implements ActionListener{
	
	JRadioButton r1,r2,r3,r4;
	JCheckBox e1,e2,e3,e4,e5,e6,e7;
	JButton submit,cancel;
    String formno;
	
	
	Signup3(String formno){
		this.formno = formno;
		setLayout(null);
		JLabel l1 = new JLabel("Page 3: Account Details");
		l1.setFont(new Font("Raleway",Font.BOLD,22));
		l1.setBounds(280,40,400,40);
		add(l1);
		
		
		JLabel type = new JLabel("Account Type");
		type.setFont(new Font("Raleway",Font.BOLD,22));
		type.setBounds(100,140,200,30);
		add(type);
		
		r1 = new JRadioButton("Saving Account");
		r1.setFont(new Font("Raleway",Font.BOLD,16));
		r1.setBackground(Color.WHITE);
		r1.setBounds(100,180,150,20);
		add(r1);
		
		r2 = new JRadioButton("Fixed Deposit Account");
		r2.setFont(new Font("Raleway",Font.BOLD,16));
		r2.setBackground(Color.WHITE);
		r2.setBounds(350,180,250,20);
		add(r2);
		
		r3 = new JRadioButton("Current Account");
		r3.setFont(new Font("Raleway",Font.BOLD,16));
		r3.setBackground(Color.WHITE);
		r3.setBounds(100,220,250,20);
		add(r3);
		
		r4 = new JRadioButton("Recurring Deposit Account");
		r4.setFont(new Font("Raleway",Font.BOLD,16));
		r4.setBackground(Color.WHITE);
		r4.setBounds(350,220,250,20);
		add(r4);
		
		ButtonGroup groupaccount = new ButtonGroup();
		groupaccount.add(r1);
		groupaccount.add(r2);
		groupaccount.add(r3);
		groupaccount.add(r4);
		
		JLabel card = new JLabel("Card Number");
		card.setFont(new Font("Raleway",Font.BOLD,22));
	    card.setBounds(100,300,200,30);
		add(card);
		
		JLabel number = new JLabel("xxxx-xxxx-xxxx-4184");
		number.setFont(new Font("Raleway",Font.BOLD,22));
		number.setBounds(330,300,200,30);
		add(number);
		
		JLabel carddetail = new JLabel("Your is 16 Digit Card Number");
		carddetail.setFont(new Font("Raleway",Font.BOLD,12));
		carddetail.setBounds(100,330,200,20);
		add(carddetail );
		
		JLabel pin = new JLabel("PIN:");
		pin.setFont(new Font("Raleway",Font.BOLD,22));
		pin.setBounds(100,370,200,30);
		add(pin);
		
		JLabel pnumber = new JLabel("xxxx");
		pnumber.setFont(new Font("Raleway",Font.BOLD,22));
		pnumber.setBounds(330,370,300,30);
		add(pnumber);
		
        JLabel pindetail = new JLabel("Your is 4 Digit Card Password");
	    pindetail.setFont(new Font("Raleway",Font.BOLD,12));
		pindetail.setBounds(100,400,200,20);
		add(pindetail);
		
		JLabel services = new JLabel("Service Required:");
		services.setFont(new Font("Raleway",Font.BOLD,18));
		services.setBounds(100,450,200,30);
		add(services);
		
		e1 = new JCheckBox("ATM CARD");
		e1.setBackground(Color.WHITE);
		e1.setFont(new Font("Raleway",Font.BOLD,16));
		e1.setBounds(100,500,200,30);
		add(e1);
		
		e2 = new JCheckBox("Internet Banking");
		e2.setBackground(Color.WHITE);
		e2.setFont(new Font("Raleway",Font.BOLD,16));
		e2.setBounds(350,500,200,30);
		add(e2);
		
		e3 = new JCheckBox("Mobile Banking");
		e3.setBackground(Color.WHITE);
		e3.setFont(new Font("Raleway",Font.BOLD,16));
		e3.setBounds(100,550,200,30);
		add(e3);
		
		e4 = new JCheckBox("EMAIL & SMS Alerts");
		e4.setBackground(Color.WHITE);
		e4.setFont(new Font("Raleway",Font.BOLD,16));
		e4.setBounds(350,550,200,30);
		add(e4);
		
		e5 = new JCheckBox("Cheque Book");
		e5.setBackground(Color.WHITE);
		e5.setFont(new Font("Raleway",Font.BOLD,16));
		e5.setBounds(100,600,200,30);
		add(e5);
		
		e6 = new JCheckBox("E-STatement");
		e6.setBackground(Color.WHITE);
		e6.setFont(new Font("Raleway",Font.BOLD,16));
		e6.setBounds(350,600,200,30);
		add(e6);
		
		e7 = new JCheckBox("I Herby declares that the above entered details are correct to the best of my knowledge");
		e7.setBackground(Color.WHITE);
		e7.setFont(new Font("Raleway",Font.BOLD, 12));
		e7.setBounds(100,680,600,30);
		add(e7);
		
		submit = new JButton("Submit");
		submit.setBackground(Color.BLACK);
		submit.setForeground(Color.white);
		submit.setFont(new Font("Railway",Font.BOLD,14));
		submit.setBounds(250,720,100,30);
		submit.addActionListener(this);
		add(submit);
		
	    cancel = new JButton("Cancel");
	    cancel.setBackground(Color.BLACK);
	    cancel.setForeground(Color.white);
	    cancel.setFont(new Font("Railway",Font.BOLD,14));
	    cancel.setBounds(420,720,100,30);
	    cancel.addActionListener(this);
		add(cancel);
		
		getContentPane().setBackground(Color.WHITE);
		
		
		setSize(850,820);
		setLocation(350,0);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()== submit) {
			String accountType= null;
			if(r1.isSelected()) {
				accountType = "Savings account";
			} else if(r2.isSelected()) {
			    accountType = "Fixed Deposit Account";
			}  	else if(r3.isSelected()) {
				accountType = "Current Account";
				} else if(r4.isSelected()) {
					accountType = "Reccuring Deposit Account";
			}
			Random random = new Random();
			String cardnumber= "" +  Math.abs((random.nextLong() % 90000000L) + 504093600000000L);
			
			String pinnumber = ""  +  Math.abs((random.nextLong() % 9000L)+ 1000L);
			String facility = "";
			if(e1.isSelected()) {
				facility = facility + " ATM CArd";
			} else if(e2.isSelected()) {
				facility = facility + " Internet Banking";
			} else if(e3.isSelected()) {
				facility = facility +" Mobile Banking";
			} else if(e4.isSelected()) {
				facility = facility + " Email& SMS Alerets";
			} else if(e5.isSelected()) {
				facility = facility + " Cheque Book";
			} else if(e6.isSelected()) {
				facility = facility + " E-Statement";	
			}
			
			try {
				if(accountType.equals("")) {
					JOptionPane.showMessageDialog(null,"Account Type is Required");
				}else {
					Conn conn = new Conn();
		            String query1 = "insert into signup3 values('"+formno+"','"+accountType+"','"+cardnumber+"','"+pinnumber+"','"+facility+"')";
		            String query2 = "insert into login   values('"+formno+"','"+cardnumber+"','"+pinnumber+"')";
	                conn.s.executeUpdate(query1);
	                conn.s.executeUpdate(query2);
	                 
	                JOptionPane.showInternalMessageDialog( null,"cardnumber: "+ cardnumber +  "\n Pin: "+ pinnumber);
				
				    
	                setVisible(false);
	                new Deposit(pinnumber).setVisible(false);
				}
				
				}catch(Exception e) {
				System.out.println(e);
			}
			
		}else if(ae.getSource()== cancel) {
			setVisible(false);
			new Login().setVisible(true);
			
			
		}
	}

public static void main(String[] args) {
	new Signup3("");
	
}
}
