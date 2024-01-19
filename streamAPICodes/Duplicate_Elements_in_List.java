package streamAPICodes;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Duplicate_Elements_in_List {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(10,15,23,45,56,10,25,23,56);
		Set<Integer> set = new HashSet<Integer>();
		List<Integer> collect = nums.stream().filter(n -> !set.add(n)).collect(Collectors.toList());
		
		System.out.println(collect);
		
		nums.stream().sorted().forEach(System.out::println);
	}

}
