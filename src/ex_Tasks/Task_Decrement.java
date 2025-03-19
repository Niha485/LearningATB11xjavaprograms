package ex_Tasks;

public class Task_Decrement {
    public static void main(String[] args) {
    int a = 20;
    //ExpA -> 19
    //ExpB -> 19
    //ExpC -> 20
    //ExpA+ExpB+ExpC -> 19+19+20 -> 58
        System.out.println(--a + a++ + a--);
    //Value of a -> 19
        System.out.println(a);
}
}

