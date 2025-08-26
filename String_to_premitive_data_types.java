package Tasks;
import java.util.Scanner;

public class String_to_premitive_data_types {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter a numeric value");
		String s=scan.nextLine();
		int IntegerValue=Integer.parseInt(s);
		float FloatValue=IntegerValue;
		double DoubleValue=IntegerValue;
		long LongValue=IntegerValue;
		
		System.out.println("Integer Value = "+IntegerValue);
		System.out.println("Float Value = "+FloatValue);
		System.out.println("Double Value = "+DoubleValue);
		System.out.println("Long Value = "+LongValue);
		
		scan.close();
	}


}
