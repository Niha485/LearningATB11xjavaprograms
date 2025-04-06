package ex_14_string_builder_buffer;

public class Lab048_builder_function {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");
        sb.append("programming");
        System.out.println(sb);
        sb.delete(4,16);
        System.out.println(sb);
        sb.replace(0,4,"Python");
        System.out.println(sb);
    }
}
