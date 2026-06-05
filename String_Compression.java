package JavaIgniteDay9;
import java.util.Scanner;
public class String_Compression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s;
		System.out.println("Enter the string :");
		s = sc.nextLine();
		int count =1,i;
		char temp = s.charAt(0);
		for(i=1;i<s.length();i++) {
			if(temp==s.charAt(i))
				count++;
			else {
				System.out.printf("%c%d ",temp, count);
				count =1;
				temp=s.charAt(i);
			}
		}
		System.out.printf("%c%d ",temp,count);
		sc.close();
		
	}

}
