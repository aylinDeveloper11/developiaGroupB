package Date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Test {
	public static void main(String[] args) {
	// возвращает дату
	LocalDate date = LocalDate.now();
	System.out.println(date);
	
	LocalDate spesificDate = LocalDate.of(2017, 3, 25);
	System.out.println(spesificDate);
	
	//возвращает время
	
	LocalTime time = LocalTime.now();
	System.out.println(time);
	
	LocalTime specificTime1 = LocalTime.of(5, 20);
	System.out.println(specificTime1);
	
	LocalTime specificTime2 = LocalTime.of(5, 20, 34);
	System.out.println(specificTime2);
	
	LocalTime specificTime3 = LocalTime.of(5, 20, 34, 143);
	System.out.println(specificTime3);
	
	
	//возвращает дату и время
	 LocalDateTime dateTime = LocalDateTime.now();
	 System.out.println(dateTime);
	 
	 LocalDateTime specificDateTime = LocalDateTime.of(2024, 6, 25, 14, 00);
	 System.out.println(specificDateTime);
	 
	 
	 LocalDateTime specificDateTime2 = LocalDateTime.of(spesificDate,specificTime1);
	 System.out.println(specificDateTime2);

	
	}
}
