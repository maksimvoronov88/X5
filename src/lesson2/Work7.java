package lesson2;
import java.util.Scanner;
// не стал заморачиваться с умножением, надо ли было, учитывая что минуты мы не вводим ?

public class Work7 {
    public static void main (String[] arg){

        Scanner in = new Scanner(System.in);
        System.out.println("Input number: ");
        int value = in.nextInt();
        if (value == 905) {
            System.out.println("Москва. Стоимость разговора: 41.5 руб.");
        }
        else if (value == 194) {
            System.out.println("Ростов. Стоимость разговора: 19.8 руб.");
        }
        else if (value == 491) {
            System.out.println("Краснодар. Стоимость разговора: 26.9 руб.");
        }
        else if (value == 800) {
            System.out.println("Киров. Стоимость разговора: 50 руб.");
        }
        in.close();
    }


}