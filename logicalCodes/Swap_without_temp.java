package logicalCodes;

import java.util.Scanner;

public class Swap_without_temp {

	public static void main(String[] args) {
		
		int first, second;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers:");
		first = sc.nextInt();
		second = sc.nextInt();
		first = first + second;
		second = first - second;
		first = first - second;
		System.out.println("First number: "+ first);
		System.out.println("second number: "+ second);
		sc.close();
	}

}
