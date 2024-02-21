/**
 * 
 */
package arrayCodes;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author Sujan5
 *
 */
public class Minimum_Swaps_to_Sort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int arr[] = {1,2,4,3,5};
		int swaps = CountSwaps(arr);
		
		System.out.println(swaps);
	}

	private static int CountSwaps(int[] arr) {
		
		int swaps=0;
		Map<Integer,Integer> indexMap = new TreeMap<>();
		
		for(int i=0; i<arr.length; i++) {
			indexMap.put(arr[i], i);
		}
		ArrayList<Integer> values = new ArrayList<>(indexMap.values());
		
		for(int i = 0; i<arr.length; i++) {
			if(values.get(i) == i) {
				continue;
			}
			else {
				swaps++;
			}
		}
		
		return swaps/2;
	}

}
