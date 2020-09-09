package lesson2;
import java.util.Scanner;


public class Work3 {
    public static void main (String[] arg){

        Scanner in = new Scanner(System.in);
        System.out.println("Input number: ");
        int value = in.nextInt();
        if (value > 0) {
            value++;
            System.out.println(value);
        }
        if (value < 0) {
            System.out.println(value);
        }
        in.close();
    }


}