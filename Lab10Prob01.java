import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * File: Lab10Prob01.java
 * Class: CSCI 1302
 * Created by: Drake Cole and Bao Pham
 * Created on: Nov 17, 2023
 * Last Modified: Nov 17, 2023
 * Description: translate a binary file into a program
 */
public class Lab10Prob01 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		try (
				DataInputStream input = new DataInputStream(new FileInputStream("people.dat"));) {
			int age;
			while (true) {
				age = input.readInt();
				System.out.println(age);
			}
		} catch (EOFException ex) {
			System.out.println("Reached the end of file");
		}
	}
}
