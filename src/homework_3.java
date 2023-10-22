public class homework_3 {
    public static void main(String[] args) {

        // Домашнее задание №3 1
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
        System.out.println("--------------");
        double jDouble;
        jDouble = 27.8;
        System.out.println("значение: " + jDouble);
        jDouble = 31.1;
        System.out.println("new: " + jDouble);

        double Pi = 3.14;
        double Gravity = 9.8;
        String Home = "Кызылорда";
        System.out.println("Значение ПИ: " + Pi);
        System.out.println("Значение гравитации: " + Gravity);
        System.out.println("Мой Родной Город: " + Home);

        byte Byte = 1;
        short Short = 100;
        int Int = 100000;
        long Long = 1000000001;
        double Double = 3.14;
        float Float = 3.14F;
        boolean Boolean = true;
        char Char = 'A';
        String String = "ZXC";

        System.out.println("byte: " + Byte);
        System.out.println("short: " + Short);
        System.out.println("int: " + Int);
        System.out.println("long: " + Long);
        System.out.println("double: " + Double);
        System.out.println("float: " + Float);
        System.out.println("boolean: " + Boolean);
        System.out.println("char: " + Char);
        System.out.println("String: " + String);

        // 3
        System.out.println("--------------");

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
