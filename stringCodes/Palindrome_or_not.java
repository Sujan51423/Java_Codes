package stringCodes;

import java.util.Scanner;

public class Palindrome_or_not {

	public static void main(String[] args) {
		String first;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:");
		first = sc.nextLine();
		StringBuffer secRev = new StringBuffer(first);
		secRev = secRev.reverse();
		if (first.contentEquals(secRev)) {
			System.out.println("These is a Palindrome");
		}
		else {
			System.out.println("These is not a Palindrome");
		}
		sc.close();
	}

}
