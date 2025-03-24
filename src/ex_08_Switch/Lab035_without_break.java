package ex_08_Switch;

import java.util.Scanner;

public class Lab035_without_break {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter week number: ");
            int number = scanner.nextInt();
            switch(number){
                case 1:
                    System.out.println("mon");

                case 2:
                    System.out.println("tue");

                case 3:
                    System.out.println("wed");

                case 4:
                    System.out.println("thu");

                case 5:
                    System.out.println("fri");

                case 6:
                    System.out.println("sat");

                case 7:
                    System.out.println("sun");

                default:
                    System.out.println("Invalid week number");

            }
        }
    }

