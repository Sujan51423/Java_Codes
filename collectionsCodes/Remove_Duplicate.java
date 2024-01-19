package collectionsCodes;

import java.util.HashSet;
import java.util.Set;

public class Remove_Duplicate {

	public static void main(String[] args) {
		
		int[] nums = {1,1,1,2,3,4,6};
		Set<Integer> uniques = new HashSet<>();
		for (int itr = 0; itr<nums.length; itr++) {
			uniques.add(nums[itr]);
		}
		System.out.println("Unique Array: " + uniques);
	}

}
