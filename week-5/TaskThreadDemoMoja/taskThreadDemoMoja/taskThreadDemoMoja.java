package taskThreadDemoMoja;

public class taskThreadDemoMoja {

	public static void main(String[] args) {
		Runnable printA = new PrintCharMoja('a', 100);
		Runnable printB = new PrintCharMoja('b', 100);
		Runnable print100 = new PrintNumMoja(100);
		
		Thread thread1 = new Thread(printA);
		Thread thread2 = new Thread(printB);
		Thread thread3 = new Thread(print100);
		
		thread1.run();
		thread2.start();
		thread3.start();

	}

}
