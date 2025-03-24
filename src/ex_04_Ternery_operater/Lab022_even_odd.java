package ex_04_Ternery_operater;

public class Lab022_even_odd {
    public static void main(String[] args) {
        String number= args[0];
        int n = Integer.parseInt(number);
        String result = (n%2)==0? "even number": "odd number";
        System.out.println(result);
    }
}
