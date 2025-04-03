package FunctionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Test {
public static void main(String[] args) {
	 List<String> strings = new ArrayList<>();
     strings.add("hello");
     strings.add("world");
     strings.add("java");
     strings.add("programming");
     
     Consumer<String> printUpperCaseConsumer = str -> System.out.println(str.toUpperCase());
     
}
}
