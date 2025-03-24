package ex_04_Ternery_operater;

public class Lab021_Nested{
    public static void main(String[] args) {
        // age = 23 -> Adult  ( age > 18) , Minor (age  <18), Senior ( age > 65)
        // take an input from user
        // result = condition1 ? expression1 : (condition2 ? expression2 : expression3);
        String age1 = args[0];
        int age = Integer.parseInt(age1);
        String result = (age<18)?"minor":(age<65)?"Adult":"Senior";
        System.out.println(result);
    }
}
