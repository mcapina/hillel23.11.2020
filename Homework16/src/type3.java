package com.company;

public class type3 {
    public static void main(String args[]) {

        //написать программу, где бы пользователю предлагалось ввести число на выбор:
        //1, 2 или 3, а программа должна сказать, какое число ввёл пользователь: 1, 2, или 3//

        int a = 1;
        if (a == 3) System.out.println(a);
        else if (a == 2) System.out.println(a);
        else if (a == 1) System.out.println(a);


        switch (4) {
            case 1:
                System.out.println("Вы ввели число 1");
                break;
            case 2:
                System.out.println("Вы ввели число 2");
                break;
            case 3:
                System.out.println("Вы ввели число 3");
                break;
            case 4:
                System.out.println("Вы ввели число 4");
                break;
            default:
                System.out.println("Вы ввели неправильное число");
        }
    }
}
