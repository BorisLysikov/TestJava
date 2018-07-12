/*
Создать программу, выводящую на экран случайно
сгенерированное трёхзначное натуральное число и его наибольшую цифру.
 */
public class Test4 {
    public static void main(String[] args){
        int min = 100;
        int max = 999;
        int test = min + (int) (Math.random() * max);
        System.out.println("Случайное число: " + test);
        int num3 = test % 10;
        int N = test / 10;
        int num1 = N /10;
        int num2 = N % 10;
        if (num1 > num2 && num1 > num3){
            System.out.println("Наибольшое число: " + num1);
        }
        else if (num2 > num3 && num2 > num1){
            System.out.println("Наибольшое число: " + num2);
        }
        else{
            System.out.println("Наибольшое число: " + num3);
        }
    }
}
