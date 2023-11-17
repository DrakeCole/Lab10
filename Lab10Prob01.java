import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.EOFException;

/**
 * File: Lab10Prob01.java
 * Class: CSCI 1302
 * Created by: Drake Cole and Bao Pham
 * Created on: Nov 17, 2023
 * Last Modified: Nov 17, 2023
 * Description: translate a binary file into a program
 */
public class Lab10Prob01 {
	public static void main(String[] args) throws FileNotFoundException, EOFException {
		try(
				DataInputStream input = new DataInputStream(new FileInputStream("src/people.dat"));
				DataOutputStream output = new DataOutputStream(new FileOutputStream("src/people-copy.dat"));){
			{
				while(true) {
					output.writeInt(input.readInt());
					output.writeUTF(input.readUTF());
					output.writeUTF(input.readUTF());
					output.writeInt(input.readInt());
					output.writeDouble(input.readDouble());


					System.out.printf(("Age: %d%nFirst and Last name: %s%nAddress: %s%nZip Code: %d%nSalary: %.2f")
							,input.readInt(), input.readUTF(), input.readUTF(), input.readInt(), input.readDouble());
				}
			}}catch(EOFException ex ) {

			} catch (IOException ex) {

				ex.printStackTrace();
			}
	}
}



