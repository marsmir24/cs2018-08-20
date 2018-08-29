package by.it.smirnova.lesson04;

import java.util.Scanner;

/*
Напишите программу которая спрашивает у пользователя:
Какую вы хотите зарплату в $$$?

После ввода суммы, программа анализирует полученное значение
и если введенная цифра меньше 300 или больше 3000 программа выводит на экран:
Мы вам перезвоним!

Иначе выводит в цикле по переменной int month от 0 до 14 рассчитанную зарплату.
В летние месяцы - выводится введенная сумма с названием месяца.
В несуществующие месяцы 0, 13 и 14 выводится сумма в $0.0
в остальные месяцы выводится указанная сумма с премией в 50%.

Сделайте так, чтобы в тот месяц, когда получилась зарплата в $666 цикл после вывода прерывался.

Пример работы программы (у вас должно быть так же, до символа):

Какую вы хотите зарплату в $$$?
2000
За месяц 0 начислено $0.0
За январь начислено $3000.0
За февраль начислено $3000.0
За март начислено $3000.0
За апрель начислено $3000.0
За май начислено $3000.0
За июнь начислено $2000.0
За июль начислено $2000.0
За август начислено $2000.0
За сентябрь начислено $3000.0
За октябрь начислено $3000.0
За ноябрь начислено $3000.0
За декабрь начислено $3000.0
За месяц 13 начислено $0.0
За месяц 14 начислено $0.0

*/
public class TaskC1 {
    public static void main(String[] args) {
        System.out.println("Какую вы хотите зарплату в $$$?");
        Scanner sc = new Scanner(System.in);
        int salary = sc.nextInt();

        if (salary>=300&&salary<=3000) {
            for (int i = 0; i < 15; i++)
                switch (i) {
                    case 0:
                        System.out.println("За месяц 0 начислено $0.0");
                        break;
                    case 1:
                        System.out.println("За январь начислено $" + salary * 1.5);
                        if (salary==666||salary*1.5==666){break;}
                        break;
                    case 2:
                        System.out.println("За февраль начислено $" + salary * 1.5);
                        if (salary==666||salary*1.5==666){break;}
                        break;
                    case 3:
                        System.out.println("За март начислено $" + salary * 1.5);
                        if (salary==666||salary*1.5==666){break;}
                        break;
                    case 4:
                        System.out.println("За аперль начислено $" + salary * 1.5);
                        if (salary==666||salary*1.5==666){break;}
                        break;
                    case 5:
                        System.out.println("За май начислено $" + salary * 1.5);
                        if (salary==666||salary*1.5==666){break;}
                        break;
                    case 6:
                        System.out.println("За июнь начислено $" + salary);
                        if (salary==666||salary*1.5==666){break;}
                        break;
                    case 7:
                        System.out.println("За июль начислено $" + salary);
                        if (salary==666||salary*1.5==666){break;}
                        break;
                    case 8:
                        System.out.println("За август начислено $" + salary);
                        if (salary==666||salary*1.5==666){break;}
                        break;
                    case 9:
                        System.out.println("За сентябрь начислено $" + salary * 1.5);
                        if (salary==666||salary*1.5==666){break;}
                        break;
                    case 10:
                        System.out.println("За октябрь начислено $" + salary * 1.5);
                        if (salary==666||salary*1.5==666){break;}
                        break;
                    case 11:
                        System.out.println("За ноябрь начислено $" + salary * 1.5);
                        if (salary==666||salary*1.5==666){break;}
                        break;
                    case 12:
                        System.out.println("За декабрь начислено $" + salary * 1.5);
                        if (salary==666||salary*1.5==666){break;}
                        break;
                    case 13:
                        System.out.println("За месяц 13 начислено $0.0");
                        if (salary==666||salary*1.5==666){break;}
                        break;
                    case 14:
                        System.out.println("За месяц 14 начислено $0.0");
                        if (salary==666||salary*1.5==666){break;}
                        break;


                }
        } else System.out.println("Мы вам перезвоним!");}
}