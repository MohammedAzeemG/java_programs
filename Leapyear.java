package Tasks;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Year");
		int Year=scan.nextInt();
		
		if (Year%2==0) {
			System.out.println(Year+" is a Leap Year");
		}
		else {
			System.out.println(Year+" is Not a Leap Year");
		}
		scan.close();
	}

}
