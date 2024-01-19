/**
 * 
 */
package streamAPICodes;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Sujan5
 *
 */
public class Occurence_of_words_in_Sentence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String sentence = "the dog barks at the dog";
		
		Stream.of(sentence.split(" ")).map(s->s.trim())
			.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
			.entrySet().forEach(e->System.out.println(e.getKey() + " " + e.getValue()));
		
	}

}
