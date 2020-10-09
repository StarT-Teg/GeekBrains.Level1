package lesson_4;

// 1. Полностью разобраться с кодом, попробовать переписать с нуля, стараясь не подглядывать в методичку;
// 2. Переделать проверку победы, чтобы она не была реализована просто набором условий, например, с использованием циклов.
// 3. * Попробовать переписать логику проверки победы, чтобы она работала для поля 5х5 и количества фишек 4. Очень желательно не делать это просто набором условий для каждой из возможных ситуаций;
// 4. *** Доработать искусственный интеллект, чтобы он мог блокировать ходы игрока.

import com.sun.media.sound.AiffFileReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lesson_4 {

    private static int fieldSize;
    private static int winCondition;


    static char playerSymbol;

    static boolean end = false;

    static int playerWinCounter = 0;
    static int AIWinCounter = 0;

    static char [][] field;


    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Выбор размеров поля
        while (true){
            System.out.println("Размер поля 3 | 5?");
            int answer = Integer.parseInt(reader.readLine());

            if (answer == 3) {
                fieldSize = 3;
                winCondition = 3;
                field = new char [fieldSize][fieldSize];
                break;
            }
            else if (answer == 5){
                fieldSize = 5;
                winCondition = 4;
                field = new char [fieldSize][fieldSize];
                break;
            }
            else {
                System.out.println("Не совсем понял...");
            }
        }

        firstFill();

        // Выбор символа игрока
        while (true){
            System.out.println("Играем за крестики? y/n");
            String answer = reader.readLine();

            if (answer.equals("y")) {
                playerSymbol = 'X';
                break;
            }
            else if (answer.equals("n")){
                playerSymbol = '0';

                // Т.к. ход бота от хода игрока отличается одним ходом, решил записать его сразу в выбор символа
                System.out.println();
                System.out.println("Ход бота!");

                AITurn();
                drawMap();

                break;
            }
            else {
                System.out.println("Не совсем понял...");
            }
        }

        // Алгорит игры
            while (!end){
                System.out.println("Ход игрока!");
                playerTurn();
                drawMap();
                System.out.println();
                checkWin();

                if (end){
                    break;
                }

                System.out.println("Ход бота!");
                AITurn();
                drawMap();
                checkWin();
                System.out.println();
            }
    }

    // Все методы справедливы для полей 3х3 и 5х5 и любого символа игрока

    // Общаяя проверка на победу
    static void checkWin () {
        if (    checkWinLine() ||
                checkWinColumn() ||
                checkWinPrimaryDiagonal() ||
                checkWinSecondaryDiagonal())
        {
            end = true;

            if (playerWinCounter > AIWinCounter){
                System.out.println("Игрок победил!");
            }
            else {
                System.out.println("Бот победил!");
            }

        }
        else if (checkWinDraw()){
            System.out.println("Ничья!");
        }

    }

    // Проверка на горизонталь
    static boolean checkWinLine() {

        playerWinCounter = 0;
        AIWinCounter = 0;

        for (int i = 0; i < fieldSize; i++) {

            for (int j = 0; j < fieldSize; j++) {

                if (field[i][j] == playerSymbol) {
                    playerWinCounter++;
                    AIWinCounter = 0;

                } else if (field[i][j] != '.') {
                    AIWinCounter++;
                    playerWinCounter = 0;
                }
                else {
                    playerWinCounter = 0;
                    AIWinCounter = 0;
                }
            }

            if (playerWinCounter >= winCondition || AIWinCounter >= winCondition){
                break;
            }
            else {
                playerWinCounter = 0;
                AIWinCounter = 0;
            }

        }

        return (playerWinCounter >= winCondition || AIWinCounter >= winCondition);
    }

    // Проверка на вертикаль
    static boolean checkWinColumn(){

        playerWinCounter = 0;
        AIWinCounter = 0;

        for (int i = 0; i < fieldSize; i++){

            for (int j = 0; j < fieldSize; j++){
                if (field[j][i] == playerSymbol){
                    playerWinCounter++;
                    AIWinCounter = 0;
                }
                else if (field[j][i] != '.'){
                    AIWinCounter++;
                    playerWinCounter = 0;
                }
                else {
                    playerWinCounter = 0;
                    AIWinCounter = 0;
                }
            }

            if (playerWinCounter >= winCondition || AIWinCounter >= winCondition){
                break;
            }
            else {
                playerWinCounter = 0;
                AIWinCounter = 0;
            }

        }

        return (playerWinCounter >= winCondition || AIWinCounter >= winCondition);
    }

    // Проверка на основную диагональ
    static boolean checkWinPrimaryDiagonal(){

        playerWinCounter = 0;
        AIWinCounter = 0;

        for (int i = 0 ; i < fieldSize; i++){

            if (field[i][i] == playerSymbol){
                playerWinCounter++;
                AIWinCounter = 0;
            }
            else if (field[i][i] != '.'){
                AIWinCounter++;
                playerWinCounter = 0;
            }
            else {
                playerWinCounter = 0;
                AIWinCounter = 0;
            }
        }

        return (playerWinCounter >= winCondition || AIWinCounter >= winCondition);

    }

    // Проверка на побочную диагональ
    static boolean checkWinSecondaryDiagonal(){

        playerWinCounter = 0;
        AIWinCounter = 0;

        for (int i = fieldSize - 1, j = 0; j < fieldSize; i--, j++){

            if (field[i][j] == playerSymbol){
                playerWinCounter++;
                AIWinCounter = 0;
            }
            else if (field[i][j] != '.'){
                AIWinCounter++;
                playerWinCounter = 0;
            }
            else {
                playerWinCounter = 0;
                AIWinCounter = 0;
            }
        }

        return (playerWinCounter >= winCondition || AIWinCounter >= winCondition);

    }

    // Проверка на ничью
    static boolean checkWinDraw(){

        playerWinCounter = 0;
        AIWinCounter = 0;
        int drawCounter = fieldSize*fieldSize;

        for (int i = 0; i < fieldSize; i++){

            for (int j = 0; j < field.length; j++){
                if (field[i][j] != '.'){
                    drawCounter--;
                }
            }
        }

        return (drawCounter == 0);

    }

    // Механика хода игрока
    static void playerTurn() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int x;
        int y;

        do
        {
            System.out.println("Введите координаты в формате Строка - столбец");
            x = Integer.parseInt(reader.readLine()) - 1;
            y = Integer.parseInt(reader.readLine()) - 1;
        } while (!isCellValid(x, y));

        field[x][y] = playerSymbol;
    }

    // Механика хода бота
    static void AITurn(){

        int x;
        int y;

        do
        {
            x = (int) (Math.random() * fieldSize);
            y = (int) (Math.random() * fieldSize);

        } while (!isCellValid(x, y));

        field[x][y] = (playerSymbol == 'X' ? '0' : 'X');

    }

    // Проверка ячейки на валидность
    static boolean isCellValid (int x, int y){


        if (x >= fieldSize || x < 0 || y >= fieldSize || y < 0){
            System.out.println("Такого поля нет в сетке!");

            return false;
        }
        else if (!(field[x][y] == '.')){
            // System.out.println("Поле уже занято");
            return false;
        }

        else {
            return true;
        }

    }

    // Заполнение массива. Используется один раз, но решил не захламлять Main
    private static void firstFill (){

        for (int i = 0; i < fieldSize; i++){

            for (int j = 0; j < fieldSize; j++){
                field[i][j] = '.';
            }
        }
    }

    // Отрисовка карты
    private static void drawMap (){

        System.out.println();

        for (int i = 0; i < fieldSize; i++){

            for (int j = 0; j < fieldSize; j++){
                System.out.print("|" + field[i][j]);
            }

            System.out.println("|");

        }
    }
}
