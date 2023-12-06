public class homework_3 {
    public static void main(String[] args) {

        // Домашнее задание №3
        String flowersName = "Roses ";
        String flowersNumber = "101";
        System.out.println(flowersName + flowersNumber);

        int a = 15;
        int b = 10;
        int c = a + b;
        System.out.println(c);

        int x = 15, y = 10, z = 25;
        int v = x + y + z;
        System.out.println(v);

        int u = 1, i = 1, o = 1, p = 1;
        int n = u + i + o + p;
        System.out.println(n);

        // 2
        double jDouble;
        jDouble = 27.8;
        System.out.println("значение: " + jDouble);
        jDouble = 31.1;
        System.out.println("new: " + jDouble);

        double pi = 3.14;
        double gravity = 9.8;
        String home = "Кызылорда";
        System.out.println("Значение ПИ: " + pi);
        System.out.println("Значение гравитации: " + gravity);
        System.out.println("Мой Родной Город: " + home);

        byte byteVariable = 1;
        short shortVariable = 100;
        int intVariable = 100000;
        long longVariable = 1000000001;
        double doubleVariable = 3.14;
        float floatVariable = 3.14F;
        boolean booleanVariable = true;
        char charVariable = 'A';
        String stringVariable = "ZXC";

        System.out.println("byte: " + byteVariable);
        System.out.println("short: " + shortVariable);
        System.out.println("int: " + intVariable);
        System.out.println("long: " + longVariable);
        System.out.println("double: " + doubleVariable);
        System.out.println("float: " + floatVariable);
        System.out.println("boolean: " + booleanVariable);
        System.out.println("char: " + charVariable);
        System.out.println("String: " + stringVariable);

        // 3

        /*int intValue = 100;
        long longValue = intValue;
        float floatValue = 3.14F;
        double doubleValue = floatValue;

        System.out.println("int to long: " + longValue);
        System.out.println("float to double: " + doubleValue);*/

        double doubleValue = 123.456;
        int intValue = (int) doubleValue;

        long longValue = 1000000000L;
        int intFromLong = (int) longValue;

        System.out.println("double to int: " + intValue);
        System.out.println("long to int: " + intFromLong);
    }
}
