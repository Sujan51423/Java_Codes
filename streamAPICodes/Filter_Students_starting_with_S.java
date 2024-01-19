/**
 * 
 */
package streamAPICodes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * @author Sujan5
 *
 */
public class Filter_Students_starting_with_S {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Student> studentList = new ArrayList<>();
		
		IntStream.range(1, 5).forEach(s->studentList.add(new Student(s,s+"Student", "IT")));
		IntStream.range(5, 10).forEach(s->studentList.add(new Student(s,"Student"+s, "CSE")));
		IntStream.range(10, 15).forEach(s->studentList.add(new Student(s,s+"Student", "ECE")));
		
		studentList.stream().filter(s->s.getName().startsWith("S")).forEach(System.out::println);
		
	}

}
