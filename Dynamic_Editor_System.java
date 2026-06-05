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

public class TextEditor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int choice;
        
        System.out.print("Enter initial text: ");
        sb.append(sc.nextLine());
        
        do {
            System.out.println("\nCurrent: " + sb);
            System.out.println("1.Insert 2.Delete 3.Replace 4.Reverse 5.Exit");
            System.out.print("Choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            
            switch(choice) {
                case 1:
                    System.out.print("Text to insert: ");
                    String ins = sc.nextLine();
                    System.out.print("Position (0-" + sb.length() + "): ");
                    sb.insert(sc.nextInt(), ins);
                    sc.nextLine();
                    break;
                    
                case 2:
                    if(sb.length() == 0) { System.out.println("Empty!"); break; }
                    System.out.print("Start pos: ");
                    int s = sc.nextInt();
                    System.out.print("End pos: ");
                    sb.delete(s, sc.nextInt());
                    sc.nextLine();
                    break;
                    
                case 3:
                    System.out.print("Start pos: ");
                    int st = sc.nextInt();
                    System.out.print("End pos: ");
                    int en = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Replace with: ");
                    sb.replace(st, en, sc.nextLine());
                    break;
                    
                case 4:
                    if(sb.length() > 0) sb.reverse();
                    else System.out.println("Empty!");
                    break;
                    
                case 5:
                    System.out.println("Final: " + sb);
                    break;
                    
                default:
                    System.out.println("Invalid choice!");
            }
        } while(choice != 5);
        
        sc.close();
    }
}
