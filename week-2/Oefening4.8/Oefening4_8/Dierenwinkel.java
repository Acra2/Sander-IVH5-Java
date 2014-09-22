package Oefening4_8;

import java.util.ArrayList;

public class Dierenwinkel {
	
	private ArrayList<Huisdier> lijst;
	
	public Dierenwinkel(){
		lijst = new ArrayList<Huisdier>();
	}

	public void voegtoe (Huisdier dier){
		lijst.add(dier);
	}
	
	public void printOverzicht(){
		int i = 1;
		for (Huisdier dier : lijst){
			System.out.println("Naam dier" + i + ": " + dier.getNaam());
			i ++;
		}
	}
}
