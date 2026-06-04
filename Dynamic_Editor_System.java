/*
StringBuilder Dynamic Editor System

Create a program that uses StringBuilder to simulate a text editor.

Operations:
Insert text
Delete part of text
Replace text
Reverse text

Example Flow:
Start: Java
Insert: Programming
Delete: Java
Replace: Programming  - Coding
Reverse final string
*/
import java.util.Scanner;

public class DynamicEditorSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       
        StringBuilder sb = new StringBuilder("Java");

        System.out.println("Initial Text: " + sb);

      
        sb.append(" Programming");

        System.out.println("After Insert: " + sb);

        
        sb.delete(0, 5);

        System.out.println("After Delete: " + sb);

        
        int start = sb.indexOf("Programming");
        int end = start + "Programming".length();

        sb.replace(start, end, "Coding");

        System.out.println("After Replace: " + sb);

        
        sb.reverse();

        System.out.println("After Reverse: " + sb);

        sc.close();
    }
}
