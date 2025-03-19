package ex_Tasks;
import java.util.Scanner;

public class Task_Triangle_classifier {
    public static void main(String[] args) {
        /*
         Write a program that classifies a triangle based on its side lengths.
         Given three input values representing the lengths of the sides,
         determine if the triangle is equilateral (all sides are equal),
         isosceles (exactly two sides are equal),
         or scalene (no sides are equal).
         Use an if-else statement to classify the triangle.
        */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first side of triangle: ");
        int n1 = scanner.nextInt();
        System.out.println("Enter second side of triangle: ");
        int n2 = scanner.nextInt();
        System.out.println("Enter third side of triangle: ");
        int n3 = scanner.nextInt();
        if (n1 == n2 && n2 == n3) {
            System.out.println("Equiateral Triangle");
        }else if (n1 == n2 || n2 == n3 || n3 == n1) {
            System.out.println(" Isosceles Triangle");
        }else{
                    System.out.println("Scalene Triangle");
                }
        }

    }
