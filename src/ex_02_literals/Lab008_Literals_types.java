package ex_02_literals;

public class Lab008_Literals_types {
    public static void main(String[] args) {
        // 1 Boolean Literals
        boolean good = true;
        boolean bad = false;
        System.out.println(good);

        // 2 Character Literals ('A', '9', '\n')
        char grade = 'A';
        char digit = '9';
        char newLine = '\n'; // Escape sequence for new line

       // 3 String Literals ("Hello", "Java")
        String greeting = "Hello, World!";
        String language = "Java";

        // 4 Integral Literals (Integer values)
        //Includes decimal (base 10), binary (base 2), octal (base 8), and hexadecimal (base 16) numbers.

        int decimalNumber = 100;   // Decimal (Base 10)
        int binaryNumber = 0b1010; // Binary (Base 2)
        int octalNumber = 0123;    // Octal (Base 8)
        int hexNumber = 0x1A;      // Hexadecimal (Base 16) 1-9, A-F

        // 5 Floating-Point Literals (3.14, 2.5e3)
        float pi = 3.14f;       // Float literal (use `f` or `F` suffix)
        double gravity = 9.81;  // Double literal (default type)
        double expValue = 2.5e3; // Scientific notation (2.5 × 10³ = 2500)

    }
}

