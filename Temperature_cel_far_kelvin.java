package Tasks;
import java.util.Scanner;

public class Temperature_cel_far_kelvin {

	public static void main(String[] args) {
		
		double c,f=0,k=0;
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the Temperature option");
		System.out.println("1-Celsius");
		System.out.println("2-Fahrenheit");
		System.out.println("3-Kelvin");
		int temp=scan.nextInt();
		if(temp==1) {
			
			System.out.println("Enter the Temperature in Celcius");
		
			c=scan.nextDouble();
			f=(c*9/5)+32;
			k=c+273.15;
			
			System.out.println("---celsius to Fharenheit and Kelvin---");
			System.out.println("");
			System.out.println("The value in Fahrenheit = "+f+"F");
			System.out.println("The value in Kelvin = "+k+"K");
		}
		else if(temp==2) {
			System.out.println("Enter the Temperature in Fahrenheit");
			
			f=scan.nextDouble();
			c=(f-32)*5/9;
			k=(f-32)*5/9+273.15;
			
			System.out.println("---Fahrenheit to Celsius and Kelvin---");
			System.out.println("");
			System.out.println("The value in Celcius = "+c+"C");
			System.out.println("The value in Kelvin = "+k+"K");
			
		}
		else if(temp==3) {
			System.out.println("Enter the Temperature in Kelvin");
			
			k=scan.nextDouble();
			c=k-273.15;
			f=(k-273.15)*9/5+32;
			
			System.out.println("---Kelvin to Celsius and Fharenheit---");
			System.out.println("");
			System.out.println("The value in Celcius = "+c+"C");
			System.out.println("The value in Fahrenheit = "+f+"F");
		}
	}

}
