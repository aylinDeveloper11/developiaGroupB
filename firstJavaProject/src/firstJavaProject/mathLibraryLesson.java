package firstJavaProject;

public class mathLibraryLesson {
	  public static void main(String[] args) {
		  //Модуль числа
		  System.out.println(Math.abs(-25683890));
		  
		  //max and min
		  System.out.println(Math.min(134,143));
		  System.out.println(Math.max(134,143));

		  //возведение в степень
		  System.out.println(Math.pow(11,3));

		  //round-округляет до ближайшего целого числа(обычное округление)
		  System.out.println(Math.round(5.6));
		 
		  //flour-округляет до ближайшего меньшего целого числа
		  System.out.println(Math.floor(6.9));

		  //ceil-округляет до ближайшего большего целого числа
		  System.out.println(Math.ceil(7.2));

           // число в каком-либо диапозоне
		  System.out.println( (int) (Math.random() *50)+30);

		  
	  }
}
