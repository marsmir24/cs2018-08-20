package by.it.smirnova.lesson06;
/*
Геттеры и сеттеры для класса Dog

Создайте class Dog.
У собаки должна быть кличка String name и возраст int age.
Создайте геттеры и сеттеры для всех переменных класса Dog.

        Требования:
        1. Программа не должна считывать данные с клавиатуры.
        2. У класса Dog должна быть переменная name с типом String.
        3. У класса Dog должна быть переменная age с типом int.
        4. У класса должен сеттер для переменной name.
        5. У класса должен геттер для переменной name.
        6. У класса должен сеттер для переменной age.
        7. У класса должен геттер для переменной age.
        8. Создайте внутри метода main (класса TaskA1) две разных собаки (т.е. два объекта типа Dog)
        9. Заполните поля собак используя сеттеры.
            Первая - Шарик, 5 лет. Вторая - Тузик, 3 года.
        10. Напечатайте этих двух собак, выводите собак в формате
            Кличка Возраст
            через пробел. При выводе обяхательно иcпользуйте геттеры.

Ожидается вывод:
Шарик 5
Тузик 3
*/
public class Dog {
    private String name;
    private int age;
    private int weight;
    private double power;

    public Dog() {
    }

    public Dog(String name, int age, int weight, double power) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.power = power;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public String toString() {
        return"Кличка: "+name+". Возраст: "+ age;

    }
    /*Шансы на победу = 0.2 * возраст + 0.3 * вес + 0.5 * силу укуса.

Побеждает та собака, у которой больше шансов на победу.
Если победила эта (this), то метод win возвращает true, иначе false*/
    boolean win(Dog otherDog){
        double myChance=0.2*this.age+0.3*this.weight+0.5*this.power;
        double otherChance=0.2*otherDog.age+0.3*otherDog.weight+0.5*otherDog.power;
        return myChance>otherChance;
    }
}
