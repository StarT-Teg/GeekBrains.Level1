package lesson_2;

public class task_2_2 {

    public static void main(String[] args) {

        byte[] massive = new byte[8];

        for (byte i = 0, j = 0; i < massive.length; i++) {
            massive[i] = j;
            j += 3;
        }

    }

}
