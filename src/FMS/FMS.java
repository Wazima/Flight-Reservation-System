package FMS;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.FileWriter;

public class FMS {

	public static void main(String[] args) throws IOException {
		Scanner user_input= new Scanner(System.in);
		int choice;
		String array[] = {",",",",",",",",",",",",",",","};
		String user;
		Account a=new Account();
		
		String arr[]={"Bhatti", "female", "17","bahawalpur" ,"1234","ki009","pindi" ,"bussiness","\n"};
		String login[]= {"4568","Ki009"};
		File objf=new File("flightRecord.txt");
		File obj=new File("record.txt");
		FileHandling fh=new FileHandling();
		Passenger p=new Passenger();
		
		//main menu
		System.out.println("Press...");
		System.out.println("1. Create new account");
		System.out.println("2. Login to your account");
		choice=user_input.nextInt();
		
		switch(choice)
		{
		case 1:{
			
		array=a.CreateAccount();
			}break;
		case 2:{
			a.login();
			}break;
		}
		
		Flight f=new Flight(p.getPassno(),p.getname(),p.getgender());
		
		do {
		System.out.println("Press...");
		System.out.println("1. Book your flight");
		System.out.println("2. Check flight time");
		System.out.println("3. Check flight date");
		System.out.println("4. Check flight name");
		System.out.println("5. Check lowest fare for date:");
		System.out.println("6. Cancle seats:");
		System.out.println("7. Exit");
		choice=user_input.nextInt();
		
		switch(choice)
		{
		case 1:{
			f.booking();
			f.Writing();
		}break;
		case 2:{
			System.out.println("Your flight's arriving time is :"+f.getTimeArrival());
			System.out.println("Your flight's departure time is :"+f.getTimeDep());
		}break;
		case 3:{
			System.out.println("Your flights date is: "+ f.getFlightDate());
		}break;
		case 4:{
			System.out.println("Your flight's name is:" + f.getName());
		}break;
		case 5:{
			System.out.println("Enter date(DD/MM/YYYY):");
			user=user_input.next();
			System.out.println("Lowest fare for "+ user+" are : "+ f.lowestFare(user));
		}break;
		case 6:{
			System.out.println("Enter your flight's name: ");
			user=user_input.next();
			f.cancelSeat(user);
			System.out.println("Your seat reservation has been cancelled successfuly!");
			
		}break;
		}
		
		}while(choice!=7);
		
		System.out.println("\n*****************************************************************\n");
		System.out.println("Printing our ticket...\n");
		System.out.println("\n-----------------------------------------------------------------\n");
		f.printTicket();
		System.out.println("\n-----------------------------------------------------------------\n");
		
		
	
	
	}

}
