package Lesson2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Lesson2 {
    public static void main(String[] args) {

        invertArray();
        fillArray3();
        fillArray2();
        changeArray();
        fillDiagonal();
        minAndMaxArr ();

        int[] arrСhe = {2, 8, 3, 1, 4, 1, 6, 13};
        //int[] arrСhe = {2, 8, 6, 10, 6 };
        System.out.println(checkBalance(arrСhe));



    }




//Задать целочисленный массив, состоящий из элементов 0 и 1.
// Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
// С помощью цикла и условия заменить 0 на 1, 1 на 0;

    // Вариант 2:

    public static void invertArray() {
        System.out.print("Здача №1. Вариант №2: ");
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 0, 0, 1};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }


//Задать пустой целочисленный массив размером 8.
// С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;

    public static void fillArray3() {
        //Вариант 3:
        System.out.print("Здача №2. Вариант №3: ");
        int[] arr = new int[8];
        for (int i = 0, j = 0; i < arr.length; i++, j = j + 3) {
            arr[i] = j;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void fillArray2() {
        //Вариант 2:
        System.out.print("Здача №2. Вариант №2:  ");
        int[] arr = new int[8];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 3;
        }
        System.out.println(Arrays.toString(arr));
    }

//    Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
//    и числа меньшие 6 умножить на 2;

    public static void changeArray() {
        System.out.print("Здача №3: ");
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
//  Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
//  и с помощью цикла(-ов) заполнить его диагональные элементы единицами;

    public static void fillDiagonal(){
        System.out.println("Здача №4:  ");
        int[][] arr = new int[10][10];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0, jLast = arr[i].length; j<  arr[i].length; j++, jLast--) {
                if ((i == j) || i == (jLast - 1)) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

// ** Задать одномерный массив и найти в нем минимальный и
// максимальный элементы (без помощи интернета);

    public static void minAndMaxArr () {
        int[] arr = {2, 8, 10, 1, 11, 7, 5, 13, 4, 3, 17, 9};
        int min =arr[0];
        int max =arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } else if (arr[i]>max) {
                max = arr[i];
            }
        }
        System.out.println("Здача №5: минимальное: " + min + " . " + "максимальное: " + max);
    }

//** Написать метод, в который передается не пустой одномерный целочисленный массив,
// метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
// Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true,
// checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||,
// эти символы в массив не входят.


    // Сам не смог догадался,как нужно было сделать, пришлось подсмотреть.
    // После анализа кода стало более-менее понятно, но повторить сам бы не смог
    public static boolean checkBalance (int[] arrChe) {
        System.out.println("Здача №6:"+ Arrays.toString(arrChe));
        int sumLeft = 0;
        int sumRight = 0;
        for (int i = 0; i < arrChe.length; i++) {
            sumRight = sumRight + arrChe[i];
        }

        for (int i = 0; i < arrChe.length; i++) {

            if (sumLeft==sumRight) {
                return true;
            }
            sumLeft = sumLeft+arrChe[i];
            sumRight = sumRight-arrChe[i];
        }
        return false;

    }
// **** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным),
// при этом метод должен сместить все элементымассива на n позиций.
// Для усложнения задачи нельзя пользоваться вспомогательными массивами.

    // Эту задачу я даже не понял после анализа кода готового решения

}