/**
 * 
 */
package streamAPICodes;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Sujan5
 *
 */
public class Covert_String_into_Uppercase {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String str = "EclipseWorkspace";
		
		//str.chars()
		//.mapToObj(s -> Character.toUpperCase(Character.valueOf((char) s)))
//		.map(s -> Character.toUpperCase(Character.valueOf((char)s)))
		//.forEach(System.out::println);
		
		String collectString = Stream.of(str.split(""))
//				.sorted()
//				.sorted(Collections.reverseOrder())
				.map(s->s.toUpperCase())
				.collect(Collectors.joining());
		
		System.out.println(collectString);
		
		
	}

}
