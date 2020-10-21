import java.util.NoSuchElementException;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.*; 
import java.util.Scanner; 
import java.util.*;
// Main class of Core Java project
 class Event {

		private short userId;
		String firstName;
		private	String lastName;
		private	String userName;
		private Long mobileNo;
		String mobile;
		private String email;
		boolean check;
		// Basic Constructor of Event class
	
public  Event()
{
		userId=0;
		firstName=lastName=email="";
}


public  Event(short userid,String firstName,String lastName)
{
		userId = this.userId;
		firstName=this.firstName;
		lastName= this.lastName;
}

public  Event(short userId,String firstName,String lastName,Long mobileNo,String email)
{
		userId = this.userId;
		firstName = this.firstName;
		lastName = this.lastName;	
		mobileNo = this.mobileNo;
		email = this.email;
}
public void readUserInfo(short id)
{
	System.out.println("\n\t MODIFY USER INFORMATION");
	Scanner sc = new Scanner(System.in); 

	System.out.println("Do you want to modify details");
	check = sc.nextBoolean();
	if (check== true)
	{

		System.out.println("\nUser Id:"+id);
		System.out.print("\nEnter First Name:");
		firstName = sc.next();		
		System.out.println("\nEnter Last Name:");
		lastName = sc.next();
		displayUSerInfo(id);	
	}
}
public void displayUSerInfo(short id)
{
		System.out.println("\n\t MODIFIED USER INFORMATION");
		System.out.println("\nUser Id:"+id);
		System.out.println("\nFirst Name:"+firstName);
		System.out.println("\nLast Name:"+lastName);

}
	// Definition input function for reading User Info
	public void readUserInfo()
	{ 	
		System.out.println("\n\tREAD USER BASIC INFORMATION!");
		Scanner sc = new Scanner(System.in); 
		int count=0;
	try {
		System.out.println("\nEnter User Id");		
		userId = sc.nextShort();
		System.out.print("\nEnter First Name:");
		firstName = sc.next();		
		System.out.println("\nEnter Last Name:");
		lastName = sc.next();
		System.out.println("\nEnter Mobile Number:");
		mobileNo = sc.nextLong();
		System.out.println("\nEnter Email:");
		email = sc.next();
		mobile = mobileNo.toString();
		if(mobile.length()<=0||mobile.length()>10)
		{
			System.out.print("Invalid Number");
			System.out.println("\nEnter Mobile Number:");
		mobileNo = sc.nextLong();
		}

		readUserInfo(userId);
		
	} 
	catch(InputMismatchException e)
	{
		System.out.print("Invalid input");
		readUserInfo();
	}
	}
	// Difinition input function for display User Info
	public void  displayUSerInfo()
	{
		System.out.println("\n \tDISPLAY USER BASIC INFORMATION");
		System.out.println("\nUser Id:"+userId);
		System.out.println("\nFirst Name:"+firstName);
		System.out.println("\nLast Name:"+lastName);
		System.out.println("\nMobile No.:"+mobileNo);
		System.out.println("\nEmail:"+email);
	
	}


 
public static void main(String args[]) 
		{
			System.out.println("***Program Name: Write a program to demonstrate various data types and operators.***\n");
			System.out.println("***********************Author: Adarsh Thakur***********************\n");
			System.out.println("***********************Reg. No: 2047250***********************\n");
			int choice;
			byte ch;
			boolean che;
			short id;
			Scanner scan = new Scanner(System.in); 
	
		
				System.out.println("\n1. User information");
		
			 	System.out.println("Enter Your Choice!");
			 	choice = scan.nextInt();
			
						 	System.out.println("\n\t\t \t USER INFORMATION!\n");
							
						        usern.readUserInfo();
						 		
				 		 
							// org.displayEventDetails(che);
							
						
			 
			
		}
	}

	




