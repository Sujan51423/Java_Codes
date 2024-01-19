/**
 * 
 */
package streamAPICodes;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author Sujan5
 *
 */
public class Frequency_of_element_in_List {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(5,4,3,3,3,2,1,1,5,4,6,7,2);
		
		list.stream()
			.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
			.entrySet().forEach(e -> System.out.println(e.getKey() +" "+e.getValue()));
		
		//countMap.entrySet().stream().forEach(e -> System.out.println(e.getKey() +" "+e.getValue()));
	}

}
