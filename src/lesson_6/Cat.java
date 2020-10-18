package lesson_6;

public class Cat extends Animal {

    public Cat (int runCapacity, int swimCapacity, double jumpCapacity){
        this.runCapacity = runCapacity;
        this.swimCapacity = swimCapacity;
        this.jumpCapacity = jumpCapacity;
    }


    public void getCatParameters() {

        System.out.println("Cat parameters: runCapacity = " + runCapacity + " swimCapacity = " + swimCapacity + " jumpCapacity = " + jumpCapacity);
    }
}
