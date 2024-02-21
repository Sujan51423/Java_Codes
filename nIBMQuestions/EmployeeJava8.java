package nIBMQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeJava8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//list of 1000 employees
		// 4 depts each has 250 employees
		
		List<Employee> employeeList = new ArrayList<Employee>();
		
//		Employee user1 = new Employee(1, "A", 2000, "IT"); 
//		employeeList.add(user1);
//		Employee user2 = new Employee(2, "B", 2000, "CSE"); 
//		employeeList.add(user2);
//		Employee user3 = new Employee(3, "C", 2000, "IT"); 
//		employeeList.add(user3);
//		Employee user4 = new Employee(4, "D", 2000, "EEE"); 
//		employeeList.add(user4);
		
		for(int i = 1; i<=10; i++) {
			if(i<=250) {
			Employee user1 = new Employee(i, "A"+i, (i*2300), "IT");
			employeeList.add(user1);
			}
			else if(i>250 && i<=500) {
				Employee user1 = new Employee(i, "B"+i, (i*1500), "Sales");
				employeeList.add(user1);
			}
			else {
				Employee user1 = new Employee(i, "C"+i, (i*540), "Marketing");
				employeeList.add(user1);
			}
		}
		
		Map<String, Long> map1 = employeeList.stream().
		collect(Collectors.groupingBy(Employee::getDept,Collectors.counting()));
		System.out.println(map1);
		
		Map<Integer, Integer> collect = employeeList.stream()
			.filter(e -> e.getSalary()%2300==0).collect(Collectors.toMap(Employee::getID, Employee::getSalary));
		
//		collect.entrySet().stream().forEach(e -> System.out.println(e.getKey()+":"+e.getValue()));
		collect.entrySet().stream().map(e->e.getValue()).forEach(System.out::println);
//		System.out.println(collect);
		int size = 
				employeeList.stream().filter(e-> e.getSalary()>11000)
				.collect(Collectors.toList()).size();
		System.out.println(size);
		
	}
}
	
	class Employee {
		public Employee(int iD, String name, int salary, String dept) {
			super();
			ID = iD;
			Name = name;
			Salary = salary;
			Dept = dept;
		}
		private int ID;
		private String Name;
		private int Salary;
		private String Dept;
		public int getID() {
			return ID;
		}
		public void setID(int iD) {
			ID = iD;
		}
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
		public int getSalary() {
			return Salary;
		}
		public void setSalary(int salary) {
			Salary = salary;
		}
		public String getDept() {
			return Dept;
		}
		public void setDept(String dept) {
			Dept = dept;
		}
	}

