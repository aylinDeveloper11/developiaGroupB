package Map;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
	public static void main(String[] args) {
        Map<String, String> phoneBook = new HashMap<>();
        phoneBook.put("Aylin", "123-456-7890");
        phoneBook.put("Nara", "234-567-8901");
        
        phoneBook.forEach((name, phone) -> {
            System.out.println(name + ": " + phone);
        });
    }
}
