package stringCodes;

import java.util.Scanner;

public class Checking_Vowel_in_String {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String word = sc.nextLine();
		if(word.toLowerCase().matches(".*[aeiou].*")) {
			System.out.println("String has vowel in it");
		}
		else {
			System.out.println("String doesn't have vowel in it");
		}
		sc.close();
	}
}
