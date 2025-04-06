package ex_14_string_builder_buffer;

public class Lab049_buffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Java");// StringBuffer is thread-safe (synchronized), StringBuilder is faster but not thread-safe

        sb.append(" Programming");
        System.out.println(sb);
        sb.delete(5,16); // Delete the substring
        System.out.println(sb);
        sb.replace(0, 4, "C++");
        System.out.println(sb);

    }
}

