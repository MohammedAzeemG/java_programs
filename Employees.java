package oopsTasks;

public class Employees {
	private String name;
	private int salary;
	void setName(String n) {
		name=n;
	}
	void setSalary(int s) {
		salary=s;
	}
	String getName() {
		return name;
	}
	int getSalary() {
		return salary;
	}
	public static void main(String[] args) {
		Employees emp=new Employees();
		emp.setName("Azeem");
		emp.setSalary(150000);
		System.out.println("name is "+emp.getName()+" and Salary is "+emp.getSalary());
	}

}
