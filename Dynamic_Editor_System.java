package JAVA_DAY_9;

public class DYNAMIC_EDITOR_SYSTEM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				StringBuilder sb = new StringBuilder("");
				System.out.println("Start: "+sb.insert(0,"Java"));
				System.out.println("Insert: Programming");
				sb.append(" Programming");
				System.out.println("String: "+sb);
				System.out.println("Delete: Java");
				sb.delete(0,5);
				System.out.println("String: "+sb);
				System.out.println("Replace: Programming -> Coding");
				sb.replace(0, 11, "Coding");
				System.out.println("String: "+sb);
				System.out.println("Reverse string: "+sb.reverse());
	}
}
