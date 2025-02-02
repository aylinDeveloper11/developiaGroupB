package homeWork;

public class ContiniumAndBreakHomeWork2 {
	  public static void main(String[] args) {

//Задание 2:  Напишите программу, которая перебирает числа от 1 до 50 и находит первое число, которое делится на 3 и 5.
//
//Когда такое число найдено, программа должна завершить цикл (используйте break).
//Выведите это число на экран.
		  
		  for (int i = 1; i <= 50; i++) {
			  if (i % 3 == 0 && i % 5 == 0) {
	                System.out.println(i);
	                break;
			  }
		  }
		  
		  
		  
		  
		  
		  
		  
	  }

}
