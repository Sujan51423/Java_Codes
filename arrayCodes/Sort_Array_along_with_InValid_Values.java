/**
 * 
 */
package arrayCodes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Sujan5
 *
 */
public class Sort_Array_along_with_InValid_Values {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(2,-1,5,1,-1,3,6,-1);
		list = sortedArray(list);
		System.out.println(list);
	}

	private static List<Integer> sortedArray(List<Integer> list) {
		
		List<Integer> newList = new ArrayList<>();
		for(int i=0;i<list.size();i++) {
			if(list.contains(i)) {
				newList.add(i, i);
			}
			else {
				newList.add(-1);
			}
		}
		return newList;
	}

}
