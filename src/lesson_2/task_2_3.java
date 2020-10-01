package lesson_2;

public class task_2_3 {

    public static void main(String[] args) {

        byte[] massive = new byte[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (byte i = 0; i < massive.length; i++) {
            massive[i] = (byte) (massive[i] < 6 ? massive[i] * 2 : massive[i]);
        }

    }

}
