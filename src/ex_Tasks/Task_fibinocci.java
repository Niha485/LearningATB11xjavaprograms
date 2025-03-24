package ex_Tasks;

import java.util.Scanner;

public class Task_fibinocci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter number:  ");
        int n = scanner.nextInt();
        int first = 0;
        int second = 1;
        int next = first + second;
        System.out.print(first +","+ second);
        for (int i=2; i<n; i++){
            next = first + second; //next = 0 + 1 = 1
                                   //first = 1
                                   //second = 1
            System.out.print("," + next);
            first = second;
            second = next;
        }

    }
}
