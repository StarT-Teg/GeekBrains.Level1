package lesson_2;

public class task_2_4 {

    public static void main(String[] args) {

        byte rnd = (byte) ((Math.random() * (10 - 2)) + 2); // Случайный размер массива

        System.out.println("Двумерный квадратный массив со стороной = " + rnd);

        byte[][] massive = new byte[rnd][rnd];

        for (byte i = 0; i < massive.length; i++) {

            massive[i][i] = 1;
            massive[i][massive.length - i - 1] = 1;

            for (byte c = 0; c < rnd; c++) {
                System.out.print(massive[i][c] + " ");
            }

            System.out.println();

        }

    }

}
