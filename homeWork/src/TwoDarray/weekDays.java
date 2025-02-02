package TwoDarray;

public class weekDays {
	 public static void main(String[] args) {
	        String[][] daysOfWeek = {
	                {"1", "Понедельник"},
	                {"2", "Вторник"},
	                {"3", "Среда"},
	                {"4", "Четверг"},
	                {"5", "Пятница"},
	                {"6", "Суббота"},
	                {"7", "Воскресенье"}
	            };

	        for (int i = 0; i < daysOfWeek.length; i++) {
	        	for (int j = 0; j < daysOfWeek[i].length; j++) {
	                System.out.print(daysOfWeek[i][j] + " ");
	            }
	            System.out.println();
	        }
	        
	    
	        
	 }
}
