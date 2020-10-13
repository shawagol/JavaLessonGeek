package Lesson3;

import java.util.Random;
import java.util.Scanner;

public class Lesson3 {

    public static void main(String[] args) {

        guessingGame();
        guessingWord();
        text();
    }


    // Написать программу, которая загадывает случайное число от 0 до 9, и пользователю дается 3 попытки угадать это число.
// При каждой попытке компьютер должен сообщить больше ли указанное пользователем число чем загаданное, или меньше.
// После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).

    public static void guessingGame() {
        System.out.println("Добро пожаловать в игру угадайте число.");
        Scanner scanner = new Scanner(System.in);
         int count=3;

            do {
                int answer=(int)Math.round(Math.random()*9);
                for (int i = count; i >0 ; i--) {
                    System.out.println("Введите число от 0 до 9:");
                    int userAnswer = scanner.nextInt();
                    if (userAnswer == answer) {
                        System.out.println("Вы угадали");
                        break;
                    } else if (userAnswer>answer) {
                        System.out.println("Вы ввели слишком большое число ");
                    } else  {
                        System.out.println("Вы ввели слишком маленькое число ");
                    }
                    System.out.println((i-1) > 0 ? "У вас осталось " + (i-1) + " попытки": "Вы проиграли! Ответ: " + answer);
                }
                System.out.println("Повторить игру еще раз? Да - 1 (повторить) или Нет - 0.");
            }
            while (scanner.nextInt() == 1);
    }

//Создать массив из слов String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado",
// "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom",
// "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
// При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
//сравнивает его с загаданным словом и сообщает правильно ли ответил пользователь. Если слово не угадано, компьютер показывает буквы которые стоят на своих местах.
//apple – загаданное
//apricot - ответ игрока
//ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
//Для сравнения двух слов посимвольно, можно пользоваться:
//String str = "apple";
//str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
//Играем до тех пор, пока игрок не отгадает слово
//Используем только маленькие бу

    public static void guessingWord() {
        System.out.println("Добро пожаловать в игру угадайте слово.");

        String[] words = new String[]{"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        Random random = new Random();
        int randomWords = random.nextInt(words.length - 1);
        String word = words[randomWords];
        Scanner scanner = new Scanner(System.in);
        int hideWord = 15;

        System.out.println(word);
        System.out.println("Игра 'Угадайте слово' загадала фрукт. Попробуйте отгадать, что за слово?");

        while (true) {
            System.out.println("\nВведите слово на английском языке:");
            String userAnswer = scanner.nextLine();
            if (userAnswer.equals(word)) {
                System.out.println("Вы угадали загаданное слово: " + word);
                break;
            } else {
                System.out.println("К сожалению Вы не угадали");
                StringBuilder result= new StringBuilder("");
                for (int i = 0; i < Math.min(userAnswer.length(),word.length()); i++) {

                    if ( word.charAt(i) == userAnswer.charAt(i)) {
                        result.append(word.charAt(i));
                    } else {
                        result.append("#");
                    }
                }
                while(result.length()<hideWord){
                    result.append("#");
                }
                System.out.println(result);

//                if (result.length()<hideWord){
//                    for (int i = 0; i < (hideWord-result.length()); i++) {
//                        result.append("#");
//                    }
//                }

               // System.out.print(userAnswer.equals(word) ? "" : "#");
            }
        }
    }


    public static void text() {

    String s = "Предложение   один         Теперь   предложение    два    Предложение    три   ";
        String s1 = s.replaceAll(" +"," ");
        StringBuilder s2 = new StringBuilder(s1);

            for (int i = 1; i < s2.length(); i++) {
                if (s2.charAt(i) >= 'А' && s2.charAt(i) <= 'Я') {
                    s2.setCharAt(i - 1, '.');
                }
            }

        StringBuilder s3 = new StringBuilder(s2);
            for (int j = 1; j < s3.length(); j++)
                if (s3.charAt(j) == '.') {
                    s3.insert(j+1, " ");
                }
            s3.deleteCharAt(s3.length()-1);
            s3.append('.');
        System.out.println(s3.toString());
    }

}

