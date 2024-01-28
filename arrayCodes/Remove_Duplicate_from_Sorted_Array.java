/**
 * 
 */
package arrayCodes;

/**
 * @author Sujan5
 *
 */
public class Remove_Duplicate_from_Sorted_Array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int nums[] = {0,0,1,2,3,3,4};
		removeDuplicates(nums);
	}
	
	public static void removeDuplicates(int[] nums) {
        if (nums.length == 0) {
        	System.out.println("Empty");
        	System.exit(-1);
        }
        int slow = 0;
        for (int fast = 0; fast < nums.length; fast++){
            if (nums[fast] == nums[slow]) continue;
            slow++;
            nums[slow] = nums[fast];
        }
        for(int i = 0; i<slow+1; i++) {
        	System.out.println(nums[i]);
        }
    }

}
