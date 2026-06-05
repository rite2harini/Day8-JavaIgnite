
package JavaIgniteDay9;
import java.util.Scanner;
public class First_Non_Repeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s;
		
		int c,i,j;
		System.out.println("Enter the word :");
		s = sc.nextLine();
		for(i=0;i<s.length();i++) {
			c =0;
			for(j=0;j<s.length();j++)
				if(s.charAt(i) == s.charAt(j))
					c++;
			if(c == 1) {
				System.out.printf("%c is the first non reapeating letter",s.charAt(i));
				break;
			}
		}
		
		sc.close();
	}
}

