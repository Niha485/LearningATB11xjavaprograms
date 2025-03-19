package ex_Tasks;

public class Task_Increment {
    public static void main(String[] args) {
        int a = 10;
        //ExpA -> 11
        //ExpB -> 11
        //ExpC -> 12
        //++a  -> 11  (a becomes 11 and 11 is used)
        //a++  -> 11  (11 is used, then a becomes 12)
        //a++  -> 12  (12 is used, then a becomes 13)
        //ExpA+ExpB+ExpC -> 11+11+12=34
        System.out.println(++a + a++ + a++);
        //value of a -> 13
        //++a: a = 11, and 11 is used in the expression.
        //a++: 11 is used in the expression, then a = 12.
        //a++: 12 is used in the expression, then a = 13.
        System.out.println(a);
    }
}
