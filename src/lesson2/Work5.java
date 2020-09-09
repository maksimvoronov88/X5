package lesson2;
import java.util.Scanner;


public class Work5 {
    public static void main (String[] arg){

        Scanner in = new Scanner(System.in);
        System.out.println("Input number: ");
        int value1 = in.nextInt();
        int value2 = in.nextInt();
        int value3 = in.nextInt();
        if (value1<value2 && value1<value3) {
            System.out.println(value1);
        }
            else if (value2<value1 && value2<value3) {
            System.out.println(value2);
        }
        else if (value3<value1 && value3<value2) {
            System.out.println(value3);
        }

        //System.out.println(value);
        in.close();
    }


}