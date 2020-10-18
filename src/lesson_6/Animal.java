package lesson_6;

/*
1. Создать классы Собака и Кот с наследованием от класса Животное.
2. Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие. В качестве параметра каждому методу передается величина, означающая или длину препятствия (для бега и плавания), или высоту (для прыжков).
3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; прыжок: кот 2 м., собака 0.5 м.; плавание: кот не умеет плавать, собака 10 м.).
4. При попытке животного выполнить одно из этих действий, оно должно сообщить результат в консоль. (Например, dog1.run(150); -> результат: run: true)
5. * Добавить животным разброс в ограничениях. То есть у одной собаки ограничение на бег может быть 400 м., у другой 600 м.
*/

public abstract class Animal {

    protected int runCapacity;
    protected int swimCapacity;
    protected double jumpCapacity;



    protected void run(int distance){

        System.out.println("run result = " + (runCapacity <= 0 ? "I can't run!" : runCapacity >= distance));
    }

    protected void swim(int distance) {

        System.out.println("swim result = " + (swimCapacity <= 0 ? "I can't swim!" : swimCapacity >= distance));
    }

    protected void jump(double distance){

        System.out.println("jump result = " + (jumpCapacity <= 0 ? "I can't jump!" : jumpCapacity >= distance));

    }

}
