package taskThreadDemoMoja;



public class PrintNumMoja implements Runnable{
	private int aantal;
	private int i;
	
	public PrintNumMoja(int aantal){

		this.aantal = aantal;
	}	
	
		@Override
		public void run() {
		for (i=0; i <= aantal; i++){
			System.out.print(i);
		
		}
			
		}
	
	
}

