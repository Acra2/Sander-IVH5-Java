package Oefening4_6;

public class Main {

	public static void main(String[] args) {
		Kat ka1 = new Kat("Harry");
		Hond ho1 = new Hond("Fred");
		Hamster ha1 = new Hamster("kees");
		
		
		Dierenwinkel dw = new Dierenwinkel();
		dw.voegtoe(ka1);
		dw.voegtoe(ho1);
		dw.voegtoe(ka1);
		
		dw.printOverzicht();
		System.out.println();
		System.out.println("Kat:");
		System.out.println("Naam: "+ka1.getNaam());
		ka1.maakGeluid();
		ka1.spin();
		System.out.println();
		System.out.println("Hond:");
		System.out.println("Naam: "+ho1.getNaam());
		ho1.maakGeluid();
		ho1.kwispel();
		System.out.println();
		System.out.println("Hamster:");
		System.out.println("Naam: "+ha1.getNaam());
		ha1.maakGeluid();
		
		
		
	}

}
