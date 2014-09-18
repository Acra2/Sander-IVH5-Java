package oefening4_3;
import java.util.ArrayList;

public class Studieprogramma {

	private Student student;
	private ArrayList<Vak> vaklijst;
	private Datum startdatum;
	private Datum einddatum;
	
	
	public Studieprogramma(Student student, ArrayList<Vak> vaklijst, Datum startdatum, Datum einddatum){
		this.student = student;
		this.vaklijst = vaklijst;
		this.startdatum = startdatum;
		this.einddatum = einddatum;
	}
	
	
	
	
	public void print(){
		System.out.println("Studentnaam: " + student.getNaam());
		System.out.println("Studentnr: " + student.getNr());
		System.out.println("Studentgeboortedatum: " + student.getGeboorteDatum());
		System.out.println();
		System.out.println("Vaklijst voor periode van "+ startdatum.getDag() +"-"+ startdatum.getMaand() +"-"+ startdatum.getJaar()  +" tot en met "+ startdatum.getDag() +"-"+ einddatum.getMaand() +"-"+ einddatum.getJaar()+":");
		for(Vak vak:vaklijst){
			System.out.println(vak.toString());
		}
		
		
	}
	
	
}
