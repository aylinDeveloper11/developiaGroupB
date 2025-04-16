package Flow3;

public class Main {
public static void main(String[] args) {
	Coffee coffee = new Coffee();
	
	Thread producerThread = new Thread(() -> {
	 for (int i = 0; i < 5; i++) {
		try {
			coffee.put();
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
	}
});
	
	Thread consomerThread =  new Thread(() -> {
		for (int i = 0; i < 5; i++) {
			try {
				coffee.get();
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
	});
	
	producerThread.start();
	consomerThread.start();
	
}
}
