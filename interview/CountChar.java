package interview;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "BALAJI";
		
		Map<Character, Long> charList = name.chars().mapToObj(s -> Character.valueOf((char)s))
		.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new ,Collectors.counting()));
		
		System.out.println(charList);
		
	}

}
