package AirlineReservation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Transaction extends passenger{
	JFrame transactionFrame;
	JButton Payment, PaymentCancel;
	JPanel TransactionPanel;
	JLabel transactionProcessingFeeLabel, taxfee, fare, baggage, insurance, totalPayment, 
			airlineType,travelType, passengerDestination, passengerName, passengerAge,
			printName, printAge, printAirlineType, printTravelType, printDestination, 
			printProcessingFee, printTax, printFare, printBaggageFee, printInsuranceFee ,
			printTotalPayment, totalPassenger, printTotalPassenger;
	void transactionMethod() {
		transactionFrame = new JFrame("PEROSA AIRLINE");
		transactionFrame.setBounds(400,100,500,500);
		transactionFrame.setVisible(true);
		transactionFrame.setLayout(null);
    	transactionFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	transactionFrame.setResizable(false);
    	
    	
    	  
    	
    	
        TransactionPanel = new JPanel();
        
        transactionFrame.getContentPane().add(TransactionPanel);
        TransactionPanel.setLayout(null);
        TransactionPanel.setBackground(Color.WHITE);
        TransactionPanel.setBounds(100,20,300,300);
        
        
        
        //mula dito 
        
        passengerName = new JLabel("Name:");
        TransactionPanel.add(passengerName);
        passengerName.setBounds(10,0,120,30);
        
        passengerAge = new JLabel("Age:");
        TransactionPanel.add(passengerAge);
        passengerAge.setBounds(10,20,120,30);
        
        airlineType = new JLabel("Airline Type" );
        TransactionPanel.add(airlineType);
        airlineType.setBounds(10,40,120,30);
        
        travelType = new JLabel("Travel Type" );
        TransactionPanel.add(travelType);
        travelType.setBounds(10,60,120,30);
        
        passengerDestination = new JLabel("Destination" );
        TransactionPanel.add(passengerDestination);
        passengerDestination.setBounds(10,80,120,30);
        
        
        
        transactionProcessingFeeLabel = new JLabel("transaction Fee:  " );
        TransactionPanel.add(transactionProcessingFeeLabel);
        transactionProcessingFeeLabel.setBounds(10,100,420,30);
        
        taxfee = new JLabel("transaction Tax:  " );
        TransactionPanel.add(taxfee);
        taxfee.setBounds(10,120,420,30);
        
        fare = new JLabel("Fare:  ");
        TransactionPanel.add(fare);
        fare.setBounds(10,140,420,30);
        
        baggage = new JLabel("baggage Fee:  " );
        TransactionPanel.add(baggage);
        baggage.setBounds(10,160,420,30);
        
        insurance = new JLabel("insurance Fee:  ");
        TransactionPanel.add(insurance);
        insurance.setBounds(10,180,420,30);
        insurance.setVisible(false);
        
        totalPassenger = new JLabel("Total Passenger:");
        TransactionPanel.add(totalPassenger);
        totalPassenger.setBounds(10,200,420,30);
        
        totalPayment = new JLabel("Total Payment:  ");
        TransactionPanel.add(totalPayment);
        totalPayment.setBounds(10,220,420,30);
        
        // hanggang dito ka mag set bounds 

        Payment = new JButton("Pay");
        TransactionPanel.add(Payment);
        Payment.setBounds(20,270,120,30);
        Payment.addActionListener(this);
        
        //dito ka mag set ng bg color
       
        
        PaymentCancel = new JButton("Cancel");
        TransactionPanel.add(PaymentCancel);
        PaymentCancel.setBounds(150,270,120,30);
        PaymentCancel.addActionListener(this);
        
        
        //dito ka mag set ng bg color
        
       
        printName = new JLabel(""+ PassengerAll[TransactionCounting][1]);
        TransactionPanel.add(printName);
        printName.setBounds(150,0,120,30);
        
        
        printAge = new JLabel(""+ PassengerAll[TransactionCounting][2]);
        TransactionPanel.add(printAge);
        printAge.setBounds(150,20,120,30);
        
        
        printAirlineType = new JLabel(""+ PassengerAll[TransactionCounting][3]);
        TransactionPanel.add(printAirlineType);
        printAirlineType.setBounds(150,40,120,30);
        
        printTravelType = new JLabel(""+ PassengerAll[TransactionCounting][4]);
        TransactionPanel.add(printTravelType);
        printTravelType.setBounds(150,60,120,30);
        
        printDestination = new JLabel(""+ PassengerAll[TransactionCounting][5]);
        TransactionPanel.add(printDestination);
        printDestination.setBounds(150,80,120,30);
        
        printProcessingFee = new JLabel(""+ PassengerAll[TransactionCounting][6]);
        TransactionPanel.add(printProcessingFee);
        printProcessingFee.setBounds(150,100,120,30);
        
        printTax = new JLabel(""+ PassengerAll[TransactionCounting][7]);
        TransactionPanel.add(printTax);
        printTax.setBounds(150,120,120,30);
        

        printFare = new JLabel(""+ PassengerAll[TransactionCounting][8]);
        TransactionPanel.add(printFare);
        printFare.setBounds(150,140,120,30);
        
        
        printBaggageFee = new JLabel(""+ PassengerAll[TransactionCounting][9]);
        TransactionPanel.add(printBaggageFee);
        printBaggageFee.setBounds(150,160,120,30);
        
        printInsuranceFee = new JLabel("" + PassengerAll[TransactionCounting][10]);
        TransactionPanel.add(printInsuranceFee);
        printInsuranceFee.setBounds(150,180,120,30);
        
        printTotalPassenger = new JLabel(""+ PassengerAll[TransactionCounting][12]);
        TransactionPanel.add(printTotalPassenger);
        printTotalPassenger.setBounds(150,200,120,30);
        
        printTotalPayment = new JLabel("Dito ilalagay payment");
        TransactionPanel.add(printTotalPayment);
        printTotalPayment.setBounds(150,220,120,30);
        
        
	}  
        @Override
    	public void actionPerformed(ActionEvent e) {
        	if(e.getSource()==Payment) {
        	Receipt Receipt = new Receipt();
        	 Receipt.receiptMethod();
        	 transactionFrame.dispose();  
        	}
        	 
        	else if(e.getSource()==PaymentCancel) {
        		
        		
        		passenger passenger = new passenger();
        		passenger.passengerDetails(); 
        		transactionFrame.dispose();  
        		
        	}
    
	
	}
}

