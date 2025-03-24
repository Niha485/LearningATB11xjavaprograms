package ex_06_Increment_Decrement;

public class Lab026_pre_increment {
    public static void main(String[] args) {

        int a = 10;
        int b = ++a; // 10+1 -> b -> 11
        System.out.println(b); // 11
        System.out.println(a); // 11
        // Increment a first, then use the updated value of a.
        //So:
        //a = a + 1 → a becomes 11.
        //Now, b is assigned the value of a, which is 11.
    }
}

