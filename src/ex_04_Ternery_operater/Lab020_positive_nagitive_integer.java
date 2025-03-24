package ex_04_Ternery_operater;

public class Lab020_positive_nagitive_integer {
    public static void main(String[] args) {
        String num1 = args[0];
        int num2 = Integer.parseInt(num1);
        // result = condition ? expression1 : expression2;
        String number = num2 > 0 ?"positive number" : "nagitive number";
        System.out.println(number);
    }
}
