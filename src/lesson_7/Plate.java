package lesson_7;

public class Plate
{
    private int foodInPlate;

    public Plate (int foodInPlate){
        this.foodInPlate = foodInPlate;
    }

    public void takeFoodFromPlate(int appetite)
    {
            foodInPlate -= appetite;
    }

    public boolean checkFoodInPlate(int appetite)
    {
        return appetite <= foodInPlate;
    }

    // 6. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку
    public void addFoodInPlate(int food)
    {
        this.foodInPlate += food;
    }
}

