package assignment01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class PlaceDOBTester {

	public static void main(String[] args) {

		DateAndPlaceOfBirth dopb1 = new DateAndPlaceOfBirth(1966, 5, 3, "Bronx", "NY", "USA");
		DateAndPlaceOfBirth dopb2 = new DateAndPlaceOfBirth(1967, 12, 25, "Binghamton", "NY", "USA");
		DateAndPlaceOfBirth dopb3 = new DateAndPlaceOfBirth(2000, 6, 15, "Sacramento", "CA", "USA");
		DateAndPlaceOfBirth dopb4 = new DateAndPlaceOfBirth(1966, 5, 3, "Athens", "Greece");
		DateAndPlaceOfBirth dopb5 = new DateAndPlaceOfBirth(2001, 5, 3, "Rome", "Italy");

		System.out.println(dopb1);
		System.out.println(dopb2);
		System.out.println(dopb3);
		System.out.println(dopb4);
		System.out.println(dopb5);

		// test of olderThan method
		System.out.println(dopb1.olderThan(dopb2));
		System.out.println(dopb1.olderThan(dopb3));
		System.out.println(dopb1.olderThan(dopb4));
		System.out.println(dopb1.olderThan(dopb5));
		System.out.println("\n");

		System.out.println(dopb2.olderThan(dopb1));
		System.out.println(dopb2.olderThan(dopb3));
		System.out.println(dopb2.olderThan(dopb4));
		System.out.println(dopb2.olderThan(dopb5));
		System.out.println("\n");

		System.out.println(dopb3.olderThan(dopb1));
		System.out.println(dopb3.olderThan(dopb2));
		System.out.println(dopb3.olderThan(dopb4));
		System.out.println(dopb3.olderThan(dopb5));
		System.out.println("\n");

		System.out.println(dopb4.olderThan(dopb1));
		System.out.println(dopb4.olderThan(dopb2));
		System.out.println(dopb4.olderThan(dopb3));
		System.out.println(dopb4.olderThan(dopb5));
		System.out.println("\n");

		System.out.println(dopb5.olderThan(dopb1));
		System.out.println(dopb5.olderThan(dopb2));
		System.out.println(dopb5.olderThan(dopb3));
		System.out.println(dopb5.olderThan(dopb4));
		System.out.println("\n");

		// test of youngerThan method
		System.out.println(dopb1.youngerThan(dopb2));
		System.out.println(dopb1.youngerThan(dopb3));
		System.out.println(dopb1.youngerThan(dopb4));
		System.out.println(dopb1.youngerThan(dopb5));
		System.out.println("\n");

		System.out.println(dopb2.youngerThan(dopb1));
		System.out.println(dopb2.youngerThan(dopb3));
		System.out.println(dopb2.youngerThan(dopb4));
		System.out.println(dopb2.youngerThan(dopb5));
		System.out.println("\n");

		System.out.println(dopb3.youngerThan(dopb1));
		System.out.println(dopb3.youngerThan(dopb2));
		System.out.println(dopb3.youngerThan(dopb4));
		System.out.println(dopb3.youngerThan(dopb5));
		System.out.println("\n");

		System.out.println(dopb4.youngerThan(dopb1));
		System.out.println(dopb4.youngerThan(dopb2));
		System.out.println(dopb4.youngerThan(dopb3));
		System.out.println(dopb4.youngerThan(dopb5));
		System.out.println("\n");

		System.out.println(dopb5.youngerThan(dopb1));
		System.out.println(dopb5.youngerThan(dopb2));
		System.out.println(dopb5.youngerThan(dopb3));
		System.out.println(dopb5.youngerThan(dopb4));
		System.out.println("\n");

		// test of hasSameBirthDateAs
		System.out.println(dopb1.hasSameBirthDateAs(dopb2));
		System.out.println(dopb1.hasSameBirthDateAs(dopb3));
		System.out.println(dopb1.hasSameBirthDateAs(dopb4));
		System.out.println(dopb1.hasSameBirthDateAs(dopb5));
		System.out.println("\n");

		System.out.println(dopb2.hasSameBirthDateAs(dopb1));
		System.out.println(dopb2.hasSameBirthDateAs(dopb3));
		System.out.println(dopb2.hasSameBirthDateAs(dopb4));
		System.out.println(dopb2.hasSameBirthDateAs(dopb5));
		System.out.println("\n");

		System.out.println(dopb3.hasSameBirthDateAs(dopb1));
		System.out.println(dopb3.hasSameBirthDateAs(dopb2));
		System.out.println(dopb3.hasSameBirthDateAs(dopb4));
		System.out.println(dopb3.hasSameBirthDateAs(dopb5));
		System.out.println("\n");

		System.out.println(dopb4.hasSameBirthDateAs(dopb1));
		System.out.println(dopb4.hasSameBirthDateAs(dopb2));
		System.out.println(dopb4.hasSameBirthDateAs(dopb3));
		System.out.println(dopb4.hasSameBirthDateAs(dopb5));
		System.out.println("\n");

		System.out.println(dopb5.hasSameBirthDateAs(dopb1));
		System.out.println(dopb5.hasSameBirthDateAs(dopb2));
		System.out.println(dopb5.hasSameBirthDateAs(dopb3));
		System.out.println(dopb5.hasSameBirthDateAs(dopb4));
		System.out.println("\n");

		// test of hasSameBirthDay
		System.out.println(dopb1.hasSameBirthDayAs(dopb2));
		System.out.println(dopb1.hasSameBirthDayAs(dopb3));
		System.out.println(dopb1.hasSameBirthDayAs(dopb4));
		System.out.println(dopb1.hasSameBirthDayAs(dopb5));
		System.out.println("\n");

		System.out.println(dopb2.hasSameBirthDayAs(dopb1));
		System.out.println(dopb2.hasSameBirthDayAs(dopb3));
		System.out.println(dopb2.hasSameBirthDayAs(dopb4));
		System.out.println(dopb2.hasSameBirthDayAs(dopb5));
		System.out.println("\n");

		System.out.println(dopb3.hasSameBirthDayAs(dopb1));
		System.out.println(dopb3.hasSameBirthDayAs(dopb2));
		System.out.println(dopb3.hasSameBirthDayAs(dopb4));
		System.out.println(dopb3.hasSameBirthDayAs(dopb5));
		System.out.println("\n");

		System.out.println(dopb4.hasSameBirthDayAs(dopb1));
		System.out.println(dopb4.hasSameBirthDayAs(dopb2));
		System.out.println(dopb4.hasSameBirthDayAs(dopb3));
		System.out.println(dopb4.hasSameBirthDayAs(dopb5));
		System.out.println("\n");

		System.out.println(dopb5.hasSameBirthDayAs(dopb1));
		System.out.println(dopb5.hasSameBirthDayAs(dopb2));
		System.out.println(dopb5.hasSameBirthDayAs(dopb3));
		System.out.println(dopb5.hasSameBirthDayAs(dopb4));

		try (PrintWriter output = new PrintWriter(
				new FileOutputStream(new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR DateAndPlaceOfBirth.java:");

			// Copy all your lines above, add an extra "2" to every variable name
			// and replace every System.out.print or System.out.println
			// by System.out.print or System.out.println
			output.println(dopb1);
			output.println(dopb2);
			output.println(dopb3);
			output.println(dopb4);
			output.println(dopb5);

			// test of olderThan method
			output.println(dopb1.olderThan(dopb2));
			output.println(dopb1.olderThan(dopb3));
			output.println(dopb1.olderThan(dopb4));
			output.println(dopb1.olderThan(dopb5));
			output.println("\n");

			output.println(dopb2.olderThan(dopb1));
			output.println(dopb2.olderThan(dopb3));
			output.println(dopb2.olderThan(dopb4));
			output.println(dopb2.olderThan(dopb5));
			output.println("\n");

			output.println(dopb3.olderThan(dopb1));
			output.println(dopb3.olderThan(dopb2));
			output.println(dopb3.olderThan(dopb4));
			output.println(dopb3.olderThan(dopb5));
			output.println("\n");

			output.println(dopb4.olderThan(dopb1));
			output.println(dopb4.olderThan(dopb2));
			output.println(dopb4.olderThan(dopb3));
			output.println(dopb4.olderThan(dopb5));
			output.println("\n");

			output.println(dopb5.olderThan(dopb1));
			output.println(dopb5.olderThan(dopb2));
			output.println(dopb5.olderThan(dopb3));
			output.println(dopb5.olderThan(dopb4));
			output.println("\n");

			// test of youngerThan method
			output.println(dopb1.youngerThan(dopb2));
			output.println(dopb1.youngerThan(dopb3));
			output.println(dopb1.youngerThan(dopb4));
			output.println(dopb1.youngerThan(dopb5));
			output.println("\n");

			output.println(dopb2.youngerThan(dopb1));
			output.println(dopb2.youngerThan(dopb3));
			output.println(dopb2.youngerThan(dopb4));
			output.println(dopb2.youngerThan(dopb5));
			output.println("\n");

			output.println(dopb3.youngerThan(dopb1));
			output.println(dopb3.youngerThan(dopb2));
			output.println(dopb3.youngerThan(dopb4));
			output.println(dopb3.youngerThan(dopb5));
			output.println("\n");

			output.println(dopb4.youngerThan(dopb1));
			output.println(dopb4.youngerThan(dopb2));
			output.println(dopb4.youngerThan(dopb3));
			output.println(dopb4.youngerThan(dopb5));
			output.println("\n");

			output.println(dopb5.youngerThan(dopb1));
			output.println(dopb5.youngerThan(dopb2));
			output.println(dopb5.youngerThan(dopb3));
			output.println(dopb5.youngerThan(dopb4));
			output.println("\n");

			// test of hasSameBirthDateAs
			output.println(dopb1.hasSameBirthDateAs(dopb2));
			output.println(dopb1.hasSameBirthDateAs(dopb3));
			output.println(dopb1.hasSameBirthDateAs(dopb4));
			output.println(dopb1.hasSameBirthDateAs(dopb5));
			output.println("\n");

			output.println(dopb2.hasSameBirthDateAs(dopb1));
			output.println(dopb2.hasSameBirthDateAs(dopb3));
			output.println(dopb2.hasSameBirthDateAs(dopb4));
			output.println(dopb2.hasSameBirthDateAs(dopb5));
			output.println("\n");

			output.println(dopb3.hasSameBirthDateAs(dopb1));
			output.println(dopb3.hasSameBirthDateAs(dopb2));
			output.println(dopb3.hasSameBirthDateAs(dopb4));
			output.println(dopb3.hasSameBirthDateAs(dopb5));
			output.println("\n");

			output.println(dopb4.hasSameBirthDateAs(dopb1));
			output.println(dopb4.hasSameBirthDateAs(dopb2));
			output.println(dopb4.hasSameBirthDateAs(dopb3));
			output.println(dopb4.hasSameBirthDateAs(dopb5));
			output.println("\n");

			output.println(dopb5.hasSameBirthDateAs(dopb1));
			output.println(dopb5.hasSameBirthDateAs(dopb2));
			output.println(dopb5.hasSameBirthDateAs(dopb3));
			output.println(dopb5.hasSameBirthDateAs(dopb4));
			output.println("\n");

			// test of hasSameBirthDay
			output.println(dopb1.hasSameBirthDayAs(dopb2));
			output.println(dopb1.hasSameBirthDayAs(dopb3));
			output.println(dopb1.hasSameBirthDayAs(dopb4));
			output.println(dopb1.hasSameBirthDayAs(dopb5));
			output.println("\n");

			output.println(dopb2.hasSameBirthDayAs(dopb1));
			output.println(dopb2.hasSameBirthDayAs(dopb3));
			output.println(dopb2.hasSameBirthDayAs(dopb4));
			output.println(dopb2.hasSameBirthDayAs(dopb5));
			output.println("\n");

			output.println(dopb3.hasSameBirthDayAs(dopb1));
			output.println(dopb3.hasSameBirthDayAs(dopb2));
			output.println(dopb3.hasSameBirthDayAs(dopb4));
			output.println(dopb3.hasSameBirthDayAs(dopb5));
			output.println("\n");

			output.println(dopb4.hasSameBirthDayAs(dopb1));
			output.println(dopb4.hasSameBirthDayAs(dopb2));
			output.println(dopb4.hasSameBirthDayAs(dopb3));
			output.println(dopb4.hasSameBirthDayAs(dopb5));
			output.println("\n");

			output.println(dopb5.hasSameBirthDayAs(dopb1));
			output.println(dopb5.hasSameBirthDayAs(dopb2));
			output.println(dopb5.hasSameBirthDayAs(dopb3));
			output.println(dopb5.hasSameBirthDayAs(dopb4));

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
