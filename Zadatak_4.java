import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zadatak_4 {

	public static void main(String[] args) throws FileNotFoundException {
		// 4.Napisati program koji prolazi kroz fajl maraton.txt i ispisuje prosjecno
		//   vrijeme koje je bilo potrebno ucesnicima da zavrse maraton.
	
		if (args.length != 1) {
			System.out.print("Argument nije pronaðen. ");
			System.exit(0);
		}
		File sourceFile = new File(args[0]);
		if (!sourceFile.exists()) {
			System.out.println("Source file nije pronaðen! ");
			System.exit(1);
		}
		int suma=0;
	    int i=0;
		Scanner input = new Scanner(sourceFile);
		while (input.hasNextLine()) {

			String s = input.nextLine();
			String[] list = s.split(" ");
		       i++;
		    suma=suma + Integer.parseInt(list[1]);
		  
		}
		    System.out.println("Prosjeèno vrijeme koje je bilo potrebno uèesnicima da završe maraton. "+(suma/(double)i));
		    
		input.close();
	
}
}