/*
String Compression (Very Tricky)

Create a program that:

Compresses repeating characters
Example:
Input: aaabbcc
Output: a3b2c2
  */
package java_internship_day9;
import java.util.Scanner;
public class String_Compression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str;
		System.out.println("Enter the string :");
		str = sc.nextLine();
		int count =1,i;
		char temp = str.charAt(0);
		for(i=1;i<str.length();i++) {
			if(temp==str.charAt(i))
				count++;
			else {
				System.out.printf("%c%d ",temp, count);
				count =1;
				temp=str.charAt(i);
			}
		}
		System.out.printf("%c%d ",temp,count);
		sc.close();
		
	}

}
