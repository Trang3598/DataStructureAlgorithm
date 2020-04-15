package Week5;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		System.out.println("Input string:");
		Scanner scan = new Scanner(System.in);
		String inputString = scan.nextLine();
		ArrayListStack<Character> stack = new ArrayListStack<>();
		for (int i = 0; i < inputString.length(); i++) {
			stack.push(inputString.charAt(i));
		}
		String reverseString = "";

		while (!stack.isEmpty()) {
			reverseString = reverseString + stack.pop();
		}
		System.out.println("Reverse string = " +reverseString);

		if (inputString.equals(reverseString))
			System.out.println("Input string is palindrome");
		else
			System.out.println("Input string is not palindrome");
	}
}
