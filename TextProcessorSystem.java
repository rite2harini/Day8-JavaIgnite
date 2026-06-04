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
public class StringBuilderTasks {
    public static void main(String[] args) {
        StringBuilder text = new StringBuilder("Java");
        System.out.println(text);

        text.append(" Programming");
        System.out.println(text);

        text.insert(5, "Easy ");
        System.out.println(text);

        int start = text.indexOf("Easy");
        text.replace(start, start + 4, "Powerful");
        System.out.println(text);

        text.reverse();
        System.out.println(text);
    }
}
