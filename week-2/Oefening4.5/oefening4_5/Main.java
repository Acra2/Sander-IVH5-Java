package oefening4_5;

public class Main {

	public static void main(String[] args) {
		Kat ka1 = new Kat("Harry");
		Hond ho1 = new Hond("Fred");
		Hamster ha1 = new Hamster("kees");
		System.out.println(ka1.getNaam());
		ka1.maakGeluid();
		ka1.spin();
		System.out.println();
		System.out.println(ho1.getNaam());
		ho1.maakGeluid();
		ho1.kwispel();
		System.out.println();
		System.out.println(ha1.getNaam());
		ha1.maakGeluid();
		
	}

}
