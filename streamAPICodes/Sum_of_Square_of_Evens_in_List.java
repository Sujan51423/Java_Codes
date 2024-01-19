/**
 * 
 */
package streamAPICodes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * @author Sujan5
 *
 */
public class Sum_of_Square_of_Evens_in_List {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		IntStream.range(1, 5).forEach(a->list.add(a));
		
		System.out.println(list);
		
		Integer sumVariable = list.stream().filter(n->n%2==0).map(n->n*n).reduce(0,(a,b)->a+b);
		System.out.println(sumVariable);
	}

}
