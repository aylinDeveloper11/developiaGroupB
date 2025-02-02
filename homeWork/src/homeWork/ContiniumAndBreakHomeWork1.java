package homeWork;

public class ContiniumAndBreakHomeWork1 {
	  public static void main(String[] args) {
		  
		  //Задание: Напишите программу, которая перебирает числа от 1 до 50.

          //Если число кратно 7, пропустите его (используйте continue).
          //Если число равно 42, завершите выполнение цикла (используйте break).
          //Выведите на экран все числа, которые не были пропущены.

		  
		  for (int a = 0; a <=50; a++) {
		        if(a % 7 == 0) {
			   continue;
		      }
		        
		        if (a == 42) {
	                break;
	            }
		        
		        
		        System.out.print(a);
		      }

		  
		  
		  
		  
		  
	  }
}
