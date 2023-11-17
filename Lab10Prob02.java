import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.io.EOFException;
import java.util.Collections;

/**
 * File: Lab10Prob01.java
 * Class: CSCI 1302
 * Created by: Drake Cole and Bao Pham
 * Created on: Nov 17, 2023
 * Last Modified: Nov 17, 2023
 * Description: translate a binary file into a program
 */
public class Lab10Prob02 {
	public static void main(String[] args) throws FileNotFoundException, EOFException {
		ArrayList <Person> people = new ArrayList<>();
		
		try(
				DataInputStream input = new DataInputStream(new FileInputStream("src/people.dat"));
				DataOutputStream output = new DataOutputStream(new FileOutputStream("src/people-copy.dat"));){
			{
				
				while(true) {
					
					int age = input.readInt();
					String name = input.readUTF();
					String address = input.readUTF();
					int zip = input.readInt();
					double salary = input.readDouble();
					 	
					output.writeInt(age);
					output.writeUTF(name);
					output.writeUTF(address);
					output.writeInt(zip);
					output.writeDouble(salary);
					
					people.add(new Person(age, name,  address, zip, salary));


//					System.out.printf(("%s %d %s %d %.2f%n")
//							,name, age, address, zip, salary);
				}
			}}catch(EOFException ex ) {

			} catch (IOException ex) {

				ex.printStackTrace();
			}
		Collections.sort(people);
		try(DataOutputStream output = new DataOutputStream(new FileOutputStream("src/people-salary-sorted.dat"));){
			{
				
				for(int i = 0; i < people.size(); i++) {
					output.writeUTF(people.get(i).toString());
					
				}
				
		}
	} catch (IOException ex) {
		ex.printStackTrace();
	}
}
}


