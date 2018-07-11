/*
Группа людей участвует в марафоне, их имена и время за которое они пробежали марафон вы можете увидеть ниже.
Ваша задача найти человека, который быстрее всех пробежал дистанцию и вывести его имя и счет.
 */


package com.company;

import java.util.Scanner; // подключаем сканер
class Test {
    public static void main (String [] args) {

        System.out.print ("Введите число 1: ");
        Scanner inputFigure = new Scanner (System.in);
        int i = inputFigure.nextInt ();
        if ( i==1) {
            System.out.println ("Вы ввели число 1");
        }
        else {
            System.out.println ("Вы ввели число не равное 1");
        }
    }
}