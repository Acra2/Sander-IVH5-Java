
public class Product {

	private String omschrijving;
	private double prijs;
	
	public double getPrijs(){
		return prijs;
		
	}
	
	public String toString(){
		return omschrijving;
		
	}
	
	public Product(String omschrijving, double prijs){
		omschrijving = this.omschrijving;
		prijs = this.prijs;
	}
	
}
