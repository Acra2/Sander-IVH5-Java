package oefening4_3;
import java.util.ArrayList;

public class Studieprogramma {

	
	private ArrayList<Vak> vaklijst;
	private Datum startdatum;
	private Datum einddatum;
	
	
	public Studieprogramma(Datum startdatum, Datum einddatum){
		this.startdatum = startdatum;
		this.einddatum = einddatum;
		vaklijst = new ArrayList<Vak>();
		
	}
	
	
	public void addVak(String vakNaam){
		vaklijst.add(new Vak(vakNaam));
	}
	
	public String getEinddatum(){
		return einddatum.getDag() + "-" + einddatum.getMaand()  + "-" +  einddatum.getJaar();
	}
	
	public String getstartdatum(){
		return startdatum.getDag() + "-" + startdatum.getMaand()  + "-" +  startdatum.getJaar();
	}

	public ArrayList<Vak> getVaklijst(){
		return vaklijst;
	}
	
}
