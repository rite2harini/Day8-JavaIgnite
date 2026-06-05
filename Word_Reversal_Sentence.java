/*
Word Reversal in Sentence

Create a program that:

Takes a full sentence as input
Reverses each word, but keeps word order same
Example:
Input: Java is fun
Output: avaJ si nuf
  */
package JavaIgniteDay9;
import java.util.Scanner;

public class Word_Reversal {
	public static void main(String[] args) {
    	// TODO Auto-generated method stub
		
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String str = sc.nextLine();

        String word = "";
        String res = "";

        for (int i = 0; i < str.length(); i++) 
        {

            if (str.charAt(i)!=' ')
            {
                word += str.charAt(i);
            }
            else 
            {
                for (int j = word.length() - 1; j >= 0; j--) 
                {
                    res += word.charAt(j);
                }

                res += " ";
                word = "";
            }
        }
        for (int j = word.length() - 1; j >= 0; j--)
        {
            res += word.charAt(j);
        }

        System.out.println("Reversed String is: \n" + res);

        sc.close();
    }
}

