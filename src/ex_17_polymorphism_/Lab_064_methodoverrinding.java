package ex_17_polymorphism_;

public class Lab_064_methodoverrinding {

    public static void main(String[] args) {
        Dog d1  = new Dog();
        d1.sound();
    }


}

class Animal{
    void sound(){
        System.out.println("Animal Sound!");
    }
}

class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Bark!");
    }
}

    /*public static void main(String[] args) {
        class Mom {
            void sleepTime() {
                System.out.println("Sleep at 9 PM");
            }
        }

        class Child extends Mom {
            @Override
            void sleepTime() {
                System.out.println("Sleep at 11 PM");
            }
        }

    }
} Real-time example:
Suppose your mom says:

"You should sleep at 9 PM."

But you (as a child) say:

"I’ll sleep at 11 PM 😄"

You are overriding the rule from your parent.*/
