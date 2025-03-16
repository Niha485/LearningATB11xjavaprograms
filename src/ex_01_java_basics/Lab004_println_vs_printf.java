package ex_01_java_basics;

public class Lab004_println_vs_printf {
    public static void main(String[] args) {
        System.out.println("Kamandala");
        System.out.println("Niharika"); // By using println, it added new line
        // out put
        //Kamandala
        //Niharika
        System.out.printf("Kamandala");
        System.out.printf("Niharika");// By using printf, it cannot add new line
        // out put
        //KamandalaNiharika
    }
}
