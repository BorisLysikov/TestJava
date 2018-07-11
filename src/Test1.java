/*
Создать программу, выводящую на экран ближайшее к 10 из двух чисел,
 записанных в переменные m и n. Например, среди чисел 8,5 и 11,45 ближайшее к десяти 11,45.
 */
import java.util.Scanner;
public class Test1 {
    public static void main (String [] args) {
        System.out.print("Введите число : ");
        Scanner inputFigure = new Scanner(System.in);
        float m = inputFigure.nextInt();
        float n = inputFigure.nextInt();
        Math.abs(m);
        Math.abs(n);
        if (10 - m > 10 - n){
            System.out.println(m);
        }
        else if (10 - m > 10 - n){
            System.out.println(m);
        }
        else if (m == n){
            System.out.println(m);
        }

    }

}

