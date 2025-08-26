package Tasks;

import java.util.Scanner;

public class odd_even {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number that you want to check Odd or Even");
		int num=scan.nextInt();
		if(num%2==0) {
			System.out.println("The given number is a Even number");
		}
		if(num%2==1) {
			System.out.println("The given number is a Odd number");
		}
		scan.close();

	}

}
