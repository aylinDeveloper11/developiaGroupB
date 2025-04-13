package Lesson42;

import java.util.Iterator;

public class Drawning extends Thread {
	
public void run() {
	 for (int b = 1; b<= 5; b++) {
			System.out.println("Я рисую архитектуру");
			try {
                 Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			
	 }
			
}
}
