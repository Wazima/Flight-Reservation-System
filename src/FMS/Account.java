package FMS;

import java.io.IOException;
import java.util.Scanner;

public class Account {
	Scanner user_input= new Scanner(System.in);
	String user;
//format of arr{name,gender,age,city,passport no,password,destination,plan type};
	String arr[]= {",",",",",",",",",",",",",",","};
//format of login{passport no,password};
	String login[]= {"1234","ki809"};
	FileHandling fh=new FileHandling();
	
	
	public String[] CreateAccount() {
	
		
		
		System.out.println("Enter name:");
		user=user_input.next();
		arr[0]=user;
		System.out.println("Enter gender:");
		user=user_input.next();
		arr[1]=user;
		System.out.println("Enter age:");
		user=user_input.next();
		arr[2]=user;
		System.out.println("Enter city:");
		user=user_input.next();
		arr[3]=user;
		System.out.println("Enter passport number:");
		user=user_input.next();
		arr[4]=user;
		System.out.println("Enter your password:");
		user=user_input.next();
		arr[5]=user;
		System.out.println("Enter destination:");
		user=user_input.next();
		arr[6]=user;
		System.out.println("Enter plan type:");
		user=user_input.next();
		arr[7]=user;
		arr=fh.writing(arr);
		
		return arr;
		
	}
	
	public void login() throws IOException {
		System.out.println("Enter your passport number:");
		user=user_input.next();
		login[0]=user;
		System.out.println("Enter your password:");
		user=user_input.next();
		login[1]=user;
		
		
		fh.Searching(login);
		
	}

}
