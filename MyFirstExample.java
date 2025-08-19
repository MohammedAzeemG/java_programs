package intro.dev;

import java.util.Scanner;

public class MyFirstExample {
	
	public static void main(String[] azeem) {
		// TODO Auto-generated method stub
		float x,y;
		Scanner obj =new Scanner(System.in);
		System.out.println("Enter the first number(x)");
		x=obj.nextInt();
		System.out.println("Enter the secound number(y)");
		y=obj.nextInt();
		
		System.out.println(x>y);
		System.out.println(x<y);
		System.out.println(x>=y);
		System.out.println(x<=y);
		System.out.println(x==y);
		System.out.println(x!=y);
		
		
	}

}
