public class homework4 {
    public static void main(String[] args) {
        //Домашнее задание №4

        int ResultU = 10 * 5;
        System.out.println("Результат: " + ResultU);

        double ResultD = 20 / 2.5;
        System.out.println("Результат: " + ResultD);

        int length = 15;
        int width = 9;
        int area = length * width;
        int perimeter = 2 * (length + width);
        System.out.println("Площадь прямоугольника: " + area);
        System.out.println("Периметр прямоугольника: " + perimeter);

        int x = 5;
        int resultP = x++;
        System.out.println("Результат: " + resultP);

        int y = 10;
        int resultPP = y + 5;
        System.out.println("Результат: " + resultPP);

        int number1 = 25;
        int number2 = 43;
        if (number1 == number2) {
            System.out.println("Число " + number1 + " равно числу " + number2);
        } else {
            System.out.println("Число " + number1 + " не равно числу " + number2);
        }

      /*  int a = 10;
        int b = 5;
        int addition = a + b;
        System.out.println("Сложение: " + addition);
        int subtraction = a - b;
        System.out.println("Вычитание: " + subtraction);
        int multiplication = a * b;
        System.out.println("Умножение: " + multiplication);
        int division = a / b;
        System.out.println("Деление: " + division);
        int modulus = a % b;
        System.out.println("Деление по модулю: " + modulus);*/

        int number = 451;
        number += 10;
        number /= 3;
        number = Math.abs(number) + 5;
        number *= 5;
        System.out.println("Окончательный результат: " + number);

        int a = 65;
        int b = 80;
        boolean condition1 = a < 50;
        boolean condition2 = a < b;
        boolean bothConditionsAreTrue = condition1 && condition2;
        if (bothConditionsAreTrue) {
            System.out.println("Оба условия верны.");
        } else {
            System.out.println("Не все условия верны.");
        }
    }
}
