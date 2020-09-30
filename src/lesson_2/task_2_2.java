package lesson_2;

/*
2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
*/


public class task_2_2 {

    public static void main(String[] args) {

        byte[] massive = new byte[8];

        for (byte i = 0, j = 0; i < massive.length; i++) {
            massive[i] = j;
            j += 3;
        }

    }

}
