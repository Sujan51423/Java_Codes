/**
 * 
 */
package interviewCoding;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Sujan5
 *
 */
public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<>();
		
		students.add(new Student("s1",23,900));
		students.add(new Student("s2",24,1000));
		students.add(new Student("s3",25,800));
		students.add(new Student("s4",23,800));
		students.add(new Student("s5",25,700));
		students.add(new Student("s6",26,600));
		students.add(new Student("s7",24,850));
		students.add(new Student("s8",24,1000));
		
		students.sort(new StudentComparator());
		
		Map<Integer, Integer> rankMap = new LinkedHashMap<>();
		int rank = 1;
		for(Student student: students) {
			if(!rankMap.containsKey(student.getScore()+student.getAge())) {
				
				rankMap.put(student.getScore()+student.getAge(), rank);
				rank++;
			}
			
		}
		
		for(int i = 0; i<students.size();i++) {
			System.out.print(students.get(i).getStudent_name() + " " + students.get(i).getAge() + " " + 
					students.get(i).getScore() + " " + 
					rankMap.get(students.get(i).getScore()+students.get(i).getAge()));
			System.out.println();
			
		}
	}

}
