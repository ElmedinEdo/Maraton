import java.io.File;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import java.util.Arrays;
import java.util.Scanner;

public class Zadatak_5 {
	public static void main(String[] args) throws IOException {
		// Napisati program koji prolazi kroz fajl maraton.txt, pronalazi ucesnike
		// koji su zavrsili maraton za manje od 300 minuta, zatim sprema njihova imena i
		// vrijeme u novi fajl pod nazivom najboljiMaratonci.txt
		// Text5 imena najboljih file+ ".txt"

		Scanner input = new Scanner(System.in);
		System.out.println("Unesite ime file: ");
		String file = input.nextLine();
		File sourceFile = new File(file + ".txt");
		maratonci(sourceFile);
	}

	public static void maratonci(File sourceFile) throws IOException {
		Scanner input;
		input = new Scanner(sourceFile);
		int[] rezultat = new int[25];
		int i = 0;
		while (input.hasNextLine()) {
			String s = input.nextLine();
			String[] list = s.split(" ");
			rezultat[i] = Integer.parseInt(list[1]);
			i++;
		}
		rezultat = Arrays.copyOfRange(rezultat, 0, i);
		Arrays.sort(rezultat);

		File create = new File("najboljiMaratonci.txt");
		create.createNewFile();

		PrintWriter writer = new PrintWriter(new FileWriter(create));
		for (i = 0; i < rezultat.length; i++) {
			input = new Scanner(System.in);
			input = new Scanner(sourceFile);
			boolean found = false;
			do {
				String s = input.nextLine();
				String[] list = s.split(" ");
				if (rezultat[i] < 300) {
					if (Integer.parseInt(list[1]) == rezultat[i]) {
						System.out.println((i + 1) + "." + list[0] + ":" + list[1]);
						writer.write(list[0] + " " + list[1]);
						writer.println("");
						found = true;
					}
				} else {
					break;
				}
			} while (found == false);
		}
		writer.close();

	}

}
