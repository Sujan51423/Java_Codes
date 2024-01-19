package logicalCodes;

import java.util.Arrays;
import java.util.Scanner;

public class Binary_Search {

	public static void main(String[] args) {
		int[] nums = {1,5,6,7,3,4,9};
		Arrays.sort(nums);
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to search: ");
		int toSearch = sc.nextInt();
		BinarySearch(nums,0,nums.length-1,toSearch);
		sc.close();
	}

	private static void BinarySearch(int[] nums, int first, int last, int toSearch) {
		
		int mid = (first + last)/2;
		
		while(first<=last) {
			if(nums[mid] < toSearch) {
				first = mid + 1;
			}
			else if(nums[mid] == toSearch) {
				System.out.println("Element is found");
				break;
			}
			else {
				last = mid - 1;
			}
			mid = (first + last)/2;
		}
		
	}

}
