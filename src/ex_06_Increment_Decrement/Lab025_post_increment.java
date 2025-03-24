package ex_06_Increment_Decrement;

public class Lab025_post_increment {
    public static void main(String[] args) {
       int a=10;
        int b=a++;//First, assign the value, then increase
                  //b = a++ assigns b = 10 first.
                  //Then, a increments to 11.
        System.out.println("Value of a is: "+ a);
        System.out.println("Value of b is: "+ b);
    }
}
