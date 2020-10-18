package lesson_6;

public class Dog extends Animal {

    public Dog (int runCapacity, int swimCapacity, double jumpCapacity){
        this.runCapacity = runCapacity;
        this.swimCapacity = swimCapacity;
        this.jumpCapacity = jumpCapacity;
    }

    public void getDogParameters() {

        System.out.println("Dog parameters: runCapacity = " + runCapacity + " swimCapacity = " + swimCapacity + " jumpCapacity = " + jumpCapacity);
    }

}
