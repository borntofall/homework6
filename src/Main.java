public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");


        for (int a = 1; a <= 10; a++) {
            System.out.println(a);
        }

        System.out.println("Задача 2");

        for (int b = 10; b >= 1; b = b - 1) {
            System.out.println(b);
        }

        System.out.println("Задача 3");

        for (int c = 0; c <= 17; c = c + 2) {
            System.out.println(c);
        }

        System.out.println("Задача 4");

        for (int d = 10; d >= -10; d = d - 1) {
            System.out.println(d);
        }

        System.out.println("Задача 5");

        for (int year = 1904; year <= 2096; year = year + 4) {
            System.out.printf("%s год является високосным \n", year);
        }

        System.out.println("Задача 6");

        for (int e = 7; e <= 98; e = e + 7) {
            System.out.println(e);
        }

        System.out.println("Задача 7");

        for (int e = 1; e <= 512; e = e * 2) {
            System.out.println(e);
        }

        System.out.println("Задача 8");

        int money = 29000;
        int total = 0;

        for (int month = 1; month <= 12; month++) {
            total = total + money;
            System.out.println("Месяц " + month + " , сумма накоплений равна " + total + " рублей");
        }

        System.out.println("Задача 9");

        money = 29000;
        total = 0;

        for (int month = 1; month <= 12; month++) {
            total = total + money;
            total = total + total/100;
            System.out.println("Месяц " + month + " , сумма накоплений равна " + total + " рублей");
        }

        System.out.println("Задача 10");

        int number = 2;
        for (int q = 1; q <= 10; q++) {
            System.out.println(  number + "*" + q +  " = " + number * q );
        }
    }
}