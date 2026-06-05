package JavaIgniteDay9;
import java.util.Scanner;
public class Emailvalidator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s;
		int i;
		System.out.println("Enter an email :");
		s = sc.nextLine();
		int c=0;
		for(i=0;i<s.length();i++) {
			if(s.charAt(i)=='@')
				c++;
		}
		if(c==0)
			System.out.println("Not valid");
		else
			System.out.println("Valid");
		sc.close();
	}
}
