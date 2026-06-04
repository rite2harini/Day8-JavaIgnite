/*
Create a program that:

Takes a string input using StringBuilder

Perform the following operations:

Tasks:
Append a word at the end
Insert a word in the middle
Replace part of the string
Reverse the final string
Example Flow:
Input: Java
Append: Programming
Insert: "Easy" in middle
Replace: "Easy" → "Powerful"
Reverse final string
Rules:
Must use StringBuilder only
Do not convert back to String for operations
*/
import java.util.Scanner;

public class StringBuilderEditor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        
        StringBuilder sb = new StringBuilder(input);

        System.out.println("\nOriginal String: " + sb);

        
        sb.append(" Programming");

        System.out.println("After Append: " + sb);

     
        int middle = sb.length() / 2;

        sb.insert(middle, " Easy ");

        System.out.println("After Insert: " + sb);

        
        int start = sb.indexOf("Easy");
        int end = start + 4;

        sb.replace(start, end, "Powerful");

        System.out.println("After Replace: " + sb);

       
        sb.reverse();

        System.out.println("After Reverse: " + sb);

        sc.close();
    }
}
