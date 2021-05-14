 package AirlineReservation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Receipt extends Transaction{
	JFrame receiptFrame;
	JPanel receiptPanel;
	JButton confirm, cancelReceipt;
	JLabel name, age, travelType, airplaneType, travelDestination;
	
	void receiptMethod() {
		receiptFrame = new JFrame("PEROSA AIRLINE");
		receiptFrame.setBounds(400,100,500,500);
		receiptFrame.setVisible(true);
		receiptFrame.setLayout(null);
		receiptFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		receiptFrame.setResizable(false);
		
		
		receiptPanel = new JPanel();
		receiptFrame.getContentPane().add(receiptPanel);
		receiptPanel.setLayout(null);
		receiptPanel.setBackground(Color.WHITE);
		receiptPanel.setBounds(100,20,300,300);
	
	
	
		name = new JLabel("Name:");
		receiptPanel.add(name);
		name.setBounds(10,50,420,30);
		
		age = new JLabel("Age:");
		receiptPanel.add(age);
		age.setBounds(10,80,420,30);
		
		travelType = new JLabel("Travel Type:");
		receiptPanel.add(travelType);
		travelType.setBounds(10,100,420,30);
		
		airplaneType = new JLabel("Airplane Type:");
		receiptPanel.add(airplaneType);
		airplaneType.setBounds(10,120,420,30);
		
		travelDestination = new JLabel("Travel Destination:");
		receiptPanel.add(travelDestination);
		travelDestination.setBounds(10,150,420,30);
		
		confirm = new JButton("Payment Done");
		receiptPanel.add(confirm);
		confirm.setBounds(20,200,120,40);
		confirm.addActionListener(this);
		
		cancelReceipt = new JButton("Cancel");
		receiptPanel.add(cancelReceipt);
        cancelReceipt.setBounds(190,200,100,40);
        cancelReceipt.addActionListener(this);
		
		
	}
	public void actionPerformed(ActionEvent e) {
		AirlineType jonnyPassenger = new AirlineType();
        
		if(e.getSource()==confirm) {
		int bookAgain = JOptionPane.showConfirmDialog(null, "Do you Want to Book Another Ticket?");
		
		if(bookAgain == 0) {
			
			jonnyPassenger.Airplane();
			receiptFrame.dispose();
			
		}
		else if (bookAgain==1) {
			System.exit(0);
		}
		
	}
		if(e.getSource()==cancelReceipt) {
			Transaction Transaction = new Transaction();
			Transaction.transactionMethod();
			receiptFrame.dispose();
			
		}
	}
}