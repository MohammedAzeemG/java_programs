package Tasks;
import java.util.Scanner;

public class prime_num {

	public static void main(String[] args) {
		int num,res = 1;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		if(num<=1) {
			res=1;
		}
		if(num % 2==0 && num!=2) {
			res=0;
		}
		if(num % 3==0 && num!=3) {
			res=0;
		}
		if(num % 5==0 && num!=5) {
			res=0;
		}
		if(num % 7==0 && num!=7) {
			res=0;
		}
		if(num % 11==0 && num!=11) {
			res=0;
		}
		if(num==2 || num==3 || num==5 || num==7 || num==11) {
			res=1;
		}
		if(res==1) {
			System.out.println("it is a Prime Number");
		}
		sc.close();
	}

}
