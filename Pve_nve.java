package Tasks;

import java.util.Scanner;

public class Pve_nve {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number that you want to check positive or negative");
		int num=scan.nextInt();
		
		if(num>0) {
			System.out.println("The given number is a positive number");
		}
		if(num<0) {
			System.out.println("The given number is a negative number");
		}
		if(num==0) {
			System.out.println("The given number is a Zero");
		}
		scan.close();
	}

}
