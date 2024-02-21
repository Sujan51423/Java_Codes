package streamAPICodes;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Get_Key_of_Map {

	public static void main(String[] args) {
		
		Map<Integer, String> valueMap = new HashMap<>();
		valueMap.put(1, "One");
		valueMap.put(2, "Two");
		valueMap.put(3, "Three");
		
		Stream<Integer> map = valueMap.entrySet().stream().filter(m->m.getValue().equals("Two"))
				.map(Map.Entry::getKey);
		System.out.println(map);
	}

}
