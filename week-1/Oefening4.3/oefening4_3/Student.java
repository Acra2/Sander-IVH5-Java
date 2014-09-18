package oefening4_3;

public class Student {
	private String naam;
	private int nr;
	private Datum gbDatum;
	
	public Student(String naam, int nr, Datum datum){
		this.naam = naam;
		this.nr = nr;
		this.gbDatum = datum;
	}
	
	
	public String getNaam(){
		return naam;
	}
	
	public int getNr(){
		return nr;
	}
	
	public String getGeboorteDatum(){
		String geboorteDatum = gbDatum.getDag() + "-" + gbDatum.getMaand() + "-" + gbDatum.getJaar();
		
		return geboorteDatum;
	}
	
	
}
