package ex_08_Switch;
import java.util.Scanner;
public class Lab034_switch_week {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter week number: ");
        int number = scanner.nextInt();
        switch(number){
            case 1:
                System.out.println("mon");
                break;
            case 2:
                System.out.println("tue");
                break;
            case 3:
                System.out.println("wed");
                break;
            case 4:
                System.out.println("thu");
                break;
            case 5:
                System.out.println("fri");
                break;
            case 6:
                System.out.println("sat");
                break;
            case 7:
                System.out.println("sun");
                break;
            default:
            System.out.println("Invalid week number");
            break;
        }
    }
}
