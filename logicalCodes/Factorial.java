package logicalCodes;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		int num = sc.nextInt(), fact = 1;
		for(int itr = num; itr>=2 ; itr--) {
			fact = fact * itr; 
		}
		System.out.println("Factorial of " + num + " is: " + fact);
		sc.close();
	}

}
