package Date;

import java.time.LocalDate;

public class Main {
public static void main(String[] args) {
	LocalDate spesificDate = LocalDate.of(2012, 03, 10);
	System.out.println(spesificDate);
	System.out.println(spesificDate.plusMonths(1));
	System.out.println(spesificDate.plusWeeks(2));

}
}