package streamAPICodes;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Non_Repeating_Char_in_String {

	public static void main(String[] args) {

		String str = "EclipseWorkspace";

		// Youtube Reference
		String key = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(s -> s, LinkedHashMap::new, Collectors.counting())).entrySet().stream()
				.filter(s -> s.getValue() == 1).findFirst().get().getKey();

		System.out.println(key);

		// Internet Reference by converting into lowercase
		Character key2 = str.chars().mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s)))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(s -> s.getValue() == 1).findFirst().get().getKey();

		System.out.println(key2);

	}

}
