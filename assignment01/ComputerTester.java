package assignment01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class ComputerTester {

	public static void main(String[] args) {
		// TODO make 4 different Computer objects with different
		// combinations of disk size (two more than a terabyte and two less)
		// and for each make one an SSD drive and the other not.
		// Then call System.out.println(comp); for each "comp" object
		// and observe that there are small differences in how the computer
		// information prints out.
		Computer comp1 = new Computer("comp 1", "Intel i7", 16, 1500, false, 1500);
		Computer comp2 = new Computer("comp 2", "Ryzen 5", 16, 500, false, 1000);
		Computer comp3 = new Computer("comp 3", "Intel i9", 32, 2000, true, 1800);
		Computer comp4 = new Computer("comp 4", "Ryzen Threadripper", 32, 2000, true, 2300);

		System.out.println(comp1);
		System.out.println(comp2);
		System.out.println(comp3);
		System.out.println(comp4);

		try (PrintWriter output = new PrintWriter(
				new FileOutputStream(new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR Computer.java:");

			// Copy all your lines above, add an extra "2" to every variable name
			// and replace every System.out.print or System.out.println
			// by output.print or output.println
			output.println(comp1);
			output.println(comp2);
			output.println(comp3);
			output.println(comp4);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
