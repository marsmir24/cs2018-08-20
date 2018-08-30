package by.it.smirnova.lesson05;

/* Задачка на сортировку
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TaskC2 {
    public static void main(String[] args) throws IOException {
        //Scanner sc = new Scanner(System.in);
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        int[] m = new int[20];
        for (int i = 0; i < m.length; i++) {
            //m[i] = sc.nextInt();
            String s=reader.readLine();
            m[i]=Integer.parseInt(s);
        }
        sort(m);
        for(int i=0; i <m.length; i++)
        {System.out.println(m[i]);}//" " +
        //System.out.println();}
    }
        public static void sort(int[]array) {
        for(int a=1; a < array.length; a++)
                for(int b=array.length-1; b >= a; b--) {
                    if(array[b-1] < array[b]) { // if out of order
                        // exchange elements
                        int t = array[b-1];
                        array[b-1] = array[b];
                        array[b] = t;
                    }
                }
        }
        }





