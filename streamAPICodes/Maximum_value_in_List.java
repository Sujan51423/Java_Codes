package streamAPICodes;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Maximum_value_in_List {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(10,15,23,45,56,10,25,23,56);
		
		Comparator<Integer> cmp = new MaxComparator();
		
		//Using traditional Comparator
		nums.stream().max(cmp).ifPresent(t -> System.out.println("Traditional way: " + t));
		
		//Using Lambda expression way
		nums.stream().max((a,b) -> a-b).ifPresent(t -> System.out.println("Java8 way: " + t));
		
		//Using Internet reference
		Integer integer = nums.stream().max(Integer::compare).get();
		System.out.println("Internet way: " + integer);
		
		//Using Internet reference
		int[] arr = {0,15,23,45,56,10,25,23,56};
		int max = Arrays.stream(arr).max().getAsInt();
		System.out.println("Internet way 2: " + max);
	}

}

class MaxComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		return o1 - o2;
	}
	
	
	
}
