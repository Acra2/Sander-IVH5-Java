package Oefening4_8;

public abstract class Huisdier {
	private String naam;
	
	public Huisdier(String naam){
		this.naam = naam;
	}
	
	
	 public String getNaam(){
		 return naam;
	 }
	 
	abstract public void maakGeluid();
		
	
}
