package Lesson42;

import java.util.Iterator;

public class Music implements Runnable {
 
	public void run() {
		 for (int a = 1; a<= 10; a++) {
			System.out.println("Я слушаю музыку");
			
			try {
				Thread.sleep(3500);
			} catch (InterruptedException e) {
			}
			
		}
	}
}
