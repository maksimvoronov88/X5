package lesson2;
import java.util.Scanner;


public class Work6 {
    public static void main (String[] arg){

        Scanner in = new Scanner(System.in);
        System.out.println("Input number: ");
        int value = in.nextInt();
        if (value > 0 && (value%2)==0) {
            System.out.println("Положительное четное");
        }
        else if (value > 0 && (value%1)==0) {
            System.out.println("Положительное нечетное");
        }
        else if (value < 0 && (value%2)==0) {
            System.out.println("Отрицательное четное");
        }
        else if (value < 0 && (value%1)==0) {
            System.out.println("Отрицательное нечетное");
        }
        else {
            System.out.println("Нулевое число");
        }
        in.close();
    }


}