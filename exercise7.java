public class exercise7 {

	public static String reverseString(String s) {
		if (s == null) return null;
		StringBuilder sb = new StringBuilder(s.length());
		for (int i = s.length() - 1; i >= 0; i--) {
			sb.append(s.charAt(i));
		}
		return sb.toString();
	}
	public static void main(String[] args) {

		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.print("Enter a string to reverse: ");
		if (scanner.hasNextLine()) {
			String input = scanner.nextLine();
			System.out.println("Reversed: " + reverseString(input));
		} else {
			System.out.println("No input provided.");
		}
		scanner.close();
	}

}
