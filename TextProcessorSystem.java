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

public class StringBuilderOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        StringBuilder sb = new StringBuilder(sc.nextLine());
        System.out.println("Initial: " + sb);
        
        System.out.print("Append word: ");
        sb.append(" ").append(sc.nextLine());
        System.out.println("After append: " + sb);
        
        System.out.print("Insert word: ");
        String word = sc.nextLine();
        int mid = sb.length() / 2;
        sb.insert(mid, " " + word + " ");
        System.out.println("After insert: " + sb);
        
        System.out.print("Word to replace: ");
        String oldWord = sc.nextLine();
        System.out.print("Replace with: ");
        String newWord = sc.nextLine();
        
        int index = sb.indexOf(oldWord);
        if(index != -1) {
            sb.replace(index, index + oldWord.length(), newWord);
        }
        System.out.println("After replace: " + sb);
        
        sb.reverse();
        System.out.println("After reverse: " + sb);
        
        sc.close();
    }
}
