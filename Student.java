package oopsTasks;

public class Student {
	private int rollno,marks;
	private String name;
	void setDetails(int r,String n,int m) {
		rollno=r;
		name=n;
		if (m>0) {
		   marks=m;
		}
	}
	void getDetails() {
		System.out.println(" Roll no: "+rollno+"\n Name: "+name+"\n Marks: "+marks);
	}
	public static void main(String[] args) {
		Student sd=new Student();
		sd.setDetails(101,"Alice",95);
		sd.getDetails();

	}

}
