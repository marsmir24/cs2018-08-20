package by.it.smirnova.lesson02;

import java.util.Scanner;

/*
Ускорение свободного падения на Земле и Марсе таково:
Марс   3.86
Земля   9.81

С клавиатуры вводится вес человека в килограммах.
Рассчитайте вес человека на Марсе и выведите
округлив его до сотых килограмма (2 знака)

Создайте для этих целей метод getWeight(int weight)

Требования:
1. Метод getWeight(int weight) должен быть статическим.
2. Метод getWeight должен возвращать значение типа double.
3. Метод getWeight должен обязательно (!) округлять до сотых возвращаемое значение типа double.
4. Метод getWeight не должен ничего выводить на экран.
5. Метод getWeight должен правильно переводить вес тела в килограммах на Земле
    в вес этого же тела на Марсе, и возвращать это значение.

Пример:

Ввод:
75

Вывод:
29.51


*/
class TaskC3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int weight = in.nextInt();
        double result = getWeight(weight);
        System.out.println(result);

    }
        public static double getWeight ( int x){
            double z = 9.81;
            double y = 3.86;
            double n = y / z;
            double a = x * n;
            double marsweight;
            marsweight = Math.round(a * 100.0) / 100.0;
            return marsweight;
            //double newDouble = new BigDecimal(a).setScale(2, RoundingMode.UP).doubleValue();

            //System.out.println(marsweight);
            //return;


            //Scanner sc = new Scanner(System.in);
            //  double weight;
            // double marsweight;
            //  weight = sc.nextInt();
            //  double getWeight;
            //  {
            //     getWeight = (weight / 9.81 * 3.86);            //   marsweight = Math.round(getWeight * 100.0) / 100.0;

            //System.out.println(marsweight);

        }


    }
