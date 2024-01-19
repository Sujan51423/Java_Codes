/**
 * 
 */
package collectionsCodes;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
		Map<Integer, Integer> countMap = new HashMap<>();
		
		for(Integer num : list) {
			if (!countMap.containsKey(num)) {
				countMap.put(num, 1);
			}
			else {
				Integer count = countMap.get(num);
				count++;
				countMap.put(num, count);
			}
		}
		
		countMap.entrySet().stream().forEach(e -> System.out.println(e.getKey() +" "+e.getValue()));
	}

}
