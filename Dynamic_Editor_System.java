public class StringBuilderEditor {

	    public static void main(String[] args) {

	        // Start with "Java"
	        StringBuilder sb = new StringBuilder("Java");
	        System.out.println("Start: " + sb);

	        // Insert " Programming"
	        sb.insert(4, " Programming");
	        System.out.println("After Insert: " + sb);

	        // Delete "Java"
	        sb.delete(0, 4);
	        System.out.println("After Delete: " + sb);

	        // Replace "Programming" with "Coding"
	        sb.replace(1, sb.length(), "Coding");
	        System.out.println("After Replace: " + sb);

	        // Reverse final string
	        sb.reverse();
	        System.out.println("After Reverse: " + sb);
	    }
	}



