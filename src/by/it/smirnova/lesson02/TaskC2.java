package by.it.smirnova.lesson02;

import java.util.Scanner;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и 4 раза выводит их сумму с обозначением системы счисления на экран в
ДЕСЯТИЧНОМ ДВОИЧНОМ ШЕСТНАДЦАТИРИЧНОМ ВОСЬМИРИЧНОМ виде

Вот пример ввода с клавиатуры:
34 26

Тогда вывод ожидается такой (обратите внимание на регистр букв):
DEC:34+26=60
BIN:100010+11010=111100
HEX:22+1a=3c
OCT:42+32=74
*/
class TaskC2 {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        int b;
        b = sc.nextInt();
        int c;
        c = a + b;
        System.out.println("DEC:"+a+"+"+b+"="+c);
String a_2;
a_2 = Integer.toBinaryString( a );
        String b_2;
        b_2 = Integer.toBinaryString( b );
       String c_2;
       c_2 = Integer.toBinaryString( c );
        System.out.println("BIN:"+a_2+"+"+b_2+"="+c_2);
        String a_3;
        a_3 = Integer.toHexString( a );
        String b_3;
        b_3 = Integer.toHexString( b );
        String c_3;
       c_3 = Integer.toHexString( c );
        System.out.println("HEX:"+a_3+"+"+b_3+"="+c_3);
        String a_4;
        a_4 = Integer.toOctalString(a);
        String b_4;
        b_4 = Integer.toOctalString( b );
        String c_4;
        c_4 = Integer.toOctalString( c );
        System.out.println("OCT:"+a_4+"+"+b_4+"="+c_4);
    }
}
