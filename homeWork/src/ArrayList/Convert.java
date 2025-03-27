package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Convert {
	
	    public static void main(String[] args) {
	        String[] array = {"apple", "banana", "cherry", "date"};
	        
	     
	        List<String> list = new ArrayList<>(Arrays.asList(array));
	        
	        System.out.println(list);
	    }
	}


