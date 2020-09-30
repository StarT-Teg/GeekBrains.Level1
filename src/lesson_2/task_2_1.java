package lesson_2;

/*
1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
*/


public class task_2_1 {

    public static void main(String[] args) {

        byte[] massive = new byte[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0, 0};

        for (int i = 0; i < massive.length; i++) {
            massive[i] = (byte) (massive[i] == 0 ? 1 : 0);
        }

    }

}
