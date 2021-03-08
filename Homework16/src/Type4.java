package com.company;

public class Type4 {

    public static void main(String args[]) {

// Найти среднее значение суммы чисел от 1 до 100//

            float number= 0;
            for(int i = 1; i<=100; i ++){
                number = number+i;
            }
            System.out.printf("Middle Number = %.2f", number/100);
    }
}