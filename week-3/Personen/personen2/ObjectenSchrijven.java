package personen2;

import java.io.*;
import java.util.ArrayList;

import personen2.persoon2;

public class ObjectenSchrijven {

	public static void main(String[] args) {
		persoon2 p1 = new persoon2("Sander", "SchijfStraat 26B", "Teteringen");
		persoon2 p2 = new persoon2("Jeroen", "SchijfStraat 26B", "Teteringen");
		persoon2 p3 = new persoon2("Femke", "SchijfStraat 26B", "Teteringen");

		ArrayList<persoon2> lijst = new ArrayList<>();

		lijst.add(p1);
		lijst.add(p2);
		lijst.add(p3);

		String filenaam = "C:/Users/Sander Blijlevens/git/Sander-Blijlevens/week-3/Personen/personen2/personen2.txt";
		try {
			ObjectOutputStream uit = new ObjectOutputStream(
					new FileOutputStream(filenaam));

			uit.writeObject(lijst);
			uit.close();

		} catch (IOException e) {
			System.out.println("Fout bij openen bestand " + filenaam);
			e.printStackTrace();
		}

	}

}
