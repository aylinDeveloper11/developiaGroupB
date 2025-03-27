package Map;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
	public static void main(String[] args) {
        Map<String, String> phoneBook = new HashMap<>();
        phoneBook.put("Aylin", "123-456-7890");
        phoneBook.put("Nara", "234-567-8901");
        
    for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
		String key = entry.getKey();
		String val = entry.getValue();
	
		System.out.println(key+" "+ val);
	}     
   
    
    
    }
}
















//"ключ-значение".