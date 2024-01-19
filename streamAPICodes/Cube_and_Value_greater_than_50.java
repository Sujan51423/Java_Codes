package streamAPICodes;

import java.util.Arrays;
import java.util.List;


public class Cube_and_Value_greater_than_50 {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1,5,7,23,45,56,10,25,23,56);
		
		nums.stream().map(s -> s*s*s).sorted()
		.filter(s -> s>500)
		.forEach(System.out::println);
	}

}
