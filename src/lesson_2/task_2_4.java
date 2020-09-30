package lesson_2;

/*
4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
*/


public class task_2_4 {

    public static void main(String[] args) {

        byte rnd = (byte) ((Math.random() * (10 - 2)) + 2); // Случайный размер массива

        System.out.println("Двумерный квадратный массив со стороной = " + rnd);

        byte[][] massive = new byte[rnd][rnd];

        for (byte i = 0; i < massive.length; i++) {

            massive[i][i] = 1;

            for (byte c = 0; c < rnd; c++) {
                System.out.print(massive[i][c] + " ");
            }

            System.out.println();

        }

    }

}
