package lesson_7;

/*
2. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды (например, в миске 10 еды, а кот пытается покушать 15-20)
3. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать (хватило еды), сытость = true
4. Считаем, что если коту мало еды в тарелке, то он ее просто не трогает, то есть не может быть наполовину сыт (это сделано для упрощения логики программы
*/

public class Cat
{
    private String name;
    private boolean isFull;
    private int appetite;

    public Cat(String name, int appetite)
    {
        this.name = name;
        this.appetite = appetite;
        isFull = false;
    }

    public void eat(Plate plate)
    {
        // Проверка на сытость
        if (!isFull){
            // Голодный кись проверяет еду в миске
            // Если еды достаточно....
            if (plate.checkFoodInPlate(appetite)){
                plate.takeFoodFromPlate(appetite);
                isFull = true;
                System.out.println(name + " покушал. Спит.");
            }
            // Если еды недостаточно
            else {
                System.out.println(name + " видит дно в тарелке. Орёть.");
            }
        }
        // Если не голоден
        else {
            System.out.println(name + " не хочет кушать");
        }
    }
}
