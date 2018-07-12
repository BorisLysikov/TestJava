import java.sql.SQLOutput;

/*
Создайте программу, выводящую на экран первые 55 элементов
последовательности 1 3 5 7 9 11 13 15 17 …
 */
public class cycle1 {
    public static void main(String[] args){
        int x = 1;
        int i = 1;
        while (i<55){
            x = x+2;
            i++;
            System.out.println(x);
        }
    }
}
