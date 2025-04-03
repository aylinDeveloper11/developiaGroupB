package FunctionalInterface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Test {
public static void main(String[] args) {

//принимиает переменную типа T и возвращает Boolean(true,false)
	Predicate<Integer> isEven = a -> a > 10;
	System.out.println(isEven.test(143));
	
	Predicate<String> idkPredicate = a -> a.length() >7;
    System.out.println(idkPredicate.test("Java"));
    
    
    
//принимает значение типа T и возвращает значение типа R
    Function<String, Integer> lengthFunction = str -> str.length();
    Integer excapleInteger = lengthFunction.apply("Hi");
    System.out.println(excapleInteger);
    
    Function<String, String> otherFunction = str -> str.toUpperCase();
    String string = otherFunction.apply("Something");
    System.out.println(string);
    
    
    
// принимает переменную T и не возвращает
// принимает переменную типа S и не возвращает
    Consumer<String> wordConsumer = str -> System.out.println(str);
    wordConsumer.accept("World");
    
	Consumer<Integer> printerConsumer = str -> System.out.println(str);
    printerConsumer.accept(24);
    
   
   
//ничего не принимает но возвращает элемент типа T
    Supplier<Double> randomNumberSupplier = () -> Math.random();
    System.out.println(randomNumberSupplier.get());
 
}  
}
