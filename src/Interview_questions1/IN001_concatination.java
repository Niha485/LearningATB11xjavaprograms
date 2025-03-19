package Interview_questions1;

public class IN001_concatination {
    public static void main(String[] args) {
        String first_name = "Kamandala";
        String last_name = "Niharika";

        int a = 10;
        int b = 10;

        System.out.println(first_name + last_name + a + b);
        // // PramodDutta1010 - first operator - + performed as Concatenation

        System.out.println(a + b + first_name + last_name);


        System.out.println(first_name + last_name + (a + b));
    }
}