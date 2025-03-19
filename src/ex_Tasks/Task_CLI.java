package ex_Tasks;

public class Task_CLI {
    public static void main(String[] args) {
        String name = args[0];
        int salary = Integer.parseInt(args[1]);
        int age = Integer.parseInt(args[2]);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Age: " + age);
    }
}
/* package ex_Tasks;

public class Task_CLI {
    public static void main(String[] args) {
        try {
            // Directly accessing arguments without if conditions
            String name = args[0];
            int salary = Integer.parseInt(args[1]);
            int age = Integer.parseInt(args[2]);

            // Printing values
            System.out.println("Name: " + name);
            System.out.println("Salary: " + salary);
            System.out.println("Age: " + age);

        } catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
            // Catch exception when arguments are missing or invalid numbers
            System.out.println("Usage: java Task_CLI <name> <salary> <age>");
            System.out.println("Error: Please provide valid inputs.");
        }
    }
}
*/