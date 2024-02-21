/**
 * 
 */
package arrayCodes;

import java.util.Arrays;

/**
 * @author Sujan5
 *
 */
public class Merge_Sorted_Arrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] nums1 = {1,2,3,0,0,0};
		int[] nums2 = {2,5,6};
		mergeOptimal(nums1, nums1.length - nums2.length, nums2, nums2.length);
		
	}
	
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		for(int i = 0; i<nums2.length; i++) {
            nums1[m+i] = nums2[i];
        }
        Arrays.sort(nums1);
        
        for(int k = 0; k<nums1.length; k++) {
        	System.out.println(nums1[k]);
        }
    }
	
	public static void mergeOptimal(int[] nums1, int m, int[] nums2, int n) {
		
		int i = m-1;
		int j = n-1;
		int k = nums1.length-1;
		
		while(i>=0 && j>=0) {
			if(nums1[i] > nums2[j]) {
				nums1[k] = nums1[i];
				k--;
				i--;
			}
			else {
				nums1[k] = nums2[j];
				k--;
				j--;
			}
		}
		
		while(j>=0) {
			nums1[k] = nums2[j];
			k--;
			j--;
		}
		
		for(k = 0; k<nums1.length; k++) {
        	System.out.println(nums1[k]);
        }
	}
}
