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
public class Concatenate_Strings_in_List {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<String> stringList = Arrays.asList("abc","def","ghi");
		
		String combinedString = stringList.stream()
				.filter(s->!s.startsWith("a"))
				.reduce((a,b)->a+b).get();
		System.out.println(combinedString);
	}

}
