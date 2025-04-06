package ex_15_OOPS_;

public class Lab_57_oops {
    public static void main(String[] args) {
        Person harika;
        Person P1 = new Person();
        P1.name= "Niha";
        System.out.println(P1.name);
        Person P2 = new Person();
        P2.name= "Hari";
        System.out.println(P2.name);
        // Person - Class
        // P2 - Object Ref
        // new Person() -> Object
    P1.sleep();
    P1.talk();
    }
    }
// Attribute | Properties |  Data Members | Instance variables

class Person {
     String name;
     int age;
     long phone_num;
     boolean married;
     double salary;

// Behaviour | Function | Method
    void sleep() {
        System.out.println("He is sleeping");
    }
    String greet (String name){
        return "hello"+name;
    }
    void talk() {
        System.out.println("He is talking");
    }
}


