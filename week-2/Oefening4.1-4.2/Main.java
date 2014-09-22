import java.util.ArrayList;


public class Main {

	public static void main(String[] args) {
		Klant k1 = new Klant("Sander",3112);
		Product p1 = new Product("pizza",16.25);
		Product p2 = new Product("hamburger",15.61);
		ArrayList<Product> bestellijst = new ArrayList<Product>();
		bestellijst.add(p1);
		bestellijst.add(p2);
		Bestelling b1 = new Bestelling(k1,bestellijst);
		b1.print();
	}

	
	
}
