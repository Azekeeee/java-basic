public class homework7 {

    //Домашнее задание №7
    //Task 1
    public static int findMinimum(int a, int b, int c) {

        if (a <= b && a <= c) {
            return a;
        } else if (b <= a && b <= c) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        int firstNumber = 25;
        int secondNumber = 37;
        int thirdNumber = 29;
        int minimumValue = findMinimum(firstNumber, secondNumber, thirdNumber);
        System.out.println("Наименьшее значение: " + minimumValue);
    }

    //Task 2

    public static double calculateAverage(int a, int b, int c) {
        return (double) (a + b + c) / 3;
    }

    public static void main(String[] args) {
        int firstNumber = 25;
        int secondNumber = 45;
        int thirdNumber = 65;

        double averageValue = calculateAverage(firstNumber, secondNumber, thirdNumber);
        System.out.println("Среднее значение: " + averageValue);
    }
}




