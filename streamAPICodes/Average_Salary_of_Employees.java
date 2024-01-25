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
public class Average_Salary_of_Employees {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Employee> empList = new ArrayList<>();
		
		IntStream.range(1, 5).forEach(s->empList.add(new Employee("Employee"+s,s, s*500)));
//		IntStream.range(5, 10).forEach(s->empList.add(new Employee("Employee"+s,s, s*500)));
		
		double avgSalary = empList.stream().mapToInt(e->e.getSalary()).average().getAsDouble();
		System.out.println(avgSalary);
	}

}

class Employee {
	
	private String empName;
	private int empID;
	private int salary;
	public Employee(String empName, int empID, int salary) {
		super();
		this.empName = empName;
		this.empID = empID;
		this.salary = salary;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}
