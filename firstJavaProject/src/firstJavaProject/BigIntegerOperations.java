package firstJavaProject;

import java.math.BigInteger;

public class BigIntegerOperations {
    public static void main(String[] args) {
        BigInteger firstNumber = new BigInteger("1234617839390000356789012345678901234567890");
        BigInteger secondNumber = new BigInteger("987654321098765432109876543210");

       
        BigInteger sum = firstNumber.add(firstNumber);
        System.out.println("Сумма: " + sum);
        
     
        BigInteger difference = firstNumber.subtract(secondNumber);
        System.out.println("Разность: " + difference);
    }
}
