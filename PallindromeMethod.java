package MethodTasks;

import java.util.Scanner;

public class PallindromeMethod {
	
	public int Palindrom(int x) {
		int r=0,s=0;
		 while(x>0){
			 r=x%10;
			 s=s+r;
			 if(x>9){
			     s=s*10;
			}
	        x/=10; 
		 }
		 return(s);
		 
	}	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		PallindromeMethod pm=new PallindromeMethod();
		System.out.println("Enter a number");
		int x=sc.nextInt();
		int res=pm.Palindrom(x);
		if(res==x) {
			System.out.println("The given Number is a Pallindrome");
			System.out.println("The Number After reverse is "+res);
			
		}
		else {
			System.out.println("The given Number is not a Pallindrome");
			System.out.println("The Number After reverse is "+res);
		}
		
	}

}
