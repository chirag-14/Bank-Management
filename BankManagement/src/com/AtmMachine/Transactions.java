package com.AtmMachine;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public   class Transactions extends JFrame implements ActionListener{

	
	JButton Deposit,fastcash,pinchange,Withdrawal,ministatement,Balanceenquiry,Exit;
	String pinnumber;
	
	Transactions(String pinnumber) {
		setLayout(null);
		this.pinnumber = pinnumber;
		
		
		
	ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons1/atm.jpg"));
	Image i2 = i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
	ImageIcon i3 = new ImageIcon(i2);
	JLabel image = new JLabel(i3);
	image.setBounds(0,0,900,900);
	add(image);
	
	JLabel text = new JLabel("Please select your Transaction");
	text.setBounds(220,300,700,35);
	text.setForeground(Color.WHITE);
	text.setFont(new Font("System",Font.BOLD,16));
	image.add(text);

	    Deposit =new JButton("Deposit");
		Deposit.setBounds(170,415,150,30);
		Deposit.addActionListener(this);
		image.add(Deposit);
		
		Withdrawal =new JButton("Withdrawal");
		Withdrawal.setBounds(355,415,150,30);
		Withdrawal.addActionListener(this);
		image.add(Withdrawal);
		
	    fastcash =new JButton("fastcash");
		fastcash.setBounds(170,450,150,30);
		fastcash.addActionListener(this);
		image.add(fastcash);
		

		ministatement = new JButton("ministatement");
		ministatement.setBounds(355,450,150,30);
		ministatement.addActionListener(this);
		image.add(ministatement);
		
	    pinchange =new JButton("pinchange");
		pinchange.setBounds(170,485,150,30);
		pinchange.addActionListener(this);
		image.add(pinchange);
		
		Balanceenquiry =new JButton("Balance Enquiry");
		Balanceenquiry.setBounds(355,485,150,30);
		Balanceenquiry.addActionListener(this);
		image.add(Balanceenquiry);
		
	    Exit =new JButton("Exit");
        Exit.setBounds(355,520,150,30);
        Exit.addActionListener(this);
		image.add(Exit);
		
		setSize(900,900);
		setLocation(300,0);
		setUndecorated(true);
		setVisible(true);
		
	}
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == Exit) {
			System.exit(0);
			
	}   else if(ae.getSource() == Deposit) {
		setVisible(false);
		new Deposit(pinnumber).setVisible(true);
		
	}   else if(ae.getSource() == Withdrawal) {
		setVisible(false);
		new  Withdrawal(pinnumber).setVisible(true);
		
	}   else if(ae.getSource()== fastcash) {
		setVisible(false);
		new FastCash(pinnumber).setVisible(true);
	
	}   else if(ae.getSource()== pinchange) {
		setVisible(false);
		new PinChange(pinnumber).setVisible(true);
	
	}   else if(ae.getSource()== Balanceenquiry) {
		setVisible(false);
		new BalanceEnquiry(pinnumber).setVisible(true);
	
	}   else if(ae.getSource()== ministatement) {
		new MiniStatement(pinnumber).setVisible(true);
	}
	
	}
	public static void main(String[] args) {
		new Transactions("");
	}
}
