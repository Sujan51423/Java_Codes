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
public class Longest_String_in_List {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<String> stringList = Arrays.asList("abcd","df","effghi");
		
		String longestString = stringList.stream().reduce((a,b)->a.length()>b.length()?a:b).get();
		System.out.println(longestString);
	}

}
