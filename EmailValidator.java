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
import java.util.Scanner;
public class EmailValidator 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A String : ");
        String str = sc.nextLine();
        System.out.println("Uppercase Version :" +str.toUpperCase());
        System.out.println("Lowercase Version : " +str.toLowerCase());
    }
    
}
