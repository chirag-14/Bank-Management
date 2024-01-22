package com.AtmMachine;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
import java.sql.SQLException;

import javax.swing.*;
public class Deposit extends JFrame implements ActionListener{
	

	JTextField text,amount;
	JButton Deposit,Back;
	String pinnumber;

	Deposit(String pinnumber){
		this.pinnumber = pinnumber;
		setLayout(null);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons1/atm.jpg"));
		Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
		ImageIcon i3 =  new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(0,0,900,900);
		add(image);
		
		JLabel text = new JLabel("Enter the amount you want to deposit");
		text.setForeground(Color.white);
		text.setFont(new Font("System",Font.BOLD,16));
		text.setBounds(170,300,400,20);
		image.add(text);
		
		amount = new JTextField();
		amount.setFont(new Font("Raleway",Font.BOLD,22));
		amount.setBounds(170,350,320,25);
		image.add(amount);
		
		Deposit = new JButton("Deposit");
		Deposit.setBounds(355,485,150,30);
		Deposit.addActionListener(this);
		image.add(Deposit);
		
		Back = new JButton("Back");
		Back.setBounds(355,520,150,30);
		Back.addActionListener(this);
		image.add(Back);
		
		setSize(900,900);
		setLocation(300,0);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == Deposit) {
			String number = amount.getText();
			Date date = new Date();
			if(number.equals("")) {
				JOptionPane.showMessageDialog(null,"Please enter the amount you want to deposit");
				
			} else {
				try {
				Conn conn = new Conn();
				String query = "insert into mbank values('"+pinnumber+"', '"+date+"', 'Deposit','"+number+"')";
					conn.s.executeUpdate(query);
					JOptionPane.showMessageDialog(null, "Rs "+number+" Deposited Successfully");
					setVisible(false);
					new Transactions(pinnumber).setVisible(true);
				} catch (SQLException e) {
					e.printStackTrace();
				}

				
			}
		}   else if(ae.getSource() == Back) {
			setVisible(false);
			new Transactions(pinnumber).setVisible(true);
			
		}
		
		}
	 public static void main(String[] args) {
	 new Deposit("");
}
}

