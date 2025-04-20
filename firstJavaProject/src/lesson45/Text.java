package lesson45;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Text {
public static void main(String[] args) {
	File file = new File("C:\\Users\\LENOVO\\Desktop\\Aylin.txt");
	try {
		if (file.createNewFile()) {
			System.out.println("Файл создан на рабочем столе");
		} else {
		  System.err.println("Файл не создан");
		}
	} catch (IOException aException) {
		// TODO Auto-generated catch block
		aException.printStackTrace();
	}
	
	try { 
		FileWriter writer = new FileWriter("C:\\Users\\LENOVO\\Desktop\\Aylin.txt");
		writer.write("hello Aylin");
		writer.close();
		System.out.println("данные записаны в текст");
		
	} catch (Exception e) {
		System.out.println("данные не записаны");
		e.printStackTrace();
	}
}	
}

