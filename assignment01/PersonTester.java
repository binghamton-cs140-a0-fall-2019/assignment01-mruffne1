package assignment1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class PersonTester {

	public static void main(String[] args) {
		
		Person person1 = new Person("Michael", "Ruffner", "485-87-4874", 
				new DateAndPlaceOfBirth(1966, 5, 3, "Bronx", "NY", "USA"),
				new StreetUSAddress("6 Stadium Boulevard", "", "East Setauket", "NY","11733"));
		
		System.out.println(person1);
		
		try(PrintWriter output = new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR Person.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
			output.println(person1);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}

}
