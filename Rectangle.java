package oopsTasks;

public class Rectangle {
	private int length,width,area;
	void setArea(int l,int w) {
		length=l;
		width=w;
		if (l>0 && w>0) {
			if (l!=w) {
				area=length*width;
			}
		}
	}
	int getArea() {
		return area;
	}

	public static void main(String[] args) {
		Rectangle rt=new Rectangle();
		rt.setArea(10, 20);
		System.out.println("Area of Rectangle is "+rt.getArea());
	}

}
