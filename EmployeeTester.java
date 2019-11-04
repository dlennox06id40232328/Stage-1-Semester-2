package part01;

import java.util.ArrayList;

public class EmployeeTester {

	public static void main(String[] args) {
		Employee emp1 = new Employee("Amy", "Smyth", Department.SPA_WELLBEING, "massage");
		Employee emp2 = new Employee("Patrick", "Stewart", Department.SPA_WELLBEING, "pool cleaning");
		Employee emp3 = new Employee("John", "Fraser", Department.CATERING, "cooking");
		Employee emp4 = new Employee("Sheila", "Williams", Department.HOSPITALITY, "check in");
		Employee emp5 = new Employee("Jim", "Hopkins", Department.HOUSEKEEPING, "cleaning");

		
		ArrayList<Employee> allEmployees = new ArrayList<Employee>();
		allEmployees.add(emp1);
		allEmployees.add(emp2);
		allEmployees.add(emp3);
		allEmployees.add(emp4);
		allEmployees.add(emp5);
		
		printEmployees(allEmployees);
		System.out.println("The number of employeesin the Spa and Wellbeing team is "
				+teamSize(allEmployees, Department.SPA_WELLBEING));
		System.out.println("The number of employees in the hotel is "
				+ teamSize(allEmployees));
	}
	
	public static void printEmployees(ArrayList<Employee> allEmployees) {
		for(Employee e : allEmployees) {
			System.out.println(e.getDetails());
			System.out.println("Department: " +e.getDept());
			e.conductTask();
			System.out.println();
		}
	}
	
	public static int teamSize(ArrayList<Employee> allEmployees, Department dept) {
		int count = 0;
		for(Employee e : allEmployees) {
			if(e.getDept() == dept) {
				count++;
			}
		}
		return count;
	}

	public static int teamSize(ArrayList<Employee> allEmployees) {
		int count = 0;
		for(Employee e : allEmployees) {
				count++;
		}
		return count;
	}
} // End of class
