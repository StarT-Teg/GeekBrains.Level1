package lesson_6;

/*
3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; прыжок: кот 2 м., собака 0.5 м.; плавание: кот не умеет плавать, собака 10 м.).
4. При попытке животного выполнить одно из этих действий, оно должно сообщить результат в консоль. (Например, dog1.run(150); -> результат: run: true)
5. * Добавить животным разброс в ограничениях. То есть у одной собаки ограничение на бег может быть 400 м., у другой 600 м.
*/

public class Main {
    public static void main(String[] args) {

        Dog dog1 = new Dog(500, 10, 0.5);
        Cat cat1 = new Cat (200, 0, 2);

        dog1.run(500);
        dog1.run(501);
        cat1.jump(1.9);
        cat1.swim(1);

        System.out.println();

        Dog dog2 = randomDogCreator();

        dog2.getDogParameters();

        dog2.run(100);
        dog2.jump(2);
        dog2.swim(1);


    }

     public static Dog randomDogCreator (){

        int runCapacity = (int) (Math.random() * (700));
        int swimCapacity = (int) (Math.random() * (10));
        double jumpCapacity = Math.ceil(Math.random() * (5) * (Math.pow(10, 1))) / (Math.pow(10, 1)); //Формулы для округления числа до 1 знака после запятой

        return new Dog (runCapacity, swimCapacity, jumpCapacity) ;

    }
}
