package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Convert {
	    public static void main(String[] args) {
	    	
	        String[] array = {"apple", "banana", "cherry", "date"};
	     
	        List<String> list = new ArrayList<>(Arrays.asList(array));
	        
	        System.out.println(list);
	        
	        
	        List<String> list2 = new ArrayList<>();
	        list2.add("Meleyke");
	        list2.add("Nara");
	        list2.add("Meleyke");
	        
	        String[] namesArr = list2.toArray(new String[3]);
	        for (String string : namesArr) {
				System.out.println(string);
			}
      
	    }
	}


