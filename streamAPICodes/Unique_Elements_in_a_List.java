/**
 * 
 */
package streamAPICodes;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author Sujan5
 *
 */
public class Unique_Elements_in_a_List {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Integer> list = new LinkedList<>();
		IntStream.range(1, 5).forEach(a->list.add(a));
		IntStream.range(1, 4).forEach(a->list.add(a));
		System.out.println(list);
		list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
			.entrySet().stream().filter(e->e.getValue()==1).forEach(e->System.out.println(e.getKey()));
//		System.out.println(list.stream().collect(Collectors.groupingBy(Function.identity())));
	}

}
