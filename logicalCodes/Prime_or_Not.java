package logicalCodes;

import java.util.Scanner;

public class Prime_or_Not {

	public static void main (String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		int num = sc.nextInt();
		int prime = 0;
		for (int itr = 2; itr<num; itr++) {
			if(num % itr == 0) {
				prime++;
			}
			if(prime>=2) {
				System.out.println("This is not a prime number");
				System.exit(0);
			}
		}
		System.out.println("This is a prime number");
		sc.close();
	}
}
