public class StringBuilderEditorr {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        StringBuilder sb = new StringBuilder(sc.nextLine());

	        // Append a word at the end
	        sb.append(" Programming");
	        System.out.println("After Append: " + sb);

	        // Insert "Easy" in the middle
	        int mid = sb.length() / 2;
	        sb.insert(mid, " Easy ");
	        System.out.println("After Insert: " + sb);

	        // Replace "Easy" with "Powerful"
	        int start = sb.indexOf("Easy");
	        int end = start + "Easy".length();
	        sb.replace(start, end, "Powerful");
	        System.out.println("After Replace: " + sb);

	        // Reverse the final string
	        sb.reverse();
	        System.out.println("After Reverse: " + sb);

	        sc.close();
	    }
	}


