package lesson_2;

/*
6. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны. Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||, эти символы в массив не входят.
*/


public class task_2_6 {

    public static void main(String[] args) {

        byte[] massive = new byte[20];

        for (int i = 0; i < massive.length; i++) { // наполним массив случайными значениями [0, 2). Значения выше двух редко попадают в true.
            massive[i] = (byte) ((Math.random() * 2));
        }

        System.out.println("Результат: " + findCenter(massive));

    }

    private static boolean findCenter(byte[] find) {

        int leftSum = 0;
        int rightSum = 0;
        boolean result = false;

        System.out.println("Полный массив: ");
        for (int i = 0; i < find.length; i++) { // Суммируем правую часть
            rightSum += find[i];
            System.out.print(find[i] + " ");
        }

        System.out.println();

        for (int i = 0; leftSum <= rightSum; i++) {

            // System.out.println(leftSum + " || " + rightSum);

            if (leftSum == rightSum) {
                result = true;

                System.out.println();
                System.out.println("Место пересечения: ");

                for (int b = 0; b < find.length; b++) {

                    if (b < i) {
                        System.out.print(find[b] + " ");
                    } else if (b == i) {
                        System.out.print("|| " + find[b] + " ");
                    } else {
                        System.out.print(find[b] + " ");
                    }

                }

                System.out.println();
                break;

            }

            rightSum -= find[i];

        }

        System.out.println();

        return result;


    }

}
