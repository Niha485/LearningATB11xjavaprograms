package ex_12_Functions;

public class Lab_48_user_defined {
    public static void main(String[] args) {
        int r1 = sum_of_two_numbers(3, 4);
        int r2 = sum_of_two_numbers(13, 14);
        System.out.println(r1);
        System.out.println(r2);
    }
static int sum_of_two_numbers (int a, int b){
        return a+b;
    }
}
