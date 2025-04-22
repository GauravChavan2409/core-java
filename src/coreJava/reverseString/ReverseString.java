package coreJava.reverseString;

public class ReverseString {
	public static void main(String[] args) {
		String inputString = "example";
		String reversedString = "";

		for (int i = inputString.length() - 1; i >= 0; i--) {
			reversedString += inputString.charAt(i);
		}

		System.out.println("Original string: " + inputString);
		System.out.println("Reversed string: " + reversedString);
	}
}
