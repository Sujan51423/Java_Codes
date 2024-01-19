package streamAPICodes;

import java.util.Arrays;

public class Largest_String_in_Array {

	public static void main(String[] args) {
		
		String[] strArray = {"a", "bb", "ccc", "dddd", "eee"};
		
		String largestString = Arrays.stream(strArray)
		.reduce((w1,w2) -> w1.length()>w2.length() ? w1 : w2).get();
		System.out.println(largestString);
	}

}
