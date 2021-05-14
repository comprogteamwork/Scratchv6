package AirlineReservation;
import javax.swing.*;


import java.awt.*;
import java.awt.event.*;

public class AirlineType implements ActionListener{
	JFrame airplaneType;
    JButton buttonPrivate, buttonPublic, buttonRegular ;
   
    
    public static  String PassengerAll[][] = new String[1350][13];
    public static int OverAllTransaction = 0 , TransactionCounting;
    
    /* index 0 = control number
     	index 1 = name
     	index 2 = age
     	index 3 = airplane type
     	index 4 = travel type
     	index 5 = destination
     	index 6 = transaction fee
     	index 7 = transaction tax
     	index 8 = Fare
     	index 9 = baggage fee
     	index 10 =insurance
     	index 11 =total payment
     	index 12 =total passenger
     */
    
    
    public void Airplane(){ 
    	airplaneType = new JFrame("PEROSA AIRLINE");
    	airplaneType.setBounds(400,100,500,500);
    	airplaneType.setVisible(true);
    	airplaneType.setLayout(null);
    	airplaneType.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	airplaneType.setResizable(false);
    	
    	
    	  
        JPanel airplaneTypePanel = new JPanel();
        airplaneType.getContentPane().add(airplaneTypePanel);
        airplaneTypePanel.setLayout(null);
        airplaneTypePanel.setBackground(Color.white);
        airplaneTypePanel.setBounds(100,20,300,300);
        
        JLabel chooseAirplaneType = new JLabel("Choose Airplane Type");
        airplaneTypePanel.add(chooseAirplaneType);
        chooseAirplaneType.setBounds(90,40,150,30);
       

        
        buttonPrivate = new JButton("Private");
        buttonPublic = new JButton("Business");
        buttonRegular = new JButton("Regular Fare");
   
        
        airplaneTypePanel.add(buttonPrivate);
        airplaneTypePanel.add(buttonPublic);
        airplaneTypePanel.add(buttonRegular);
        
        
        buttonPrivate.setBounds(90,100,150,30);
        buttonPublic.setBounds(90,150,150,30);
        buttonRegular.setBounds(90,200,150,30);
        
        buttonPrivate.setBackground(Color.PINK);
        buttonPublic.setBackground(Color.PINK);
        buttonRegular.setBackground(Color.PINK);
        
        buttonPrivate.addActionListener(this);
        buttonPublic.addActionListener(this);
        buttonRegular.addActionListener(this);
    	
    }


	@Override
	public void actionPerformed(ActionEvent e) {
		Destination Destination = new Destination();
		 if(e.getSource()== buttonPrivate ){
		
			 PassengerAll[TransactionCounting][3] = "Private";
			 PassengerAll[TransactionCounting][6] =  "550";
			 PassengerAll[TransactionCounting][7] = "4260";
			 PassengerAll[TransactionCounting][9] = "1250";
			 System.out.println(TransactionCounting);
			 System.out.println(PassengerAll[TransactionCounting][3]);
			 System.out.println("Processing Fee	: "+ PassengerAll[TransactionCounting][6]);
			 System.out.println("Travel Tax	: "+PassengerAll[TransactionCounting][7]);
			 System.out.println("Baggage Fee	: "+PassengerAll[TransactionCounting][9]);
			 
			 
			 ++OverAllTransaction;
			 TransactionCounting = OverAllTransaction - 1;	
			 
			 Destination.DestinationInformation();
			 airplaneType.dispose();
			 
         }else if(e.getSource()== buttonPublic){
        	 PassengerAll[TransactionCounting][3] =  "Business";   	 
        	 PassengerAll[TransactionCounting][6] =  "550"; 
        	 PassengerAll[TransactionCounting][7] =  "5700";
        	 PassengerAll[TransactionCounting][9] = "2850";
        	 System.out.println(TransactionCounting);
        	 System.out.println(PassengerAll[TransactionCounting][3]);
        	 System.out.println("Processing Fee	: "+PassengerAll[TransactionCounting][6]);
        	 System.out.println("Travel Tax	: "+PassengerAll[TransactionCounting][7] );
        	 System.out.println("Baggage Fee	: "+PassengerAll[TransactionCounting][9]);
     		
        	 ++OverAllTransaction;
        	 TransactionCounting = OverAllTransaction - 1;
			 //System.out.println(TransactionCounting);
  
        	 Destination.DestinationInformation();
        	 airplaneType.dispose();
        	 
         }else if(e.getSource()== buttonRegular){      	
        	 
        	PassengerAll[TransactionCounting][3] = "Regular";
        	PassengerAll[TransactionCounting][6] = "225"; 
        	PassengerAll[TransactionCounting][7] = "2500";
        	PassengerAll[TransactionCounting][9] = "950";
        	System.out.println(TransactionCounting);
          	System.out.println(PassengerAll[TransactionCounting][3]);
          	System.out.println("Processing Fee	: "+PassengerAll[TransactionCounting][6]);
          	System.out.println("Travel Tax	: "+PassengerAll[TransactionCounting][7]);
          	System.out.println("Baggage Fee	: "+PassengerAll[TransactionCounting][9]);
      		
        	 ++OverAllTransaction;
        	 TransactionCounting = OverAllTransaction - 1;
        	
        	
        	 
        	 Destination.DestinationInformation();
        	 airplaneType.dispose();
          }
	}	
}
