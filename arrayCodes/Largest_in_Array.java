package arrayCodes;

import java.util.Scanner;

public final class Largest_in_Array {

	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,6,7};
		int largest = 0;
		for(int itr = 0; itr<numbers.length; itr++) {
			if(numbers[itr]>largest) {
				largest = numbers[itr];
			}
		}
		System.out.println("Largest number is: " + largest);
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size:");
		int n = sc.nextInt();
		numbers = new int[n];
		System.out.print("Enter array Elements:");
		for (int itr = 0; itr < n; itr++) {
			numbers[itr] = sc.nextInt();
		}largest = 0;
		for(int itr = 0; itr<numbers.length; itr++) {
			if(numbers[itr]>largest) {
				largest = numbers[itr];
			}
		}

		System.out.println("Largest number in the Given Array: " + largest);
		sc.close();
	}

}
