package Oefening4_10;

public abstract class abstractHuisdier {
	private String naam;
	
	public abstractHuisdier(String naam){
		this.naam = naam;
	}
	
	public String getNaam(){
		return naam;
	}
	
	abstract public void maakGeluid();
}
