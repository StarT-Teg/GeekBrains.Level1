package lesson_2;

public class task_2_1 {

    public static void main(String[] args) {

        byte[] massive = new byte[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0, 0};

        for (int i = 0; i < massive.length; i++) {
            massive[i] = (byte) (massive[i] == 0 ? 1 : 0);
        }

    }

}
