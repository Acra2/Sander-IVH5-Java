package oefening4_3;

public class Student {
	private String naam;
	private int nr;
	private Datum gbDatum;
	private Studieprogramma sp;
	
	public Student(String naam, int nr, Studieprogramma sp ,   Datum datum){
		this.naam = naam;
		this.nr = nr;
		this.gbDatum = datum;
		this.sp = sp;
	}
	
	
	public String getNaam(){
		return naam;
	}
	
	public int getNr(){
		return nr;
	}
	
	public String getGeboorteDatum(){
		return gbDatum.getDag() + "-" + gbDatum.getMaand() + "-" + gbDatum.getJaar();
 
	}
	
	
}
