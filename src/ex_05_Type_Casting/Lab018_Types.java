package ex_05_Type_Casting;

public class Lab018_Types {
    public static void main(String[] args) {
        byte b = 100;
        int a = b; // Valid syntax -> smaller data into the bigger data type
        // Valid - > Implicit Casting- Automatically
        // Implicit - Casting - Widening
        int a1 = (int)b; // Explicit Casting - Widening( doesn't require)

        long phone_no = 9876543210l;
        //short s = phone_no; // implicit ?
        short s = (short) phone_no; // Explicit Casting - Narrowing
        System.out.println(s);
    }
}
