package assignment01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class SimpleDateTester {

	public static void main(String[] args) {

		SimpleDate date1 = SimpleDate.of(2000, 6, 15);
		SimpleDate date2 = SimpleDate.of(2002, 3, 21);
		SimpleDate date3 = SimpleDate.of(2002, 8, 23);
		SimpleDate date4 = SimpleDate.of(2000, 6, 20);

		System.out.println(date1.before(date2));
		System.out.println(date2.before(date1));

		System.out.println(date2.before(date3));
		System.out.println(date3.before(date2));

		System.out.println(date1.before(date4));
		System.out.println(date1.before(date1));

		try (PrintWriter output = new PrintWriter(
				new FileOutputStream(new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR SimpleDate.java:");

			// Copy all your lines above, add an extra "2" to every variable name
			// and replace every System.out.print or System.out.println
			// by output.print or output.println
			output.println(date1.before(date2));
			output.println(date2.before(date1));

			output.println(date2.before(date3));
			output.println(date3.before(date2));

			output.println(date1.before(date4));
			output.println(date1.before(date1));

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
