package JAVA_DAY_9;

import java.util.Scanner;

public class FIRST_NON_REPEATING_CHARACTER {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the string:");
			String string = sc.nextLine();

			for(int i = 0; i < string.length(); i++)
			{
			    int count = 0;

			    for(int j = 0; j < string.length(); j++)
			    {
			        if(string.charAt(i) == string.charAt(j))
			        {
			            count++;
			        }
			    }

			    if(count == 1)
			    {
			        System.out.println("First non repeating character: " + string.charAt(i));
			        return;
			    }
			}

			System.out.println("All characters in the given string were repeating");
			sc.close();
		}
    }
}
