package FMS;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Flight extends Passenger{
	
	String flight_name;
	String origin;
	String destination;
	String passengers;
	String flight_date;
	String arrival_time;
	String departure_time;
	String seats_available;
	String Low_fare;
	File obj=new File("flightRecord.txt");
	Scanner user_input= new Scanner(System.in);
	String user;
	//Passenger p=new Passenger();
	public Flight() {
		
	}
	public Flight(String passno,String name, String gen)
	{
		super(passno,name,gen);
		flight_name=null;
		origin=null;
		destination=null;
		passengers=null;
		flight_date=null;
		arrival_time=null;
		departure_time=null;
		seats_available=null;
		Low_fare=null;
	}
	public void setName(String n) {
		flight_name=n;
	}
	
	public String getName() {
		return flight_name;
	}
	
	public void setOrigin(String o)
	{
		origin=o;
	}
	
	public String getOrigin() {
		return origin;
	}
	
	public void setDestination(String d)
	{
		destination=d;
	}
	
	public String getDestination()
	{
		return destination;
	}
	
	public void setPassengers(String p)
	{
		passengers=p;
	}
	
	public String passengersOnPlan()
	{
		return passengers;
	}
	
	public void setTimeArrival(String t)
	{
		arrival_time=t;
	}
	
	public String getTimeArrival() {
		return arrival_time;
	}
	
	public void setTimeDep(String t)
	{
		departure_time=t;
	}
	
	public String getTimeDep() {
		return departure_time;
	}
	
	public void setFlightDate(String dt)
	{
		flight_date=dt;
	}
	
	public String getFlightDate() {
		return flight_date;
	}
	
	public void setSeats(String s) {
		seats_available=s;
	}
	
	public String getSeats() {
		return seats_available;
	}
	
	
	public String lowestFare(String dt) {
		return Low_fare;
	}
	
	public void booking() {
		System.out.println("Enter origin:");
		user=user_input.next();
		setOrigin(user);
		System.out.println("Enter destination:");
		user=user_input.next();
		setDestination(user);
		System.out.println("Enter date(DD/MM/YYYY):");
		user=user_input.next();
		setFlightDate(user);
		int i=Integer.parseInt(seats_available);	//typecasting from string to int
		i--;
		seats_available=String.valueOf(i);			//typecasting from int to string
	}
	
	public void availability(String src,String dst, String date) {
		String seats=getSeats();
		
	}
	
	public void cancelSeat(String flightname) {
		int i=Integer.parseInt(seats_available);
		i++;
		seats_available=String.valueOf(i);
	}
	
	public void printTicket() {
		//Passenger pass=new Passenger();
		System.out.println("Passport Number: "+getPassno());
		System.out.println("Passenger Name: "+getname());
		System.out.println("Gender: "+getgender());
		System.out.println("Flight origin: "+getOrigin() );
		System.out.println("Flight destination: "+getDestination());
		System.out.println("Departure Time: "+getTimeDep());
		
	}
	
	//file handling for flight
	public void Writing() {
	//format of array{name,origin,destination,passengers,seats available,arrival time,departure time,date,lowest fare};
		String array[]= {"PK-145","Islambad","Tokyo","50","5","15:00PM","20:00PM","23/10/2021","Rs.80000"};
		//writing to file		
		try {
					
					FileWriter writing=new FileWriter("flightRecord.txt",true);
					BufferedWriter b= new BufferedWriter(writing);
					PrintWriter p= new PrintWriter(b);
					for(int i=0;i<9;i++) {
					writing.write(array[i]);
					if(i<8)
						writing.write(",");
					else
						writing.write(".\n");
						
					
					p.println("");
					}
					
					p.close();
					writing.close();
					System.out.println("Written to file");
			
				}
				catch(IOException e) {
					System.out.println("Error Occurred");
					e.printStackTrace();
					}
	}
	
	public void reading(){
		String words[];
		try {

			FileReader reading=new FileReader("flightRecord.txt");
		//reads first byte
		Scanner reader=new Scanner(reading);
		while(reader.hasNext()) {
			
			
			String data=reader.next();
			words=data.split(",");
			setName(words[0]);
			setOrigin(words[1]);
			setDestination(words[2]);
			setPassengers(words[3]);
			setSeats(words[4]);
			setTimeArrival(words[5]);
			setTimeDep(words[6]);
			setFlightDate(words[7]);
			lowestFare(words[8]);
			
			
			//System.out.println(data);
			
		}
		reader.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("Error occurred");
			e.printStackTrace();
			}
	}
	
	
	
	
}
