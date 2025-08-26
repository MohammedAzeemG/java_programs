package Tasks;

import java.util.Scanner;

public class Pvenve {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number that you want to check positive or negative");
		int num=scan.nextInt();
	
		if(num>0){
			System.out.println("The given number is a positive number");
		}
		else if (num==0) {
			System.out.println("The given number is Zero");
		}
		else{
			System.out.println("The given number is a negative number");
		}
		scan.close();
	}

}
