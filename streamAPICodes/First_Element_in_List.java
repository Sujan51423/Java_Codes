/**
 * 
 */
package streamAPICodes;

import java.util.Arrays;
import java.util.List;

/**
 * @author Sujan5
 *
 */
public class First_Element_in_List {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Integer> intList = Arrays.asList(1,3,4,2,5,33,4,5,66,7,9);
		
		Integer integer = intList.stream()
				.skip(4).findFirst().get();
		
		System.out.println(integer);
	}

}
