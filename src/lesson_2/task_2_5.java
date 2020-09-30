package lesson_2;

/*
5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
*/


public class task_2_5 {

    public static void main(String[] args) {

        byte[] massive = new byte[25];

        for (int i = 0; i < massive.length; i++) { // наполним массив случайными значениями [0, 100)
            massive[i] = (byte) ((Math.random() * 100));
        }

        minMax(massive);

    }

    private static void minMax(byte[] find) {

        byte min = find[0];
        byte max = find[0];

        for (int i = 0; i < find.length; i++) {

            if (find[i] < min) {
                min = find[i];
            } else if (find[i] > max) {
                max = find[i];
            }

        }

        System.out.println("Min = " + min);
        System.out.println("Max = " + max);

    }

}
