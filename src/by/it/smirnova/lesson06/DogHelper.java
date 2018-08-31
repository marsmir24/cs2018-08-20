package by.it.smirnova.lesson06;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*Создайте новый класс DogHelper и в нем два статических метода
        void printAllNames(Dog[] dogs){.....}; //должен печатать в консоль через пробел имена всех собак
        double averageAge(Dog[] dogs){.....}; //должен вычислять средний возраст переданных ему собак
*/
public class DogHelper {
    public static void printAllNames(Dog[] dogs) {
        for (Dog dog : dogs) {
            System.out.print(dog.getName() + " ");
        }
        System.out.println();
    }
    static double averageAge(Dog[] dogs){
    double result=0;
    for (Dog dog : dogs) {
        result= result+dog.getAge();
    }
    return result/dogs.length;
    }
}
