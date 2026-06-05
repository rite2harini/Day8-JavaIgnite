package JavaIgniteDay9;
import java.util.Scanner;

public class Text_Processor_System {

    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder(s);
        System.out.println("Original: " + sb);
        sb.append(" Programming");
        System.out.println("After Append: " + sb);
        int mid = sb.length() / 2;
        sb.insert(mid, " Easy ");
        System.out.println("After Insert: " + sb);
        int start = sb.indexOf("Easy");
        int end = start + 4;
        sb.replace(start,end, "Powerful");
        System.out.println("After Replace: " + sb);
        sb.reverse();
        System.out.println("After Reverse: " + sb);

        sc.close();
    }
}
