/**
 * 
 */
package streamAPICodes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author Sujan5
 *
 */
public class Count_of_Students_in_Dept {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Student> studentList = new ArrayList<>();
		
		IntStream.range(1, 5).forEach(s->studentList.add(new Student(s,s+"Student", "IT")));
		IntStream.range(5, 10).forEach(s->studentList.add(new Student(s,"Student"+s, "CSE")));
		IntStream.range(10, 15).forEach(s->studentList.add(new Student(s,s+"Student", "ECE")));
		
		studentList.stream().collect(Collectors.groupingBy(Student::getDeptName,Collectors.counting()))
			.entrySet().forEach(e->System.out.println(e.getKey() + " " + e.getValue()));
		
	}

}

class Student {
	
	private int id;
	private String name;
	private String deptName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public Student(int id, String name, String deptName) {
		super();
		this.id = id;
		this.name = name;
		this.deptName = deptName;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", deptName=" + deptName + "]";
	}
	
}
