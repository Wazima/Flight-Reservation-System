package FMS;

public class Passenger {

	String name;
	String gender;
	String age;
	String address;
	String passport_no;
	String password;
	String destination;
	String plane_type;
	//Flight f=new Flight();
	public Passenger()
	{
		
	}
	public Passenger(String passno,String nme,String gen)
	{
		passport_no=passno;
		name=nme;
		gender=gen;
	}
	public void setname(String n)
	{
		name=n;
	}
	
	public String getname()
	{
		return name;
	}
	
	public void setgender(String g) {
		gender=g;
	}
	
	public String getgender() {
		return gender;
	}
	
	public void setage(String a) {
		age=a;
	}
	
	public String getage() {
		return age;
	}
	
	public void setaddress(String ad) {
		address=ad;
	}
	
	public void setPassno(String p) {
		
		passport_no=p;
		
	}
	
	public String getPassno() {

		return passport_no;
	}
	
	public void setpassword(String ps) {
		password=ps;
	}
	
	public void setdestination(String add) {
		destination=add;
	}
	
	public String getdestination() {
		return destination;
	}
	
	public void setType(String ty) {
		plane_type=ty;
	}
	
	public String getType() {
		return plane_type;
	}
	
	
}
