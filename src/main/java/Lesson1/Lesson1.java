package Lesson1;

public class Lesson1 {
    // задание 1
    public static void main(String[] args) {

        // задание 2
        byte b1 = 80;
        System.out.println("Переменная byte: " + b1);
        short s1 = 5000;
        System.out.println("Переменная short: " + s1);
        int i1 = 90000;
        System.out.println("Переменная int: " + i1);
        long l1 = 1025575L;   // 64bit 88888888L определяет ка Long иначе int
        System.out.println("Переменная long: " + l1);
        float f1 = 220.0f;
        System.out.println("Переменная float: " + f1);
        double d1 = 25.4;
        System.out.println("Переменная double: " + d1);

        boolean bool = true;
        System.out.println("Переменная boolean: " + bool);
        char c1 = '\u0923';
        System.out.println("Переменная char: " + c1);

        String str = "hello";
        System.out.println("Переменная String: " + str);


        // задание 3
        float res = getCalc(10f, 15f, 12f, 3f);
        System.out.println("Задание 3 - " + res);

        // задание 4
        boolean result2 = task4(5, 25);
        System.out.println("Результат задания 4 -" + result2);

        // задание 5
        positiveOrNegative(-2);

        // задание 6
        ;
        System.out.println("Результат задания 6 -" + trueNegative(-12));

        // задание 7
        textName("Александр");


    }

    // задание 3
    public static float getCalc(float a, float b, float c, float d) {
        return a * (b + (c / d));


    }
    // задание 4

    public static boolean task4(int a, int b) {
        int result2 = a + b;
        if (result2 >= 10 && result2 <= 20) {
            return true;
        } else return false;
    }

    // Задание 5
    public static void positiveOrNegative(int x) {
        if (x >= 0) {
            System.out.println("Задание 5. Число  является положительное");
        } else System.out.println("Задание 5. Число отрицательно");

    }

    // Задание 6
    public static boolean trueNegative(int a) {
        if (a < 0) {
            return true;
        } else return false;
    }

    public static  void textName (String name) {
        System.out.println("Привет, "+ name + "!");
    }
}