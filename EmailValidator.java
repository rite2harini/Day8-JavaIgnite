/*
Create a program that:

Takes a string input

Print:

Uppercase version
Lowercase version
Example:
Input: Java
Output:
JAVA
java
*/
public class StringConverter {
    public static void main(String[] args) {
        String input = "Java";
        
        System.out.println(input.toUpperCase());
        System.out.println(input.toLowerCase());
    }
}
