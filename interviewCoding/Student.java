/**
 * 
 */
package interviewCoding;

/**
 * @author Sujan5
 *
 */
public class Student {
	
	private String student_name;
	private int age;
	private int score;
	
	
	public Student(String student_name, int age, int score) {
		super();
		this.student_name = student_name;
		this.age = age;
		this.score = score;
	}
	
	
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}


	@Override
	public String toString() {
		return "Student [student_name=" + student_name + ", age=" + age + ", score=" + score + "]";
	}
	
	
}
