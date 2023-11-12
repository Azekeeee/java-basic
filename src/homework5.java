public class homework5 {
    public static void main(String[] args) {
        //Домашнее задание №5
        //Task 5.1

        int w = 5, h = 5;
        if (w == h) {
            System.out.println("Это квадрат");
        } else {
            System.out.println("Не квадрат");
        }

        //Task 5.2

        int sum = 10000;
        double discount = 0.1;
        double finPrice = sum;

        if (sum > 5000) {
            finPrice = sum - sum * discount;
        }
        System.out.println(finPrice);

        //Task 5.3

        int grade = 100;
        String result = "";

        if (grade > 0 && grade < 25) {
            result = "F";
        } else if (grade >= 25 && grade < 45) {
            result = "E";
        } else if (grade >= 45 && grade < 50) {
            result = "D";
        } else if (grade >= 50 && grade < 60) {
            result = "C";
        } else if (grade >= 60 && grade < 80) {
            result = "B";
        } else if (grade >= 80) {
            result = "A";
        }
        System.out.println(result);

        //Task 5.4

        int n = 12345;

        while (n > 0) {
            int r = n % 10;
            n = n / 10;
            System.out.print(r);
        }
        System.out.println("");

        //Task 5.5

        int num = 1;
        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }

        //Task 5.6

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        String s = "";

        for (int i = 0; i < 5; i++) {
            s += "*";
            System.out.println(s);
        }

        /*String s = "";

        for (int i = 1; i <= 5; i++) {
            if (i==1)
                s = s + i;
            else
                s = i + s + i;
            for (int j = 5 - i; j > 0; j++) {
                System.out.print(" ");
            }
            System.out.println(s);
        } */

        //Task 5.7

        int a = 5;
        int b = 10;

        int sum1 = 0;

        if (a <= b) {
            for (int i = a; i <= b; i++) {
                sum1 += i;
            }
            System.out.println("Сумма натуральных чисел от " + a + " до " + b + ": " + sum1);
        } else {
            System.out.println("Значение a должно быть меньше или равно b.");
        }

        //Task 5.8

        int salary = 1000;
        char grade1 = 'A';
        double bonus = 0;

        switch (grade1) {
            case 'A':
                bonus = 0.5;
                break;
            case 'B':
                bonus = 0.25;
                break;
            default:
                bonus = 0;
        }
        System.out.println(salary + salary + bonus);

        //Task 5.9

        int z = 10;

        int p1 = 0, p2 = 1;

        for (int i = 2; i < z; i++) {
            int result1 = p1 - p2;
            System.out.print(result1 + " ");

            p1 = p2;
            p2 = result1;


        }
    }
}





