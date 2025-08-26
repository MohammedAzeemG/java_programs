package Tasks;

import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
		int num,res = 1;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		if(num<=1) {
			System.out.println("it is a Prime Number");
		}
		else if(num==2 || num==3 || num==5 || num==7 || num==11) {
			System.out.println("it is a Prime Number");
		}
		else if(num % 3==0) {
			System.out.println("it is Not a Prime Number");
		}
		else if(num % 5==0) {
			System.out.println("it is Not a Prime Number");
		}
		else if(num % 7==0) {
			System.out.println("it is Not a Prime Number");
		}
		else if(num % 11==0) {
			System.out.println("it is Not a Prime Number");
		}
		
	}

}
