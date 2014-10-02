package taskThreadDemoMoja;

public class PrintCharMoja implements Runnable{
	private char letter;
	private int aantal;
	private int i;
	
	public PrintCharMoja(char letter, int aantal){
		this.letter = letter;
		this.aantal = aantal;
	}	
	
		@Override
		public void run() {
		for (i=0; i <= aantal; i++){
			System.out.print(letter);
		
		}
			
		}
	
	
}
