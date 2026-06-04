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
        String input = "aaabbcc";
        StringBuilder compressed = new StringBuilder();
        
        int count = 1;
        for (int i = 0; i < input.length(); i++) {
            if (i + 1 < input.length() && input.charAt(i) == input.charAt(i + 1)) {
                count++;
            } else {
                compressed.append(input.charAt(i));
                compressed.append(count);
                count = 1;
            }
        }
        
        System.out.println(compressed.toString());
    }
}
