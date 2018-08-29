package by.it.smirnova.lesson05;
/*
Создайте 5 различных строк в списке ArrayList:

1. Создайте список строк.
2. Добавьте в него 5 различных строк.
3. Выведите его размер на экран.
4. Используя цикл выведите его содержимое на экран, каждое значение с новой строки.

*/


import sun.plugin.javascript.navig.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class TaskB1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        //Scanner scanner = new Scanner(System.in);
        //String line = scanner.nextLine();
        list.add("Сиреневый");
        list.add("туман");
        list.add("над");
        list.add("нами");
        list.add("проплывает");
        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
