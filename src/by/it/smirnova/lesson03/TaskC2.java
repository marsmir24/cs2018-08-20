package by.it.smirnova.lesson03;

import java.util.Scanner;

/*
    Сумма цифр четырехзначного числа

    Реализуйте метод sumDigitsInNumber(int number).
    Метод на вход принимает целое четырехзначное число.
    Нужно посчитать сумму цифр этого числа, и вернуть эту сумму.

    Пример:
    Метод sumDigitsInNumber вызывается с параметром 5467.

    Пример вывода:
    22

    Требования:
    1. В методе sumDigitsInNumber не могут быть использованы никакие дополнительные классы.
    2. Метод sumDigitsInNumber(int) должен быть не приватным и статическим.
    3. Метод sumDigitsInNumber должен возвращать значение типа int.
    4. Метод sumDigitsInNumber не должен ничего выводить на экран.
    5. Метод sumDigitsInNumber должен правильно возвращать сумму всех цифр в числе number.
*/
public class TaskC2 {
    public static void main(String[] args) {
        int z;
        int result;
        Scanner sc = new Scanner(System.in);
        z = sc.nextInt();

        result = sumDigitsInNumber( z);
      System.out.println(result);
  }
    public static int sumDigitsInNumber(int z){
        int a;
        int b;
        int c;
        int d;
        int sum;
       a =  z/1000;
       b = ( z- a*1000)/100;
       c = ( z- a*1000 - b*100)/10;
       d =  z- a*1000 - b*100- c *10;
       sum = a+ b + c + d;
       return sum;
    }

}
