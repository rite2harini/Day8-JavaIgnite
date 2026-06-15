package JAVA_DAY_9;

import java.util.Scanner;

public class EMAIL_VALIDATOR {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the email:");
			String string = sc.nextLine();
			for(int i=0;i<string.length();i++)
			{
				if(string.charAt(i)=='@')
				{
					for(int j=0;j<string.length();j++)
					{
						if(string.charAt(j)=='.')
						{
							System.out.println("Valid email! Proceed!");
							return;
						}
					}
				}
			}
			System.out.println("Invalid email!");
			sc.close();
		}
	}
}
