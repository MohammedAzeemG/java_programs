package MethodTasks;

import java.util.Scanner;

public class Calcmethod {
	public float addNum(float x,float y) {
		float add=x+y;
		return add;
	}
	public float subNum(float x,float y) {
		float add=x-y;
		return add;
	}
	public float mulNum(float x,float y) {
		float add=x*y;
		return add;
	}
	public float divNum(float x,float y) {
		float add=x/y;
		return add;
	}

	public static void main(String[] args) {
		
		float x,y,outcome=0;
		Calcmethod ct=new Calcmethod();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how you want to calculate");
		System.out.println("For Addition press(1)");
		System.out.println("For Subtraction press(2)");
		System.out.println("For Multiplication press(3)");
		System.out.println("For Division press(4)");
		int select=sc.nextInt();
		System.out.println("Enter the first value");
		x=sc.nextFloat();
		System.out.println("Enter the Second value");
		y=sc.nextFloat();
		if(select==1) {
			outcome=ct.addNum(x,y);
		}
		else if(select==2) {
			outcome=ct.subNum(x,y);
		}
		else if(select==3) {
			outcome=ct.mulNum(x,y);
		}
		else if(select==4) {
			outcome=ct.divNum(x,y);
		}
		else {
			System.out.println("Invalid Number");
		}
		System.out.println("Result is : "+outcome);
	}

}
