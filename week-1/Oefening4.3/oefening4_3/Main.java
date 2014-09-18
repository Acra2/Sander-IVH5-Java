package oefening4_3;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("Sander", 456, new Datum(31,12,1995));
		ArrayList<Vak> vaklijst = new ArrayList<Vak>();
		vaklijst.add(new Vak("Nederlands"));
		vaklijst.add(new Vak("Engels"));
		vaklijst.add(new Vak("Scheikunde"));
		vaklijst.add(new Vak("Natuurkunde"));
		
		Studieprogramma sp = new Studieprogramma(s1, vaklijst, new Datum(1,1,2010), new Datum(31,12,2010));
		sp.print();
	}

}
