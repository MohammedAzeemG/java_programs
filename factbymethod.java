package MethodTasks;

import java.util.Scanner;

public class factbymethod {
	public int factNum(int num) {
		int i=1,fact=1;
		while(i<=num) {
			fact=fact*i;
			i++;
		}
		return(fact);
	}
	public static void main(String[] args) {
		factbymethod fm=new factbymethod();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for finding factorial");
		int num=sc.nextInt();
		int res=fm.factNum(num);
		System.out.println(res);
		sc.close();

	}

}
