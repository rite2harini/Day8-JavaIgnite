/*
String Compression (Very Tricky)

Create a program that:

Compresses repeating characters
Example:
Input: aaabbcc
Output: a3b2c2
  */
import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        
        StringBuilder result = new StringBuilder();
        int count = 1;
        
        for(int i = 0; i < s.length(); i++) {
            if(i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
                count++;
            } else {
                result.append(s.charAt(i)).append(count);
                count = 1;
            }
        }
        
        System.out.println("Compressed: " + result);
        sc.close();
    }
}
