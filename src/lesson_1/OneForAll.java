package lesson_1;

/*
1. Создать пустой проект в IntelliJ IDEA и прописать метод main();
2. Создать переменные всех пройденных типов данных, и инициализировать их значения;
3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,где a, b, c, d – входные параметры этого метода;
4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль положительное ли число передали, или отрицательное; Замечание: ноль считаем положительным числом.
6. Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное;
7. Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
8. * Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
*/

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class OneForAll {

    public static void main(String[] args) {

        int a = 11;
        float b = 5.5f;
        String c = "serve";
        boolean d = true;
        byte e = -128;
        short f = -32768;
        char g = 'g';

    }

    private static int calculate (int a, int b, int c, int d) { return a * (b + (c / d)); }
    private static boolean compare (int a, int b){ return a+b > 10 && a+b <= 20; }
    private static void evenOdd(int a){ System.out.println(a % 2 == 0 ? "Чёт!" : "Нечет!"); }
    private static boolean negative (int a){return a < 0;}
    private static void helloName (String a){ System.out.println("Привет, " + a + "!"); }
    public boolean isLeapYear(int year) { return (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)); }


}
