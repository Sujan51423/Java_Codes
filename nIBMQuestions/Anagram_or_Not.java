/**
 * 
 */
package nIBMQuestions;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Sujan5
 *
 */
public class Anagram_or_Not {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String firstString = "hello";
		String secondString = "lohe";
		
		String anagramCheck = (Stream.of(firstString.split("")).sorted().collect(Collectors.joining())
			.equals(Stream.of(secondString.split("")).sorted().collect(Collectors.joining())))
				? "Anagram" 
						: "Not an Anagram";
		System.out.println(anagramCheck);
	}

}
