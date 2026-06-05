package JavaIgniteDay9;
import java.util.Scanner;
public class Word_Reversal_Sentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name;
		int i;
		System.out.println("Enter the string :");
		name = sc.nextLine();
		StringBuilder sb = new StringBuilder(name);
		String res="";
		String temp="";
		for(i=0;i<name.length();i++) {
			 if(name.charAt(i)==' ') {
			
				StringBuilder sb1 = new StringBuilder(temp);
				res = res + sb1.reverse();
			 }
			 else
				 temp=temp+name.charAt(i);
				 
		}
		 StringBuilder sb1 = new StringBuilder(temp);

	     res = res + sb.reverse();

	     System.out.println("Reversed Sentence : " + res);

	     sc.close();

	}

}
