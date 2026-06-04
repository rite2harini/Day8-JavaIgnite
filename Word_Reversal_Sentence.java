/*
Word Reversal in Sentence

Create a program that:

Takes a full sentence as input
Reverses each word, but keeps word order same
Example:
Input: Java is fun
Output: avaJ si nuf
  */
public class reverse_string
{
    public static void main(String[] args)
    {
        String name = "Ayush Samanta";
        String rev = "";
        for(int i=name.length()-1;i>=0;i--)
        {
            rev = rev + name.charAt(i);
        }
        System.out.print(rev);
    }
