package AirlineReservation;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Destination extends AirlineType {
	static int confirmationButton = 0;
	
	JFrame Destination;
	JButton buttonLocal, buttonInternational, nextPassengerDetails, cancelDestination;
	JComboBox comboBoxInternational, comboBoxLocal, defaultComboBox;
	JLabel chooseTravelType;
	JPanel DestinationPanel;

	public static String International[] = new String[6], Local[] = new String[4];
	int selectedValuesLocal, selectedValuesInternational, passengerFare;

	void DestinationInformation() {
	

		Destination = new JFrame("PEROSA AIRLINA");
		Destination.setBounds(400, 100, 500, 500);
		Destination.setVisible(true);
		Destination.setLayout(null);
		Destination.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Destination.setResizable(true);

		DestinationPanel = new JPanel();
		DestinationPanel.setLayout(null);
		Destination.getContentPane().add(DestinationPanel);
		Destination.setLayout(null);

		chooseTravelType = new JLabel("Choose Travel Type");
		DestinationPanel.add(chooseTravelType);
		DestinationPanel.setBackground(Color.WHITE);
		DestinationPanel.setBounds(100, 20, 300, 300);

		buttonLocal = new JButton("Local");
		buttonInternational = new JButton("International");

		DestinationPanel.add(buttonLocal);
		DestinationPanel.add(buttonInternational);

		chooseTravelType.setBounds(90, 10, 120, 40);
		buttonLocal.setBounds(90, 100, 120, 30);
		buttonInternational.setBounds(90, 150, 120, 30);

		buttonLocal.addActionListener(this);
		buttonInternational.addActionListener(this);

		String[] Default = { "--Choose Destination--" };
		defaultComboBox = new JComboBox(Default);
		DestinationPanel.add(defaultComboBox);
		defaultComboBox.setBounds(90, 220, 150, 30);

		Local[0] = "Manila to Batanes";
		Local[1] = "Batanes to Manila";
		Local[2] = "Manila to Palawan";
		Local[3] = "Palawan to Manila";

		comboBoxLocal = new JComboBox(Local);
		comboBoxLocal.setVisible(false);
		DestinationPanel.add(comboBoxLocal);
		comboBoxLocal.setBounds(90, 220, 150, 30);

		International[0] = "Manila to South Korea";
		International[1] = "South Korea to Manila";
		International[2] = "Manila toJapan";
		International[3] = "Japan to Manila";
		International[4] = "Manila to Taiwan";
		International[5] = "Taiwan to Manila";

		comboBoxInternational = new JComboBox(International);
		comboBoxInternational.setVisible(false);
		DestinationPanel.add(comboBoxInternational);
		comboBoxInternational.setBounds(90, 220, 150, 30);

		nextPassengerDetails = new JButton("Proceed");
		DestinationPanel.add(nextPassengerDetails);
		nextPassengerDetails.setBounds(20, 270, 90, 30);
		nextPassengerDetails.addActionListener(this);

		cancelDestination = new JButton("Cancel");
		DestinationPanel.add(cancelDestination);
		cancelDestination.setBounds(190, 270, 80, 30);
		cancelDestination.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == buttonLocal) {
			PassengerAll[TransactionCounting][4] = "Local";
			System.out.println(PassengerAll[TransactionCounting][4]);
			comboBoxLocal.setVisible(true);
			comboBoxInternational.setVisible(false);
			defaultComboBox.setVisible(false);
			confirmationButton = 1;

		} else if (e.getSource() == buttonInternational) {

			PassengerAll[TransactionCounting][4] = "International";
			System.out.println(PassengerAll[TransactionCounting][4]);
			comboBoxInternational.setVisible(true);
			comboBoxLocal.setVisible(false);
			defaultComboBox.setVisible(false);
			confirmationButton = 2;

		} else if (e.getSource() == nextPassengerDetails) {
			selectedValuesLocal = comboBoxLocal.getSelectedIndex();
			selectedValuesInternational = comboBoxInternational.getSelectedIndex();

			if (confirmationButton == 1) {
				// saving local destination data to two dimensional array
				if (selectedValuesLocal == 0) {
					PassengerAll[TransactionCounting][5] = Local[0];
							if (PassengerAll[TransactionCounting][3] == "Private") {
								PassengerAll[TransactionCounting][8] = "8000";

							} else if (PassengerAll[TransactionCounting][3] == "Business") {
								PassengerAll[TransactionCounting][8] = "12500";

							} else if (PassengerAll[TransactionCounting][3] == "Regular") {

								PassengerAll[TransactionCounting][8] = "3500";
							}
							
				}else if (selectedValuesLocal == 1) {
					PassengerAll[TransactionCounting][5] = Local[1];
							if (PassengerAll[TransactionCounting][3] == "Private") {
								PassengerAll[TransactionCounting][8] = "9800";
		
							}else if (PassengerAll[TransactionCounting][3] == "Business") {
									PassengerAll[TransactionCounting][8] = "12950";
			
							}else if (PassengerAll[TransactionCounting][3] == "Regular") {
			
									PassengerAll[TransactionCounting][8] = "3900";
							}
									System.out.println(Local[1]);

				}else if (selectedValuesLocal == 2) {
					PassengerAll[TransactionCounting][5] = Local[2];
							if (PassengerAll[TransactionCounting][3] == "Private") {
								PassengerAll[TransactionCounting][8] = "9100";
		
							} else if (PassengerAll[TransactionCounting][3] == "Business") {
								PassengerAll[TransactionCounting][8] = "10500";
		
							} else if (PassengerAll[TransactionCounting][3] == "Regular") {
		
								PassengerAll[TransactionCounting][8] = "3200";
							}
							System.out.println(Local[2]);

				}else if (selectedValuesLocal == 3) {
					PassengerAll[TransactionCounting][5] = Local[3];
							if (PassengerAll[TransactionCounting][3] == "Private") {
								PassengerAll[TransactionCounting][8] = "9850";
			
							} else if (PassengerAll[TransactionCounting][3] == "Business") {
								PassengerAll[TransactionCounting][8] = "10975";
			
							} else if (PassengerAll[TransactionCounting][3] == "Regular") {
			
								PassengerAll[TransactionCounting][8] = "3575";
							}
				}
					passenger passenger = new passenger();
					passenger.passengerDetails();
					Destination.dispose();
				
			
			}else if (confirmationButton == 2) {
				
					// Manila to South Korea
					if (selectedValuesInternational == 0) {
						PassengerAll[TransactionCounting][5] = International[0];
							if (PassengerAll[TransactionCounting][3] == "Private") {
								PassengerAll[TransactionCounting][8] = "27450";
			
							}else if (PassengerAll[TransactionCounting][3] == "Business") {
								PassengerAll[TransactionCounting][8] = "37390";
			
							}else if (PassengerAll[TransactionCounting][3] == "Regular") {
								PassengerAll[TransactionCounting][8] = "12055";
								
						
					//South Korea to Manila
					} else if (selectedValuesInternational == 1) {
						PassengerAll[TransactionCounting][5] = International[1];
							if (PassengerAll[TransactionCounting][3] == "Private") {
								PassengerAll[TransactionCounting][8] = "30890";
			
							}else if (PassengerAll[TransactionCounting][3] == "Business") {
								PassengerAll[TransactionCounting][8] = "39650";
			
							}else if (PassengerAll[TransactionCounting][3] == "Regular") {
								PassengerAll[TransactionCounting][8] = "13100";				
							}
								
						
					//Manila to Japan		
					} else if (selectedValuesInternational == 2) {
						PassengerAll[TransactionCounting][5] = International[2];
						
							if (PassengerAll[TransactionCounting][3] == "Private") {
								PassengerAll[TransactionCounting][8] = "40450";
			
							}else if (PassengerAll[TransactionCounting][3] == "Business") {
								PassengerAll[TransactionCounting][8] = "45355";
			
							}else if (PassengerAll[TransactionCounting][3] == "Regular") {
								PassengerAll[TransactionCounting][8] = "27800";				
							}
					}	
					
					//Japan to Manila		
					} else if (selectedValuesInternational == 3) {
						PassengerAll[TransactionCounting][5] = International[3];
							if (PassengerAll[TransactionCounting][3] == "Private") {
								PassengerAll[TransactionCounting][8] = "43385";
			
							}else if (PassengerAll[TransactionCounting][3] == "Business") {
								PassengerAll[TransactionCounting][8] = "49780";
			
							}else if (PassengerAll[TransactionCounting][3] == "Regular") {
								PassengerAll[TransactionCounting][8] = "29400";				
							}
	
					//Manila to Vietnam		
					}else if (selectedValuesInternational == 4) {
						PassengerAll[TransactionCounting][5] = International[4];
							if (PassengerAll[TransactionCounting][3] == "Private") {
								PassengerAll[TransactionCounting][8] = "8505";
			
							}else if (PassengerAll[TransactionCounting][3] == "Business") {
								PassengerAll[TransactionCounting][8] = "12345";
			
							}else if (PassengerAll[TransactionCounting][3] == "Regular") {
								PassengerAll[TransactionCounting][8] = "3200";				
							}
							
					//Vietnam to Manila		
					}else if (selectedValuesInternational == 5) {		
						PassengerAll[TransactionCounting][5] = International[5];
							if (PassengerAll[TransactionCounting][3] == "Private") {
								PassengerAll[TransactionCounting][8] = "14300";
			
							}else if (PassengerAll[TransactionCounting][3] == "Business") {
								PassengerAll[TransactionCounting][8] = "16320";
			
							}else if (PassengerAll[TransactionCounting][3] == "Regular") {
								PassengerAll[TransactionCounting][8] = "4600";				
							}
							
						}
					passenger passenger = new passenger();
					passenger.passengerDetails();
					Destination.dispose();
				}
		}
			 else if(confirmationButton ==0) {
				JOptionPane.showMessageDialog(null, "Input Travel Destination", "No Travel Destination Accepted",
						JOptionPane.ERROR_MESSAGE);
			}
		
		else if (e.getSource() == cancelDestination) {
			AirlineType jonnyPassenger = new AirlineType();
			OverAllTransaction = OverAllTransaction - 1;
			jonnyPassenger.Airplane();
			Destination.dispose();

		}
		
	}
}





/*
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Destination extends AirlineType {
	int confirmationButton = 0;
	String userChoicePlaneType;
	JFrame Destination;	
	JButton buttonLocal, buttonInternational, nextPassengerDetails, cancelDestination;
	JComboBox comboBoxInternational, comboBoxLocal, defaultComboBox;
	JLabel chooseTravelType ;
	JPanel DestinationPanel;

	public static String International[] = new String[6], Local[] = new String[4];
	int selectedValuesLocal, selectedValuesInternational, passengerFare;
	
	
	void DestinationInformation() {
		userChoicePlaneType = PassengerAll[TransactionCounting][3];
		

		Destination = new JFrame("Frame for Destination");
		Destination.setBounds(400,100,500,500);
		Destination.setVisible(true);
		Destination.setLayout(null);
		Destination.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Destination.setResizable(true);
		
		DestinationPanel = new JPanel();
		DestinationPanel.setLayout(null);
	    Destination.getContentPane().add(DestinationPanel);
	    Destination.setLayout(null);
	     
	    chooseTravelType = new JLabel("Choose Travel Type");
        DestinationPanel.add(chooseTravelType);
        DestinationPanel.setBackground(Color.WHITE);
        DestinationPanel.setBounds(100,20,300,300);

       
        buttonLocal = new JButton("Local");
        buttonInternational = new JButton("International");
       
        DestinationPanel.add(buttonLocal);
        DestinationPanel.add(buttonInternational);
        
        chooseTravelType.setBounds(90,10,120,40);
        buttonLocal.setBounds(90,100,120,30);
        buttonInternational.setBounds(90,150,120,30);
        
  
        buttonLocal.addActionListener(this);
        buttonInternational.addActionListener(this);
        
       
     
        String[] Default = {"--Choose Destination--"};
        defaultComboBox = new JComboBox(Default);
        DestinationPanel.add(defaultComboBox);
        defaultComboBox.setBounds(90,220,150,30);
        
       
       
        Local[0] = "Manila to Batanes";
        Local[1] = "Batanes to Manila";
        Local[2] = "Manila to Palawan";
        Local[3] = "Palawan to Manila";
        
        comboBoxLocal = new JComboBox(Local);
        comboBoxLocal.setVisible(false);
        DestinationPanel.add(comboBoxLocal);
        comboBoxLocal.setBounds(90,220,150,30);
        
     
      
        International[0] = "Manila to South Korea";
        International[1] = "South Korea to Manila";
        International[2] = "Manila toJapan";
        International[3] = "Japan to Manila";
        International[4] = "Manila to Taiwan";
        International[5] = "Taiwan to Manila";
        
        
        comboBoxInternational = new JComboBox(International);
        comboBoxInternational.setVisible(false);
        DestinationPanel.add(comboBoxInternational);
        comboBoxInternational.setBounds(90,220,150,30);
      
      
        nextPassengerDetails = new JButton("Proceed");
        DestinationPanel.add(nextPassengerDetails);
        nextPassengerDetails.setBounds(20,270,90,30);
        nextPassengerDetails.addActionListener(this);
        
        
        cancelDestination = new JButton("Cancel");
        DestinationPanel.add(cancelDestination);
        cancelDestination.setBounds(190,270,80,30);
        cancelDestination.addActionListener(this);
        
        
        
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {

			
		
		 if(e.getSource()== buttonLocal ){
			 PassengerAll[TransactionCounting][4] = "Local";
    		 System.out.println(PassengerAll[TransactionCounting][4]);
			 comboBoxLocal.setVisible(true);
			 comboBoxInternational.setVisible(false);
			 defaultComboBox.setVisible(false); 
			 confirmationButton = 1;
			
			 
			 
		 }else if(e.getSource()== buttonInternational){
			 
    		 PassengerAll[TransactionCounting][4] = "International";
    		 System.out.println(PassengerAll[TransactionCounting][4]);
        	 comboBoxInternational.setVisible(true);
			 comboBoxLocal.setVisible(false);
			 defaultComboBox.setVisible(false);
			 confirmationButton = 2;
			 
	 
         }else if(e.getSource()== nextPassengerDetails){
        	 	selectedValuesLocal = comboBoxLocal.getSelectedIndex();
     			selectedValuesInternational = comboBoxInternational.getSelectedIndex();
        
        	
     			
     			
	        	 	if(confirmationButton == 1) {    
	        		
		        		 //saving local destination  data to two dimensional array
		    			 
		        		
		    			 if(selectedValuesLocal == 0) {
		    				 PassengerAll[TransactionCounting][5] = Local[0];
			    				 if(userChoicePlaneType=="Private") {
			    					 PassengerAll[TransactionCounting][8]="8000";
			    					 
			    				 }else if(userChoicePlaneType=="Business")	{
			    					 PassengerAll[TransactionCounting][8]="12500";
			    					 
			    				 }else if(userChoicePlaneType=="Regular") {
			    					 
			    					 PassengerAll[TransactionCounting][8]="3500";
			    				 }
			    				 		 
		    			 }else if(selectedValuesLocal == 1){
		    				 PassengerAll[TransactionCounting][5] = Local[1];
			    				 if(userChoicePlaneType=="Private") {
			    					 PassengerAll[TransactionCounting][8]="9800";
			    					 
			    				 }else if(userChoicePlaneType=="Business")	{
			    					 PassengerAll[TransactionCounting][8]="12950";
			    					 
			    				 }else if(userChoicePlaneType=="Regular") {
			    					 
			    					 PassengerAll[TransactionCounting][8]="3900";
			    				 }
			    				 System.out.println(Local[1]);
			    				    				 
		    				 
		    			 }else if(selectedValuesLocal == 2){
		    				 PassengerAll[TransactionCounting][5] = Local[2];
			    				 if(userChoicePlaneType=="Private") {
			    					 PassengerAll[TransactionCounting][8]="9100";
			    					 
			    				 }else if(userChoicePlaneType=="Business")	{
			    					 PassengerAll[TransactionCounting][8]="10500";
			    					 
			    				 }else if(userChoicePlaneType=="Regular") {
			    					 
			    					 PassengerAll[TransactionCounting][8]="3200";
			    				 }
			    				 System.out.println(Local[2]);
			    			 
		    				 		    				 
		    			 }else if(selectedValuesLocal == 3){
		    				 
		    				 PassengerAll[TransactionCounting][5] = Local[3];
		    				 if(userChoicePlaneType=="Private") {
		    					 PassengerAll[TransactionCounting][8]="9850";
		    					 
		    				 }else if(userChoicePlaneType=="Business")	{
		    					 PassengerAll[TransactionCounting][8]="10975";
		    					 
		    				 }else if(userChoicePlaneType=="Regular") {
		    					 
		    					 PassengerAll[TransactionCounting][8]="3575";
		    				 }
		    				 	
		    			
		    			 }
		    			 
		    			 
		    		else if(confirmationButton == 2) {		 
		    			 
		    		
		    			 if(selectedValuesInternational == 0) {
		    				 //ArrayList<String>PassengerAll = new Arraylist<String>();
		    				 PassengerAll[TransactionCounting][5] = International[0];
		    			 } 
		    			 else if(selectedValuesInternational == 1) {
		    				 
		    				 PassengerAll[TransactionCounting][5] = International[1];
		    			 } 
		    			 else if(selectedValuesInternational == 2) {
		    				 
		    				 PassengerAll[TransactionCounting][5] = International[2];
		    			 }
		    			 else if(selectedValuesInternational == 3) {
		    				 
		    				 PassengerAll[TransactionCounting][5] = International[3];
		    			 }
		    			 else if(selectedValuesInternational == 4) {
		    				 
		    				 PassengerAll[TransactionCounting][5] = International[4];
		    			 }
		    			 else if(selectedValuesInternational == 5) {
		    				 
		    				 PassengerAll[TransactionCounting][5] = International[5];
		    			 }
		    			 	
		     }		 
		    			 
		    			 	passenger passenger = new passenger();
		    			 	passenger.passengerDetails(); 
		        	 		Destination.dispose();
		        	 		
	        	 
        	 
	        	 }else {
	        		 	JOptionPane.showMessageDialog(null, "Input Travel Destination", "No Travel Destination Accepted", JOptionPane.ERROR_MESSAGE);
       
	        	 }
         }else if(e.getSource()==cancelDestination) {
    		

    			AirlineType jonnyPassenger = new AirlineType();
    			OverAllTransaction = OverAllTransaction-1;
    	        jonnyPassenger.Airplane();
    			Destination.dispose();
    		 
    	 }
	}
}
*/

