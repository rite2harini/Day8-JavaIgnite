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
public class StringBuilderEditor {
    public static void main(String[] args) {
        StringBuilder text = new StringBuilder("Java");
        System.out.println(text);

        text.insert(4, " Programming");
        System.out.println(text);

        text.delete(0, 5);
        System.out.println(text);

        int index = text.indexOf("Programming");
        text.replace(index, index + 11, "Coding");
        System.out.println(text);

        text.reverse();
        System.out.println(text);
    }
}
