package Lesson4;

import java.util.Random;
import java.util.Scanner;

public class Lesson4 {

    static final int SIZE_X = 5;
    static final int SIZE_Y = 5;

    static char[][] field = new char[SIZE_Y][SIZE_X];

    static final char PLAYER_DOT = 'X';
    static final char AI_DOT = 'O';
    static final char EMPTY_DOT = '.';

    static Scanner scanner = new Scanner(System.in);
    static final Random rand = new Random();

    private static void initField() {
        for (int i = 0; i < SIZE_Y; i++) {
            for (int j = 0; j < SIZE_X; j++) {
                field[i][j] = EMPTY_DOT;
            }
        }
    }

    private static void printField() {
        System.out.println("-------");
        for (int i = 0; i < SIZE_Y; i++) {
            System.out.print("|");
            for (int j = 0; j < SIZE_X; j++) {
                System.out.print(field[i][j] + "|");
            }
            System.out.println();
        }
        System.out.println("-------");
    }

    private static void setSym(int y, int x, char sym) {
        field[y][x] = sym;
    }

    private static void playerStep() {
        int x;
        int y;
        do {
            System.out.println("Введите координаты: X Y (1-5)");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(y,x));
        setSym(y, x, PLAYER_DOT);
    }

    private static void aiStep() {
        int x;
        int y;
        do {
            x = rand.nextInt(SIZE_X);
            y = rand.nextInt(SIZE_Y);
        } while (!isCellValid(y,x));
        setSym(y, x, AI_DOT);
    }

    private static boolean isCellValid(int y, int x) {
        if (x < 0 || y < 0 || x > SIZE_X - 1 || y > SIZE_Y - 1) {
            return false;
        }
         return field[y][x] == EMPTY_DOT;
    }

    private static boolean isFieldFull() {
        for (int i = 0; i < SIZE_Y; i++) {
            for (int j = 0; j < SIZE_X; j++) {
                if (field[i][j] == EMPTY_DOT) return false;
            }
        }
        return true;
    }

    private static boolean checkWin(char sym) {


        // вариант для поля 5х5 и выигрышной комбинации 4
        int symCount;

        for (int i = 0; i < field.length; i++) {
            symCount=0;
            for (int j = 0; j < field.length -1; j++) {
                if (field[i][j]==sym) {
                    symCount++;
                }
                if (symCount==4) {
                    return  true;
                }
            }
        }
        for (int i = 0; i < field.length; i++) {
            symCount=0;
            for (int j = 1; j < field.length; j++) {
                if (field[i][j]==sym) {
                    symCount++;
                }
                if (symCount==4) {
                    return  true;
                }
            }
        }

        for (int i = 0; i < field.length; i++) {
            symCount=0;
            for (int j = 0; j < field.length -1; j++) {
                if (field[j][i]==sym) {
                    symCount++;
                }
                if (symCount==4) {
                    return  true;
                }
            }
        }
        for (int i = 0; i < field.length; i++) {
            symCount=0;
            for (int j = 1; j < field.length; j++) {
                if (field[j][i]==sym) {
                    symCount++;
                }
                if (symCount==4) {
                    return  true;
                }
            }
        }
        int symCountDiag1, symCountDiag2,symCountDiag3,symCountDiag4,symCountDiag5,symCountDiag6,symCountDiag7,symCountDiag8;
        symCountDiag1=0;
        symCountDiag2=0;
        symCountDiag3=0;
        symCountDiag4=0;
        symCountDiag5=0;
        symCountDiag6=0;
        symCountDiag7=0;
        symCountDiag8=0;
        for (int i = 0; i < 4; i++) {

            if (field[i][i]==sym) {
                symCountDiag1++;
            }
            if (field[i+1][i+1]==sym) {
                symCountDiag2++;
            }
            if (field[4-i][i]==sym) {
                symCountDiag3++;
            }
            if (field[3-i][i+1]==sym) {
                symCountDiag4++;
            }
            if (field[i+1][i]==sym) {
                symCountDiag5++;
            }
            if (field[i][i+1]==sym) {
                symCountDiag6++;
            }
            if (field[3-i][i]==sym) {
                symCountDiag7++;
            }
            if (field[4-i][i+1]==sym) {
                symCountDiag8++;
            }
        }
        if (symCountDiag1==4||symCountDiag2==4||symCountDiag3==4||symCountDiag4==4||
                symCountDiag5==4||symCountDiag6==4||symCountDiag7==4||symCountDiag8==4){
            return true;
        }
        return false;

        //вариант упрощения кода с урока для поля 3х3
//        for (int i = 0; i < field.length; i++) {
//            if ((field[i][0] == sym && field[i][1] == sym && field[i][2] == sym)||(field[0][i] == sym && field[1][i] == sym && field[2][i] == sym) ){
//                return true;
//            }
//            if ((field[0][0] == sym && field[1][1] == sym && field[2][2] == sym)||(field[2][0] == sym && field[1][1] == sym && field[0][2] == sym) ){
//                return true;
//            }
//        }
//        return false;
    }


    public static void main(String[] args) {
        initField();
        printField();

        while (true) {
            playerStep();
            printField();
            if (checkWin(PLAYER_DOT)) {
                System.out.println("PLAYER WIN!");
                break;
            }
            if (isFieldFull()) {
                System.out.println("DRAW");
                break;
            }
            aiStep();
            printField();
            if (checkWin(AI_DOT)) {
                System.out.println("AI WIN!");
                break;
            }
            if (isFieldFull()) {
                System.out.println("DRAW");
                break;
            }
        }
    }

}
