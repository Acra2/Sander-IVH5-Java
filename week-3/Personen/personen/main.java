package personen;

import java.io.*;
import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		Persoon p1 = new Persoon("Sander", "SchijfStraat 26B", "Teteringen");
		Persoon p2 = new Persoon("Jeroen", "SchijfStraat 26B", "Teteringen");
		Persoon p3 = new Persoon("Femke", "SchijfStraat 26B", "Teteringen");

		ArrayList<Persoon> lijst = new ArrayList<Persoon>();

		lijst.add(p1);
		lijst.add(p2);
		lijst.add(p3);

		String filenaam = "C:/Users/Sander Blijlevens/git/Sander-Blijlevens/week-3/Personen/personen/personen.txt";
		try {
			PrintWriter uit = new PrintWriter(new BufferedWriter(
					new FileWriter(filenaam)));
			uit.print("Java ");
			uit.println("en UML");
			for (Persoon persoon : lijst) {
				uit.println(persoon.getNaam() + " " + persoon.getAdres() + " " + persoon.getWoonplaats());
				uit.println();
			}

			uit.close();
		}

		catch (IOException e) {
			System.out.println("Fout bij openen bestand " + filenaam);

			e.printStackTrace();
		}
		
		try{
			BufferedReader in = new BufferedReader(new FileReader("C:/Users/Sander Blijlevens/git/Sander-Blijlevens/week-3/Personen/personen/personen.txt"));
			
			String regel;
			while( ( regel = in.readLine()) != null){
				System.out.println(regel);
			}
			
			in.close();
		}
		catch(FileNotFoundException e){
			System.out.println("kan bestand niet vinden!");
		}
		catch(IOException e){
			System.out.println("Fout bij het lezen of sluiten bestand");
			e.printStackTrace();
		}
		
	}
}
