import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zadatak_6 {

	public static void main(String[] args) throws FileNotFoundException {
		/*
		 * Dana, 17.01. po najvecem snijegu ucesnici BILD IT Osnove su trcali maraton
		 * velike duzine na podrucju grada Javatown. Vremena koja su ucesnici ostvarili
		 * nalaze se u fajlu maraton.txt u sledecem formatu: imeUcesnika
		 * vrijemeKojeJeOstvario tj. ime ucesnika i njegovo vrijeme u minutama su
		 * odvojeni space-om.
		 *
		 * 6.Napisati program koji ispisuje koliko ima linija u fajlu koji se nalazi na
		 * sledecoj adresi: http://www.textfiles.com/science/astronau.txt
		 */
		
		if (args.length != 1) {
			System.out.print("Argument nije pronaðen. ");
			System.exit(0);
		}
		File sourceFile = new File(args[0]);
		if (!sourceFile.exists()) {
			System.out.println("Source file nije pronaðen! ");
			System.exit(1);
		}
		Scanner input = new Scanner(sourceFile);
		int characters = 0, words = 0, lines = 0;
		while (input.hasNext()) {

			String s = input.nextLine();
			lines++;
			String[] split = s.split(" ");
			for (int i = 0; i < split.length; i++)
				if (split[i].length() == 1)
					characters++;
				else
					words++;
		}
		System.out.print("U fajlu koji se nalazi na sledecoj adresi: http://www.textfiles.com/science/astronau.txt");
		System.out.print("\nLinije: " + lines);
		// System.out.print("\nRijeèi: " + words + "\nKarakteri: " + characters);
		input.close();
	}

	
		
		
		
		
		
	}


