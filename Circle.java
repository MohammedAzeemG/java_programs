package oopsTasks;

public class Circle {

	double circum=0,area=0,r=0;
	
	public void setArea(double radius){
		r=radius;
		area=3.14*r*r;
	}
	public double getArea(){
		return area;
	}
	public void setCircum(double radius){
		r=radius;
		circum=2*3.14*r;
	}
	public double getCircum(){
		return circum;
	}

	public static void main(String[] args) {
		Circle crl=new Circle();
		crl.setCircum(15);
		System.out.println("The circum is "+crl.getCircum());
		crl.setArea(15);
		System.out.println("The Area is "+crl.getArea());
		
	}

}
