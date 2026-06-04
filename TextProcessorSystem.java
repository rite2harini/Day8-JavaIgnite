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
package day9_progs;

import java.util.Scanner;

public class Text_processor_System {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String → ");
        StringBuilder sb = new StringBuilder(sc.nextLine());

        System.out.print("Word to append → ");
        sb.append(" " + sc.nextLine());

        System.out.println("After Append → " + sb);

        System.out.print("Word to insert → ");
        String insertWord = sc.nextLine();

        System.out.print("Position to insert → ");
        int pos = sc.nextInt();
        sc.nextLine();

        sb.insert(pos, insertWord);

        System.out.println("After Insert → " + sb);

        System.out.print("Word to replace → ");
        String oldWord = sc.nextLine();

        System.out.print("New word → ");
        String newWord = sc.nextLine();

        int start = sb.indexOf(oldWord);

        if(start != -1) {
            sb.replace(start, start + oldWord.length(), newWord);
        }

        System.out.println("After Replace → " + sb);

        sb.reverse();

        System.out.println("After Reverse → " + sb);
        sc.close();
    }
}
