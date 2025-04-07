package Date;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
	public static void main(String[] args) {
        //1
        LocalDate currentDate = LocalDate.now(); 
        LocalDate dateIn7Days = currentDate.plusDays(7); 
        
        System.out.println(currentDate);
        System.out.println("Дата через 7 дней: " + dateIn7Days);
        
        //2
        LocalTime currentTime = LocalTime.now();
        LocalTime newTime = currentTime.plusMinutes(45);
        
        System.out.println(currentTime);
        System.out.println("Время через 45 минут: " + newTime);


    }
}
