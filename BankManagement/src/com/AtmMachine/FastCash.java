package com.AtmMachine;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.Date;

public   class FastCash extends JFrame implements ActionListener{

	

	JButton Deposit,fastcash,pinchange,Withdrawal,ministatement,Balanceenquiry,Back;
	String pinnumber;

	
	FastCash(String pinnumber) {
		setLayout(null);
		this.pinnumber = pinnumber;
		
		
		
	ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons1/atm.jpg"));
	Image i2 = i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
	ImageIcon i3 = new ImageIcon(i2);
	JLabel image = new JLabel(i3);
	image.setBounds(0,0,900,900);
	add(image);
	
	JLabel text = new JLabel("Please select your Withdrawal");
	text.setBounds(220,300,700,35);
	text.setForeground(Color.WHITE);
	text.setFont(new Font("System",Font.BOLD,16));
	image.add(text);

	    Deposit =new JButton("Rs 100");
		Deposit.setBounds(170,415,150,30);
		Deposit.addActionListener(this);
		image.add(Deposit);
		
		Withdrawal =new JButton("Rs 500");
		Withdrawal.setBounds(355,415,150,30);
		Withdrawal.addActionListener(this);
		image.add(Withdrawal);
		
		JButton fastcash =new JButton("Rs 1000");
		fastcash.setBounds(170,450,150,30);
		fastcash.addActionListener(this);
		image.add(fastcash);
		

		ministatement =new JButton("Rs 2000");
		ministatement.setBounds(355,450,150,30);
		ministatement.addActionListener(this);
		image.add(ministatement);
		
	    pinchange =new JButton("Rs 5000");
		pinchange.setBounds(170,485,150,30);
		pinchange.addActionListener(this);
		image.add(pinchange);
		
		Balanceenquiry =new JButton("Rs 10000");
		Balanceenquiry.setBounds(355,485,150,30);
		Balanceenquiry.addActionListener(this);
		image.add(Balanceenquiry);
		
	    Back = new JButton("Back");
	    Back.setBounds(355,520,150,30);
	    Back.addActionListener(this);
	    image.add(Back);
		
		setSize(900,900);
		setLocation(300,0);
		setUndecorated(true);
		setVisible(true);
		
	}
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == Back) {
		   setVisible(false);
		   new Transactions(pinnumber).setVisible(true);
	}   
	    else {
		String amount =((JButton)ae.getSource()).getText().substring(3);
		Conn c = new Conn();
		try {
			ResultSet rs = c.s.executeQuery("select * from mbank where pin = '"+pinnumber+"'");
			int balance = 0;
			while(rs.next()) {
				if(rs.getString("type").equals("Deposit")) {
					balance += Integer.parseInt(rs.getString("amount"));
				} else {
					balance -= Integer.parseInt(rs.getString("amount"));
				}
		   }
			  
			    if(ae.getSource() != Back  && balance < Integer.parseInt(amount)) {
			    	JOptionPane.showMessageDialog(null,"Insufficient Balanace");
			    	return;
			    }
			    
			    Date date = new Date();
			    String query = "insert into mbank values('"+pinnumber+"','"+date+"', 'Withdrawal', '"+amount+"')";
			    c.s.executeUpdate(query);
			    JOptionPane.showMessageDialog(null, "Rs "+ amount +" Deposited Successfully");
			    
			    setVisible(false);
			    new Transactions(pinnumber).setVisible(true);
			    }catch (Exception e){
			      System.out.println(e);
		        }
		  }
	}

public static void main(String[] args) {
	new FastCash("");
}
}

