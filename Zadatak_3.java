import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zadatak_3 {
	public static void main(String[] args) throws FileNotFoundException {
		// 3. Napisati program koji pita korisnika da unese ime, a zatim ispisuje
		// vrijeme koje je ucesnik pod tim imenom ostvario u maratonu citajuci ga iz
		// fajla. Text3

		if (args.length != 1) {
			System.out.print("Argument nije prona�en. ");
			System.exit(0);
		}
		File sourceFile = new File(args[0]);
		if (!sourceFile.exists()) {
			System.out.println("Source file nije prona�en! ");
			System.exit(1);
		}
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite ime u�esnika: ");
		String ime = input.nextLine();
		vrijeme(sourceFile, ime);
		input.close();
	}

	public static void vrijeme(File sourceFile, String ime) throws FileNotFoundException {
		Scanner input = new Scanner(sourceFile);
		boolean found = false;
		int vrijeme = 0;

		do {
			String s = input.nextLine();
			String[] list = s.split(" ");
			if (list[0].equals(ime)) {
				vrijeme = Integer.parseInt(list[1]);
				found = true;
				System.out.println("Vrijeme u�esnika je:" + vrijeme);
			}
		} while (input.hasNextLine() && found == false);
		if (found == false) {
			System.out.println("Ne postoji ime u�esnika:");

		}
	}
}
