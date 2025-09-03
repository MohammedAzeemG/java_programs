package oopsTasks;

public class Employee {
	String empName;
	int salary;
	
	void display() {
		System.out.println("Employee Name :"+empName);
		System.out.println("Employee Salary :"+salary);
	}
	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.empName="Azeem";
		emp.salary=200000;
		emp.display();

	}

}
