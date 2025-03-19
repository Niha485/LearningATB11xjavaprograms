package ex_Tasks;
import java.util.Scanner;
public class Task_even_odd {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter value");
        int value = scanner.nextInt();
        String number= (value %2==0)?"even":"odd";
        System.out.println(number);

    }
}
