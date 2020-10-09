package lesson_5;

/*
* Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
* Конструктор класса должен заполнять эти поля при создании объекта;
* Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
* Создать массив из 5 сотрудников
    Пример:
    Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
    persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
    persArray[1] = new Person(...);
...
    persArray[4] = new Person(...);

* С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
*/


public class Employee {

    private String fullName;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public int getAge() {
        return age;
    }

    // Конструктор
    public Employee(String fullName, String position, String email, String phoneNumber, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    // Метод, который выводит информацию об объекте в консоль
    public void getInfo (){

        System.out.println("Имя: " + fullName);
        System.out.println("Должность: " + position);
        System.out.println("Email: " + email);
        System.out.println("Номер телефона: " + phoneNumber);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);

    }

    public static void main(String[] args) {

        // Создаём массив из 5 сотрудников
        Employee[] persArray = new Employee[5];

        // Наполняем массив
        persArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        persArray[1] = new Employee("Stepanov Stepan", "PO", "dwgew@gmail.com", "89111111021", 20000, 28);
        persArray[2] = new Employee("Petrov Petr", "QA", "rhtut@mail.ru", "892222222211", 40000, 40);
        persArray[3] = new Employee("Sidorov Sidr", "Designer", "qwerty@mail.ru", "89121234567", 50000, 41   );
        persArray[4] = new Employee("Rubenovich Rafik", "iOS", "raqwt@mail.ru", "89202223456", 60000, 42);

        // Выводим информацию о сотрудниках старше 40 лет;
        System.out.println("Вывод сотрудников старше 40 лет:");
        for (Employee employee : persArray) {
            if (employee.getAge() > 40){
                System.out.println();
                employee.getInfo();
            }
        }
    }
}
