package Oefening4_10;

public class Main {

	public static void main(String[] args) {
		abstractHuisdier ka1 = new Kat("Harry");
		abstractHuisdier ho1 = new Hond("Fred");

		System.out.println("Kat:");
		System.out.println("Naam: "+ka1.getNaam());
		ka1.maakGeluid();
		System.out.println();
		
		System.out.println("Hond:");
		System.out.println("Naam: "+ho1.getNaam());
		ho1.maakGeluid();
	}

}
