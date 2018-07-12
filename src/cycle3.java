/*
Создайте программу, выводящую на экран первые 20 элементов
последовательности 2 4 8 16 32 64 128 ….
 */

public class cycle3 {
    public static void main(String[] args) {
        int x = 2;
        int i = 1;
        System.out.println(x);
        while (i < 20){
            x = x * 2;
            i++;
            System.out.println(x);
        }
    }
}
