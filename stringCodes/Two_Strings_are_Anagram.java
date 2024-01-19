package stringCodes;

import java.util.Arrays;
import java.util.Scanner;

public class Two_Strings_are_Anagram {

	public static void main(String[] args) {
		
		String first, second;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two Strings:");
		first = sc.nextLine();
		second = sc.nextLine();
		char[] fString = first.toCharArray(), sString = second.toCharArray();
		Arrays.sort(sString);
		Arrays.sort(fString);
		if (Arrays.equals(sString, fString)) {
			System.out.println("These are Anangrams");
		}
		else {
			System.out.println("These are not Anagrams");
		}
		sc.close();
	}
}
