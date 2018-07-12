/*
В переменной n хранится вещественное число с ненулевой дробной частью.
Создайте программу, округляющую число n до ближайшего целого и выводящую результат на экран.
 */
import java.util.Scanner;
public class Variables2 {
    public static void main(String[] args) {
        Scanner inputFigure = new Scanner(System.in);
        System.out.println("Введите число с дробной частью: ");
        float n = inputFigure.nextFloat();
        System.out.println(Math.round(n)); // данный метод округляет до ближайшего целого числа
        /*
        System.out.println(Math.floor(n)); //данный метод округляет число до ближайшего целого вниз
        System.out.println(Math.ceil(n)); // данный метод округляет число до ближайшего целого вверх
        */
    }
}
