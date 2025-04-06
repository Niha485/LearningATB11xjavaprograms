package ex_14_string_builder_buffer;

public class Lab047_builder_vs_buffer {
    public static void main(String[] args) {
        String n1 = "niha";
        String n2 = new String("niha"); //        // String - 90%

        StringBuilder stringBuilder = new StringBuilder("niha");
        StringBuffer stringBuffer = new StringBuffer("niha");    // less than <10% used.

        System.out.println(n1);
        System.out.println(n2);
        System.out.println(stringBuilder);
        System.out.println(stringBuffer);

    }
}
