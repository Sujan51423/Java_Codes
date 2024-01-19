package streamAPICodes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Print_Even_Odd_in_List {

	public static void main(String[] args) {

		List<Integer> nums = new ArrayList<Integer>();
		nums.add(1);
		nums.add(2);
		nums.add(4);
		nums.add(6);
		nums.add(3);

//		List<Integer> collect = nums.stream().filter(n->n%2==0).collect(Collectors.toList());
//		System.out.println(collect);
		nums.stream().filter(n -> n % 2 != 0).collect(Collectors.toList()).forEach(System.out::println);
	}

}
