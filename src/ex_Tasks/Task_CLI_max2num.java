package ex_Tasks;

public class Task_CLI_max2num {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int max = (num1>num2) ? num1 : num2;
        System.out.println("Max number is: "+max);

    }
}
