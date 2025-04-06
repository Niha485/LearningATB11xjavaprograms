package ex_13_strings;

public class Lab52_String_functions {
        public static void main(String[] args) {
            char c = 'A';
            System.out.println(c);

            String s1 = "ABCD";
            System.out.println(s1.length());
            System.out.println(s1.toLowerCase());
            System.out.println(s1.toUpperCase());
            System.out.println(s1.concat("E"));

            String str1 = "Hello";
            String str2 = "Hello";
            String str3 = new String("Hello");
            System.out.println(str1 == str2);
            System.out.println(str1 == str3);
            System.out.println(str1.equals(str3)); /* "== checks if two variables point to the same memory location."
                                                      " equals() checks if the values are the same "*/

            String name = "Sonal";
            System.out.println(name.length()); //"Sonal" → 'S' is at index 0, 'o' at 1, 'n' at 2, 'a' at 3, 'l' at 4.
            System.out.println(name.charAt(3));
            //   System.out.println(name.charAt(10)); // StringIndexOutOfBoundsException

            // 2. concat()
            System.out.println(name.concat(" Patel"));

            // 3. contains()
            System.out.println(name.contains("om"));//"Sonal" does not contain "om", so it returns false.



            // 4. equals()
            System.out.println(name.equals("Sonal"));

            // 5. equalsIgnoreCase()
            System.out.println(name.equalsIgnoreCase("sonal"));

            // 6. indexOf() //  sonal -> ? o
            System.out.println(name.indexOf('o')); //"Sonal" → 'o' appears at index 1.

            String s = "madam";
            // Returns the index within this string of the
            // first occurrence of the specified substring.
            System.out.println(s.indexOf("m"));// "madam" → First 'm' appears at index 0.

            // 7. length()
            System.out.println(name.length());

            // 8. replace( , )
            System.out.println(name.replace('n', 'N')); //Replaces 'n' with 'N'.

            // 9. split()

            String name4 = "pramod@live.com@123";
            String[] split = name4.split("@");
            System.out.println(split[0]);
            System.out.println(split[1]);
            System.out.println(split[2]);

            // 10. substring( , )
            System.out.println(name.substring(1, 3)); //o/p on

            // 11. toLowerCase()
            System.out.println("SONAL".toLowerCase());

            // 12. toUpperCase()
            System.out.println("sonal".toUpperCase());

            // 14. startsWith()
            System.out.println(name.startsWith("S"));

            // 15. endsWith()
            System.out.println(name.endsWith("a"));

            // 16. trim()
            String name3 = "    Sonal Harish     ";
            System.out.println(name3.trim()); //Output: "Sonal Harish"

            // 17. compareTo()
            System.out.println(name.compareTo("Sonal"));/*
                                                           It compares two strings lexicographically (dictionary order).
                                                             If the strings are equal, it returns 0.
                                                              If name comes before "Sonal", it returns a negative number.
                                                                 If name comes after "Sonal", it returns a positive number.

                                                                 System.out.println("apple".compareTo("banana")); // Output: -1 ('a' comes before 'b')
                                                                 System.out.println("banana".compareTo("apple")); // Output: 1  ('b' comes after 'a')
                                                                 System.out.println("orange".compareTo("orange")); // Output: 0  (strings are equal)
                                                                 */
            StringBuilder stringBuilder = new StringBuilder("Sonal");
            System.out.println(stringBuilder);

            StringBuilder sb = new StringBuilder("Hi"); /*
                                                          StringBuilder is mutable (it can be changed).
                                                          .toString() converts StringBuilder into a regular String.
                                                          sb.toString() simply returns the string stored in sb, which is "Hi".*/
            System.out.println(sb.toString()); // out put ; Hi


            String anotherPalindrome = "Niagara. O roar again!";
            String roar = anotherPalindrome.substring(11, 15);
            System.out.println(roar);


            String s11 = "Pramod";
            String s21 = s11.concat("Dutta");
            System.out.println(s21);

//        Concatenation (By +)

            String s111 = "Hello";
            String s222 = "World";

            String s333 = "ji";
            String result1 = s111 + s333 + s222;
            System.out.println(result1);



            String n = "PRamoddUTTA";
            System.out.println(n.indexOf("d"));
            System.out.println(n.lastIndexOf("d"));
            System.out.println(n.lastIndexOf("s"));
        }
    }

