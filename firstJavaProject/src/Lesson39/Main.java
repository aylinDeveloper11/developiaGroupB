package Lesson39;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
public static void main(String[] args) {
    List<Integer> numbers = new ArrayList<>();
    numbers.add(12);
    numbers.add(2);
    numbers.add(36739);
    numbers.add(76);
    numbers.add(9);
    numbers.add(18);
    numbers.add(11);
    numbers.add(986125);
    numbers.add(5);
    
    System.out.println(numbers);

List<Integer> evenNumbers = numbers.stream().filter(n ->n %5==0).map(n -> n*2).collect(Collectors.toList());

System.out.println(evenNumbers);
    
    

}
}
