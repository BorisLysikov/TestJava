/*
Создайте программу, которая будет генерировать и выводить на экран
вещественное псевдослучайное число из промежутка [-3;3).
 */
public class MathExersize {
    public static void main(String[] args){
        float a=(float)Math.random()*6-3;
        System.out.println("Случайное число из отрезка -3,3 равно " +a);
    }



}
