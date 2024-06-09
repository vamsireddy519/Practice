package bn;

import java.util.Scanner;

public class Banking {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
	        
	       
	        System.out.print("Enter your 12-digit account number: ");
	        String accountNumber = scanner.nextLine();
	        
	       System.out.println(" ");
	       
	        if (accountNumber.length() != 12) {
	            System.err.println("Invalid account number. Please enter a 12-digit account number.");
			 System.out.println(" ");  
	        }
		else{
	        
	        double balance = 1000.00;  
	        System.out.println("Your current balance is: $" + balance);
	        
	        System.out.println(" ");
	        
	        System.out.print("Would you like to 'Credit' or 'Debit'?:"+ " ");
	        String operation = scanner.nextLine();

	        System.out.println(" ");
	        
	        if (operation.equalsIgnoreCase("Credit")) {
	        	
	            System.out.print("Enter the amount to credit: ");
	            double creditAmount = scanner.nextDouble();
	            
	            System.out.println(" ");
	            
	            balance += creditAmount;
	            System.out.println("Amount credited: $" + creditAmount);
	            System.out.println(" ");
	            
	            
	        } else if (operation.equalsIgnoreCase("Debit")) {
	        	
	            System.out.print("Enter the amount to debit: ");
	            double debitAmount = scanner.nextDouble();
	            
	            System.out.println(" ");
	            
	            if (debitAmount > balance) {
	                System.out.println("Insufficient balance.");
	               
	            } else {
	                balance -= debitAmount;
	                System.out.println("Amount debited: $" + debitAmount);
	                System.out.println(" ");
	            }
	        } else {
	            System.err.println("Invalid operation. Please enter 'Credit' or 'Debit'.");
	        }

	       
	        System.out.println("Updated balance: $" + balance);
	        
	        System.out.println("Thank you :)");

	        scanner.close();
		}
	}

}