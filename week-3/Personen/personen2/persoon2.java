package personen2;

import java.io.*;

public class persoon2 implements Serializable {
	private String naam;
	private String adres;
	private String woonplaats;
	
	public persoon2(String naam, String adres, String woonplaats){
		this.naam = naam;
		this.adres = adres;
		this.woonplaats = woonplaats;
	}
	
	public String getNaam(){
		return naam;
	}
	
	public String getAdres(){
		return adres;
	}
	
	public String getWoonplaats(){
		return woonplaats;
	}
	
}
