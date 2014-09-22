
public class Product {

	private String omschrijving;
	private double prijs;
	
	
	public Product(String omschrijving, double prijs){
		this.omschrijving = omschrijving;
		this.prijs = prijs;
	}
	
	public double getPrijs(){
		return prijs;	
	}
	
	public String toString(){
		return omschrijving;	
	}
		
}
