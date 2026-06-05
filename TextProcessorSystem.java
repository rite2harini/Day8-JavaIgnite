public class StringBuilderEditor {
	public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java");
        System.out.println("Start: " + sb);

        sb.insert(4, " Programming");
        System.out.println("After Insert: " + sb);

        sb.delete(0, 4);
        System.out.println("After Delete: " + sb);

        
        sb.replace(1, sb.length(), "Coding");
        System.out.println("After Replace: " + sb);

  
        sb.reverse();
        System.out.println("After Reverse: " + sb);
    }

}
