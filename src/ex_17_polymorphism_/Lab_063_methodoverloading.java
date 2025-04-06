package ex_17_polymorphism_;

public class Lab_063_methodoverloading {
    public static void main(String[] args) {
        MathOperations m1 = new MathOperations(); //        MathOperations m1 = new MathOperations();

        int r1 = m1.add(3, 4);
        int r2 = m1.add(3, 4, 5);
        double r3 = m1.add(3.4, 5.5);
    }
}
        class MathOperations {
            // In the same class, When you have a method wit same
            // name but different arguments and different return type.
            int add(int a, int b) {
                return (a + b);
            }

            int add(int a, int b, int c) {
                return a + b + c;
            }

            double add(double a, double b) {
                return a + b;
            }

            String add(String a, String b) {
                return a + b;
            }
        }
/* class Camera {
    void click() {
        System.out.println("Clicked photo with no filter.");
    }

    void click(String filter) {
        System.out.println("Clicked photo with filter: " + filter);
    }

    void click(int timer) {
        System.out.println("Clicked photo with timer: " + timer + " seconds.");
    }
}
Real-time example:
Think of a mobile phone camera 📱
You can click a photo:

Without filter → click()

With filter → click("black & white")

With timer → click(5)*/

