package MethodTasks;

import java.util.Scanner;

public class divby12method {
	public int div12(int num) {
		if(num%12==0) {
			System.out.println("Yes "+num+" is divisible by 12");
		}
		else {
			System.out.println("No "+num+" is not divisible by 12");
		}
		return num;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		divby12method dm=new divby12method();
		int num=sc.nextInt();
		int res=dm.div12(num);
		
	}

}
