package ex_07_if_condition;
public class Lab33_input {
    public static void main(String[] args) {
        int age = Integer.parseInt(args[0]);
        if (age > 21) {
            System.out.println(" you allowed to married");
        } else {
            System.out.println("you  not allowed to married");
        }
    }
}
