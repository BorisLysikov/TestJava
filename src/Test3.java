/*
Создать программу, которая будет проверять попало ли случайно выбранное из отрезка [5;155]
 целое число в интервал (25;100) и сообщать результат на экран.
 */

import java.util.Scanner;
public class Test3 {
    public static void main(String[] args) {
        int x = 5;
        int x2 = 155;
        int test = x + (int) (Math.random() * x2);
        if (25 <= test && test <= 100) {
            System.out.println("Число " + (test) + " содержится в интервале (25,100)");
        } else {
            System.out.println("Число " + (test) + " не содержится в интервале (25,100)");
        }
    }
}



