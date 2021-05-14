package AirlineReservation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public  class passenger extends Destination{
	
   
    JFrame jonnyMain;
    JTextField inputAge,inputName,inputNumberofPassenegrs, childTextField, adultTextField, seniorCitizenTextField;
    JButton passengerButtonNext1, cancelPassenger;
    JPanel passengerDetails;
    JLabel passengerAge,passengerName, childLabel, adultLabel, seniorCitizenLabel;
    String userInputName, userInputAge, childStore, adultStore, seniorStore, totalPassengerConvert;
    int maximumCapacity, childCount, adultCount, seniorCount, totalPassengerCount;
    int privateMaximumA=0, privateMaximumB=0, businessMaximumA=0, businessMaximumB=0,
    		regularMaximumA=0, regularMaximumB=0;
    
	
	
    public void passengerDetails(){ 
    	

        jonnyMain = new JFrame("PEROSA AIRLINE");
        jonnyMain.setBounds(400,100,500,500);
        jonnyMain.setVisible(true);
        jonnyMain.setLayout(null);
        jonnyMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jonnyMain.setResizable(false);
        
        passengerDetails = new JPanel();
        jonnyMain.getContentPane().add(passengerDetails);
        passengerDetails.setLayout(null);
        passengerDetails.setBackground(Color.WHITE);
        
        
        //input name
        inputName = new JTextField();
        passengerDetails.add(inputName);
        inputName.addActionListener(this);
        	
        
        inputAge = new JTextField();
        passengerDetails.add(inputAge);
        inputAge.addActionListener(this);
        
        passengerName = new JLabel("Name");
        passengerDetails.add(passengerName);
 
        JLabel passengerAge = new JLabel("Age");
        passengerDetails.add(passengerAge);
        
        childLabel = new JLabel("CHILD");
        passengerDetails.add(childLabel);
        
        childTextField = new JTextField();
        passengerDetails.add(childTextField);
        childTextField.addActionListener(this);
        
        adultLabel = new JLabel("ADULT");
        passengerDetails.add(adultLabel);
        
        adultTextField = new JTextField();
        passengerDetails.add(adultTextField);
        adultTextField.addActionListener(this);
        
        seniorCitizenLabel = new JLabel("SENIOR");
        passengerDetails.add(seniorCitizenLabel);
        
        seniorCitizenTextField = new JTextField();
        passengerDetails.add(seniorCitizenTextField);
        seniorCitizenTextField.addActionListener(this);
        
   /*     JLabel numberofPassenegrs = new JLabel("number of passenger");
        passengerDetails.add(numberofPassenegrs);
        
        inputNumberofPassenegrs = new JTextField();
        passengerDetails.add(inputNumberofPassenegrs);
        inputNumberofPassenegrs.setEditable(false);
        inputNumberofPassenegrs.addActionListener(this);
      */ 
        
        
        passengerButtonNext1 = new JButton("Next");
        passengerDetails.add(passengerButtonNext1);   
        passengerButtonNext1.addActionListener(this);
        
        cancelPassenger = new JButton("Cancel");
        passengerDetails.add(cancelPassenger);     
        cancelPassenger.addActionListener(this);
        
        
        passengerDetails.setBounds(100,20,300,300);
        inputAge.setBounds(70,80,160,30);
        passengerAge.setBounds(20,80,90,30);
        inputName.setBounds(70,40,160,30);
        passengerName.setBounds(20,40,90,30);
        childLabel.setBounds(15,130,80,30);
        childTextField.setBounds(7,160,80,30);
        adultLabel.setBounds(127,130,80,30);
        adultTextField.setBounds(110,160,80,30);
        seniorCitizenLabel.setBounds(235,130,80,30);
        seniorCitizenTextField.setBounds(217,160,80,30);
      //numberofPassenegrs.setBounds(80,200,200,30);
      //inputNumberofPassenegrs.setBounds(100,230,100,30);
        passengerButtonNext1.setBounds(20,270,120,30);
        cancelPassenger.setBounds(160,270,120,30);
        
        
        
       
     
       
    }public void privateTravelA() {
    	//manila to batanes private
    	privateMaximumA += totalPassengerCount ;
    	if(privateMaximumA > 14) {
    		errorNeedsDeduction();
    		errorPromptExceed();
    		
    	}else {
    		insurancePrompt();
    	}
    	
    	
    } public void privateTravelB() {
    	//batanes to manila private
    	if(privateMaximumB > 14) {
    		errorPromptExceed();
    	}else {
    		insurancePrompt();
    	}
    	
    	
    }public void businessTravelA() {
    	//batanes to manila private
    	if(businessMaximumA > 23) {
    		errorPromptExceed();
    	}else {
    		insurancePrompt();
    	}
    	
    }public void businessTravelB() {
    	//batanes to manila private
    	if(businessMaximumB > 23) {
    		errorPromptExceed();
    	}else {
    		insurancePrompt();
    	}
    	
    	
    } public void regularTravelA() {
    	//batanes to manila private
    	if(regularMaximumA > 48) {
    		errorPromptExceed();
    	}else {
    		insurancePrompt();
    	}
    	
    	
    } public void regularTravelB() {
    	//batanes to manila private
    	if(regularMaximumA > 48) {
    		errorPromptExceed();
    	}else {
    		insurancePrompt();
    	}
    	
    	
    }public void userClickAirplaneandTravel() {
    	if(PassengerAll[TransactionCounting][3].equalsIgnoreCase("private")) {
    		if(PassengerAll[TransactionCounting][5].equalsIgnoreCase("Manila to Batanes")){
    				privateTravelA();
    		}
    	}	
    }
    
    
    
    public void errorPromptExceed() {
    	JOptionPane.showMessageDialog(null, "Sorry! You have exceeded the number of passengers required");
    	
    }
    
    public void errorNeedsDeduction() {
    	int deductionConvert = Integer.parseInt(PassengerAll[TransactionCounting][12]);
    	deductionConvert = deductionConvert-	totalPassengerCount;    	
    	PassengerAll[TransactionCounting][12]=String.valueOf(deductionConvert);
  
    	
    }
    
    public void insurancePrompt() {
    	Transaction Transaction = new Transaction();
	int insuranceQuestioning = JOptionPane.showConfirmDialog(null,  "Would you like to avail travel insureance?");
	
	if(insuranceQuestioning == 0) {
		if(PassengerAll[TransactionCounting][3] == "Private") {
			PassengerAll[TransactionCounting][10] = "4500";
		}else if(PassengerAll[TransactionCounting][3] == "Business"){
			PassengerAll[TransactionCounting][10] = "6500";
		}else if(PassengerAll[TransactionCounting][3] == "Regular"){
			PassengerAll[TransactionCounting][10] = "950";
		}
		Transaction.transactionMethod();
		Transaction.insurance.setVisible(true);
		jonnyMain.dispose();
	}else if(insuranceQuestioning == 1 ) {
		Transaction.transactionMethod();
		Transaction.printInsuranceFee.setVisible(false);
		jonnyMain.dispose();
		

	}
    
  }   
    
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Transaction Transaction = new Transaction();
	
		if(e.getSource()== passengerButtonNext1 ){
			
			userInputName =  inputName.getText();
			PassengerAll[TransactionCounting][1] = userInputName;
			
			userInputAge = inputAge.getText();
			PassengerAll[TransactionCounting][2] = userInputAge;
			
			childStore = childTextField.getText();
			adultStore = adultTextField.getText();
			seniorStore = seniorCitizenTextField.getText();
			
			childCount = Integer.parseInt(childStore);
			adultCount = Integer.parseInt(adultStore);
			seniorCount = Integer.parseInt(seniorStore);
			
			totalPassengerCount = childCount + adultCount + seniorCount + 1;
			System.out.println(totalPassengerCount);
			totalPassengerConvert = String.valueOf(totalPassengerCount);
			PassengerAll[TransactionCounting][12] = totalPassengerConvert;
			
			userClickAirplaneandTravel();
			
			
			
		}
		else if(e.getSource()==cancelPassenger) {
			Destination Destination = new Destination();
            Destination.DestinationInformation();
			jonnyMain.dispose();
		}
		
		
		
	}
	
}

