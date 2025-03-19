package ex_Tasks;
import java.util.Scanner;
public class Task_Grade_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Value: ");
        int value = scanner.nextInt();
        String grade = (value>=90 && value<=100 )? "A":
                (value>=80 && value<=89)? "B":
                               (value>=70&& value<=79)? "C":
                                       (value>=60&&value<=69)?"D":
                                               (value>=0&&value<=59)?"F":
                                                       "Invalid Input";
        System.out.println(grade);
    }
}
