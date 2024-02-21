/**
 * 
 */
package interviewCoding;

import java.util.Comparator;

/**
 * @author Sujan5
 *
 */
public class StudentComparator implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		if(s1.getScore()>s2.getScore()) {
			return -1;
		}
		else if(s1.getScore()<s2.getScore()) {
			return 1;
		}
		else {
			if(s1.getAge()>s2.getAge()) {
				return 1;
			}
			else if(s1.getAge()<s2.getAge()) {
				return -1;
			}
			else {
				return 0;
			}
		}
	}

}
