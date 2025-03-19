package ex_02_Operators;

public class Lab017_Other_operators {
        public static void main(String[] args) {
            // New Operator
                String s1 = "Niharika";                 // Stored in String Pool
                String s2 = "Niharika";                 // Reused from Pool
                String s3 = new String("Niharika");     // Created in Heap (separate object)
                String s4 = new String("Niharika");     // Another new object in Heap

                // Comparing references
                System.out.println(s1 == s2); // true (same reference in String Pool)
                System.out.println(s1 == s3); // false (s3 is in Heap, not Pool)
                System.out.println(s3 == s4); // false (different Heap objects)

            /* Purpose	Used to create objects and allocate memory dynamically.
            Where it works?	Classes, Arrays, and Objects.
            Memory Allocation	Allocates memory on the heap.
            Returns	A reference to the new object.*/


            /* Compound Assignment Operators
        +=, -=, /=, *=
        int age = 10;
        age += 10;
        age = age+10;

         */
            // Bitwise - Not important for Automation
            // ~ - Bitwise Not,
            // >> - Right shift,
            // << Left Shift,
            // ^ - XOR

            // ++,-- - Increment and Decrement Operator
            // Ternary Operator ?:
            }
        }



