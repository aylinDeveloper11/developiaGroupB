package homeWork;

import java.util.Random;

public class newRandom {
    public static void main(String[] args) {
//    	Напишите программу, которая генерирует 10 случайных чисел и считает их сумму.
        Random random = new Random();
        int sum = 0;

        for (int i = 0; i < 10; i++) {         
            sum += random.nextInt(100);
        }

        System.out.println(sum);
    }
}
