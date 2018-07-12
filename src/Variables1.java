/*
В переменной n хранится натуральное трёхзначное число.
Создайте программу, вычисляющую и выводящую на экран сумму цифр числа n.
 */
import java.util.Scanner;
public class Variables1 {
    public static void main(String[] args) {
        Scanner inputFigure = new Scanner(System.in);
        System.out.println("Введите трехзначное число: ");
        int n = inputFigure.nextInt();
        int n3 = n % 10;
        int N = n / 10;
        int n1 = N / 10;
        int n2 = N % 10;
        int sum = n1 + n2 + n3;
        System.out.println("Сумма цифр вашего числа: " + sum);
    }
}


