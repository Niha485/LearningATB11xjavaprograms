package ex_06_Increment_Decrement;

public class Lab031_example2 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + ++a);
        System.out.println(a);
        // ++a -> A -> ExpA -> 11 , a -> 11
        // +
        // ++a -> B -> ExpB -> 12 , a -> 12
        // ExpA + ExpB -> 11+12 -> 23, a -> 12
    }
}

