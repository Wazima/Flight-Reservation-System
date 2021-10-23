package FMS;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.FileWriter;

public class FileHandling {
	
	Passenger p=new Passenger();
	File obj=new File("record.txt");
	
	public String[] writing(String array[]) {
		//file handling
	
		
		//writing to file
		try {
			
			FileWriter writing=new FileWriter("record.txt",true);
			BufferedWriter b= new BufferedWriter(writing);
			PrintWriter p= new PrintWriter(b);
			for(int i=0;i<8;i++) {
			writing.write(array[i]);
			if(i<7)
				writing.write(",");
			else
				writing.write(".\n");
				
			
			p.println();
			}
			
			p.close();
			writing.close();
			System.out.println("Written to file");
	
		}
		catch(IOException e) {
			System.out.println("Error Occurred");
			e.printStackTrace();
			}
	return array;
	}
	
	public String[] reading(String array[]) {
		//reading from file
		String words[];
				try {

					FileReader reading=new FileReader("record.txt");
				//reads first byte
				Scanner reader=new Scanner(reading);
				while(reader.hasNext()) {
					
					String data=reader.next();
					words=data.split(",");
					
					
					p.setname(words[0]);
					p.setgender(words[1]);
					p.setage(words[2]);
					p.setaddress(words[3]);
					p.setPassno(words[4]);
					p.setdestination(words[5]);
					p.setType(words[6]);
					
					
				
					
				}
				reader.close();
				}
				catch(FileNotFoundException e) {
					System.out.println("Error occurred");
					e.printStackTrace();
					}
	return array;
	}
	
	public void Searching(String array[]) throws IOException {
		String words[];
		
		try {
			FileReader fr=new FileReader(obj);
			
			BufferedReader b= new BufferedReader(fr);
			String r;
			String compare=array[0];
			
			while((r=b.readLine())!=null)
			{
				words=r.split(",");
				
				
				for(String word:words)
				{
					if(word.equals(compare))
					{
					
						String data=b.readLine();
						p.setname(words[0]);
						p.setgender(words[1]);
						p.setage(words[2]);
						p.setaddress(words[3]);
						p.setPassno(words[4]);
						p.setdestination(words[5]);
						p.setType(words[6]);
						
					}
				}
			}
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		}	
		
	
		
		
	}

}
