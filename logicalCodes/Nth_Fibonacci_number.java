package logicalCodes;

import java.util.Scanner;

public class Nth_Fibonacci_number {

	public static void main(String[] args) {
		
		System.out.print("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), count = 0, fib0 = 0, fib1 = 1, fib = 0;
		System.out.println(fib0);
		System.out.println(fib1);
		while (count+2 != n) {
			fib = fib0 + fib1;
			fib0 = fib1;
			fib1 = fib;
			count++;
			System.out.println(fib);
		}
		if(n==1) {
			System.out.println("The Fibonacci number is " + fib0);
		}
		else if(n==2) {
			System.out.println("The Fibonacci number is " + fib1);
		}
		else {
			System.out.println("The Fibonacci number is " + fib);
		}
		sc.close();
	}

}
