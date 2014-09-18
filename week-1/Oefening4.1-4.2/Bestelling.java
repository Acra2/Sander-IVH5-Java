import java.util.ArrayList;


public class Bestelling {
	
	private ArrayList<Product> bestellijst;

	private Klant klant;
	
	
	public Bestelling(Klant klant, ArrayList<Product> bestellijst){
		this.klant = klant;	
		this.bestellijst = bestellijst;
	}
	
	public void print(){
		System.out.println("klant naam: " + klant.getNaam());
		System.out.println("klant nummer: " +klant.getNummer());
		System.out.println();
		System.out.println("bestelling:");
		for(Product product:bestellijst){
			
			System.out.println(product.toString()+  " " + product.getPrijs());
		}
		System.out.println();
	}
	
}
