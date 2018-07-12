/*
Создайте программу, выводящую на экран все неотрицательные
элементы последовательности 90 85 80 75 70 65 60 ….
 */
public class cycle2 {
        public static void main(String[] args) {
            int x = 90;
            int i = 1;
            while (x > 0) {
                x = x - 5;
                System.out.println(x);
            }
        }
    }

