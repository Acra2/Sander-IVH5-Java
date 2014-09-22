package oefening4_3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Studieprogramma sp1 = new Studieprogramma(new Datum(1,1,2010), new Datum(31,12,2010));
		sp1.addVak("Nederlands");
		sp1.addVak("Engels");
		sp1.addVak("Scheikunde");
		sp1.addVak("Natuurkunde");
		
		Student s1 = new Student("Sander", 456, sp1 ,new Datum(31,12,1995));
		
		System.out.println("Studentnaam: " + s1.getNaam());
		System.out.println("Studentnr: " + s1.getNr());
		System.out.println("Studentgeboortedatum: " + s1.getGeboorteDatum());
		System.out.println();
		System.out.println("Vaklijst voor periode van "+ sp1.getstartdatum()  +" tot en met "+sp1.getEinddatum()+":");
		
		int i = 1;
		for(Vak vak: sp1.getVaklijst()){
			System.out.println("Vak"+ i + ": "+ vak.toString());
			i ++;
		}
		
	}
}

	
	
