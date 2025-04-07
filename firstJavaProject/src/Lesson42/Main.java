package Lesson42;

import java.util.Iterator;

public class Main {
public static void main(String[] args) {

	Drawning drawning = new Drawning();
	drawning.start();
	
	Thread music = new Thread(new Music());
	music.start();
	
}
}
