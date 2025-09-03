package oopsTasks;

public class Car {
	private String Brand,Model;
	private int Year;
	public void setDetails(String b,String m,int y) {
		Brand=b;
		Model=m;
		if(y<=2025 && y>1900) {
			Year=y;
		}
	}
	public void getDetail() {
		System.out.println("Brand :"+Brand+" Model :"+Model+" Year :"+Year);
	}
	public static void main(String[] args) {
		Car c=new Car();
		c.setDetails("TATA", "Altroz", 2025);
		c.getDetail();
	}

}
