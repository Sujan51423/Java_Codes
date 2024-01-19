package streamAPICodes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Numbers_Starts_with_1 {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(10, 15, 23, 45, 56, 15);

		nums.stream().map(n -> n + "").filter(s -> s.startsWith("1")).collect(Collectors.toList())
				.forEach(System.out::println);
	}

}
