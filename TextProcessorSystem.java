package JAVA_DAY_9;

import java.util.Scanner;

public class TEXT_PROCESSSOR_SYSTEM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String string = sc.nextLine();
		sb.insert(0, string);
		System.out.println("Inserting at end: Programming");
		sb.append(" Programming");
		System.out.println("String: "+sb);
		System.out.println("Insert at middle: Easy");
		sb.insert(4," Easy");
		System.out.println("String: "+sb);
		System.out.println("Replace: Easy -> Powerful");
		sb.replace(5, 9, "Powerful");
		System.out.println("String: "+sb);
		System.out.println("Reverse string: "+sb.reverse());
		sc.close();
	}

}
