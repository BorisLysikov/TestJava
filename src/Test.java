/*
Создать программу, проверяющую и сообщающую на экран,
является ли целое число записанное в переменную n, чётным либо нечётным.
 */

import java.util.Scanner;
public class Test {
    public static void main(String[] args) {

        System.out.print("Введите число : ");
        Scanner inputFigure = new Scanner(System.in);
        int i = inputFigure.nextInt();
        if (i % 2 == 0) {
            System.out.println("Четное число");
        } else {
            System.out.println("Нечетное число");
        }
    }
}
