package ex_04_Ternery_operater;

public class Lab024_max0f3 {
    public static void main(String[] args) {
        int a= 3; int b= 5; int c=7;
        int max  = (a>b)?(a>c)?a:c: (b>c)?b:c;
        System.out.println("Max is: " + max);
        //        int max = (n1 > n2) ? (n1 > n3) ? n1 : n3 : ((n2 > n3) ? n2 : n3);
    }
}
