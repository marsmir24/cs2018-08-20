package by.it.smirnova.lesson02;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и выводит их сумму на экран в виде

Ввод (это вы вводите с клавиатуры):
34 26

Вывод (это должна появится в консоли, обратите внимание на пробелы и слово Sum:
Sum = 26
*/

import java.util.Scanner;

class TaskC1 {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        int b;
        b = sc.nextInt();
        System.out.println("Sum" + " = " + (a + b)
        );
    }




}
