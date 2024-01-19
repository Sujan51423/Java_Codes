/**
 * 
 */
package streamAPICodes;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Sujan5
 *
 */
public class Sorting_a_List {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(10,15,23,45,56,10,25,23,56);
		
		System.out.println("Normal Sort:");
		nums.stream().sorted().forEach(t -> System.out.println(t));
		
		System.out.println("Reverse Sort:");
		nums.stream().sorted(Comparator.reverseOrder()).forEach(t -> System.out.println(t));
		
		System.out.println("Reverse Sort & Collect list:");
		List<Integer> collect = nums.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(collect);
	}

}
