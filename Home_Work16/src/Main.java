import java.util.Scanner;
class Main {
    /* Необходимо написать программу, где бы пользо2вателю предлагалось ввести число на выбор:
    1, 2 или 3, а программа должна сказать, какое число ввёл пользователь: 1, 2, или 3.
    Написать двумя способами.*/
//TODO If
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("введи число: ");
        String[] answer = {"1", "2", "3"};
        int tmp = userInput.nextInt();
        if (tmp >= 0 && tmp <= answer.length) {
            System.out.println("введено : " + answer[tmp - 1]);
        }
//TODO  Switch
        Scanner userInput2 = new Scanner(System.in);
        System.out.println("введи число: ");
        int tmp2 = userInput2.nextInt();
        switch (tmp2) {
            case 1 -> System.out.println("веденно : 1");
            case 2 -> System.out.println("введено : 2");
            case 3 -> System.out.println("введено : 3");
        }
//Необходимо вывести на экран числа от 5 до 1. На экране должно быть: 5 4 3 2 1
        for (int e = 5; e > 0; e--)
            System.out.print( e + " ");
        System.out.print("\n");
// TODO вот еще так можно было
        var num = 5;
        while (num >= 1){
            System.out.print(num+" ");
            num--; }
        System.out.print("\n");
//Необходимо вывести на экран таблицу умножения на 3:
        for (int i = 3; i <= 3; i++) {
            int j;
            for (j = 1; j <= 10; j++)
                System.out.println(" " + i + "*" + j + "=" + (i * j));
         }
// Найти среднее значение суммы чисел от 1 до 100.
        // TODO: 08.03.2021 Эотт код я взял с сайта  и немного дополнил его


        int nmb;
        int summa = 0;
        int delenie = 0;
        for(nmb= 1; nmb<= 100; nmb++){
            summa = summa + nmb;
            delenie = summa / 100;
        }
        System.out.println(summa+1);
        System.out.println(delenie);





    }
}