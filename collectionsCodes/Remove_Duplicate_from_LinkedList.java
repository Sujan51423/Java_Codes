/**
 * 
 */
package collectionsCodes;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;


/**
 * @author Sujan5
 *
 */
public class Remove_Duplicate_from_LinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Integer> list = new LinkedList<>();
		IntStream.range(1, 5).forEach(a->list.add(a));
		IntStream.range(1, 4).forEach(a->list.add(a));

		System.out.println(list);
		
		for(int i=0; i<list.size();i++) {
			for(int j=i+1; j<list.size();j++) {
				if(list.get(i).equals(list.get(j))) {
					list.remove(j);
					j--;
				}
			}
		}
		
		System.out.println(list);
		
	}

}
