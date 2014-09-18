import java.util.ArrayList;


public class Bestelling {
	
	private ArrayList<Product> producten;

	public Bestelling(){
		producten = new ArrayList<>();
		
		producten.add(new Product("hamburger",56.26));
		producten.add(new Product("pizza",16.25));
		
	}
	
	
	
}
