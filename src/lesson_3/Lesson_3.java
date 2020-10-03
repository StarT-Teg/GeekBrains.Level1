package lesson_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;


// Создать массив из слов String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
// При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
// сравнивает его с загаданным словом и сообщает правильно ли ответил пользователь. Если слово не угадано, компьютер показывает буквы которые стоят на своих местах.
// apple – загаданное
// apricot - ответ игрока
// ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
// Для сравнения двух слов посимвольно, можно пользоваться:
// String str = "apple";
// str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
// Играем до тех пор, пока игрок не отгадает слово
// Используем только маленькие буквы

public class Lesson_3 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] vocabulary = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"}; // Словарь

        System.out.println("Данный код выбирает какое-то слово из заданного словаря, а задача пользователя его угадать");
        System.out.println();
        System.out.println("Список слов из словаря:");

        for (String s : vocabulary) {
            System.out.println(s);
        }

        System.out.println();

        String win = vocabulary[new Random().nextInt(vocabulary.length)]; // Случайное слово из словаря в зависимости от длины словаря

        char[] parseWin = win.toLowerCase().toCharArray(); // На всякий случай занижаем слово и парсим на символы
        char[] finalGuess = new char[parseWin.length]; // Здесь будут хранится угаданные элементы слова
        for (int i = 0; i < finalGuess.length; i++) { // Заполняем неизвестные части звездочками
            finalGuess[i] = '*';
        }

        while (true) {

            System.out.println("Введите загаданное слово целиком!");

            String guess = reader.readLine().toLowerCase(); //Введённый вариант ответа. Буква или слово целиком

            if (guess.equals("debug")) { // Для тестирования
                System.out.println("DEBUG. Ответ = " + win);
            } else if (guess.equals(win)) { // Когда угадали
                System.out.println("Вы угадали! Загаданное слово - " + win);
                break;
            } else { // Когда не угадали

                char[] parseGuess = guess.toLowerCase().toCharArray(); // Разбираем ответ на чары
                for (int i = 0; i < (Math.min(parseWin.length, parseGuess.length)); i++) { // Проверка на минимум нужна для корректного перебора
                    if (parseGuess[i] == parseWin[i]) { // Сравниваем с загаданным словом
                        finalGuess[i] = parseGuess[i]; // Раскрываем буквы
                    }
                }

                if (!Arrays.toString(finalGuess).contains("*")) { // Проверяем, раскрыты ли все буквы
                    System.out.println("Вы угадали последние буквы! Загаданное слово - " + win);
                    break;
                } else {
                    System.out.println("Неверный ответ!");
                    System.out.println("Отгаданные буквы: ");

                    for (char c : finalGuess) {
                        System.out.print(c);
                    }
                    rndAsterisk(win); // Добавляем случайные *  конце слова

                    System.out.println();

                }
            }
        }
    }

    static void rndAsterisk(String answer) {

        int counter = 15 - answer.length();

        for (int i = 0; i <= counter; i++) {
            System.out.print("*");
        }
    }
}
