package assignment01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class USAddressTester {

	public static void main(String[] args) {

		StreetUSAddress usa1 = new StreetUSAddress("6 Stadium Boulevard", "", "East Setauket", "NY", "11733");
		StreetUSAddress usa2 = new StreetUSAddress("162 Court St", "Apartment 3C-8", "Binghamton", "NY", "13902");

		System.out.println("\nTESTS FOR StreetUSAddress.java:");
		System.out.println(usa1);
		System.out.println(usa2);

		try (PrintWriter output = new PrintWriter(
				new FileOutputStream(new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR StreetUSAddress.java:");

			// Copy all your lines above, add an extra "2" to every variable name
			// and replace every System.out.print or System.out.println
			// by output.print or output.println

			output.println(usa1);
			output.println(usa2);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
