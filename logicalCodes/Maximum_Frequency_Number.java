/**
 * 
 */
package logicalCodes;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author Sujan5
 *
 */
public class Maximum_Frequency_Number {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Integer> arr = Arrays.asList(1, 2, 3, 1, 2);
		
		Integer key = arr.stream().collect(Collectors
				.groupingBy(Function.identity(),Collectors.counting()))
				.entrySet().stream().findFirst().get().getKey();
		
		System.out.println(key);
	}

}
