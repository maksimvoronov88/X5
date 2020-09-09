package lesson2;
import java.util.Scanner;


public class Work2 {
    public static void main (String[] arg){

        Scanner in = new Scanner(System.in);
        System.out.println("Input number: ");
        int value = in.nextInt();
        System.out.println((value % 10) + ((value / 10)  % 10) + (value / 100));
        in.close();
    }


}