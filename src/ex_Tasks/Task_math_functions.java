package ex_Tasks;

public class Task_math_functions {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int z = 10;
        double Xpow = Math.pow(x,2);
        double Ypow = Math.pow(y,2);
        int zabs = Math.abs(z);
        double a = Xpow + Ypow - zabs;
        double result = Math.cbrt(a);
        System.out.println("Result: "+ result);

        // Easy way

        /*package ex_Task;

        public class Task02_CubeRoot {
            public static void main(String[] args) {
                int X = 10, Y = 10, Z = 10;
                double result = Math.cbrt((X*X)+(Y*Y)-Math.abs(Z));
                System.out.println(result);
            }
        }*/
    }
}
