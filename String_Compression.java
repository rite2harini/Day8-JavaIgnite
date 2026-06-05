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
        String str = sc.nextLine();

        String compressed = "";

        int count = 1;

        for (int i = 0; i < str.length(); i++) {

           
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }

            
            compressed = compressed + str.charAt(i) + count;

            count = 1;
        }

       
        System.out.println("Compressed String: " + compressed);
    }
}
