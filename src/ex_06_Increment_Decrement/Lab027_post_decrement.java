package ex_06_Increment_Decrement;

public class Lab027_post_decrement {
    public static void main(String[] args) {
        int a = 10;
        int b = a--; //The current value is returned first, and then the value is decremented
        System.out.println(b); // 10
        System.out.println(a); //9
    }
}

