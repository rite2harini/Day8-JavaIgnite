/*
String Compression (Very Tricky)

Create a program that:

Compresses repeating characters
Example:
Input: aaabbcc
Output: a3b2c2
  */
public class StringCompression {

    public static void main(String[] args) {

        String str = "aaabbccccd";

        StringBuilder compressed = new StringBuilder();

        int count = 1;

        for (int i = 0; i < str.length(); i++) {

            
            while (i < str.length() - 1 &&
                   str.charAt(i) == str.charAt(i + 1)) {

                count++;
                i++;
            }

            compressed.append(str.charAt(i));
            compressed.append(count);

            count = 1;
        }

        System.out.println("Compressed String: " + compressed);
    }
}
