package Text;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

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
		  
	        Scanner scanner = new Scanner(System.in); 

	        System.out.print("Введите ваше имя: ");
	        String name = scanner.nextLine();  

	        try {
	            FileWriter writer = new FileWriter("C:\\Users\\LENOVO\\Desktop\\Aylin.txt");  
	            writer.write(name);  
	            writer.close();  
	            System.out.println("Имя сохранено в файл!");
	        } catch (IOException e) {
	            System.out.println("Произошла ошибка при сохранении имени.");
	            e.printStackTrace();
	        }

	        scanner.close(); 
	    }
	}


