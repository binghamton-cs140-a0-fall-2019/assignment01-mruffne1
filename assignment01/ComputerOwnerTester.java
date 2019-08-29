package assignment01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class ComputerOwnerTester {

	public static void main(String[] args) {

		Person person1 = new Person("Kimberly", "Lyman", "111-22-3333",
				new DateAndPlaceOfBirth(1967, 12, 28, "Huntington", "NY", "11746"),
				new StreetUSAddress("10 Lancaster Lane", "", "Huntington", "NY", "11746"));

		ComputerOwner cowner = new ComputerOwner(person1);

		cowner.addComputer(new Computer("comp 1", "Intel i7", 16, 1500, false, 1500));
		cowner.addComputer(new Computer("comp 2", "Ryzen 5", 16, 500, false, 1000));
		cowner.addComputer(new Computer("comp 3", "Intel i9", 32, 2000, true, 1800));
		cowner.addComputer(new Computer("comp 4", "Ryzen Threadripper", 32, 2000, true, 2300));

		System.out.println(cowner);

		// cowner.removeComputer(0);
		// cowner.removeComputer(0);

		System.out.println(cowner);

		try (PrintWriter output = new PrintWriter(
				new FileOutputStream(new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR ComputerOwner.java:");

			// Copy all your lines above, add an extra "2" to every variable name
			// and replace every System.out.print or System.out.println
			// by output.print or output.println
			output.println(cowner);

			cowner.removeComputer(0);
			cowner.removeComputer(0);

			output.println(cowner);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
