package oopsTasks;

public class calc {
	float add,sub,mul,div;
	public void add(int a,int b) {
		add=a+b;
	}
	public float getadd() {
		return add;
	}
	public void sub(int a,int b) {
		sub=a-b;
	}
	public float getsub() {
		return sub;
	}
	public void mul(int a,int b) {
		mul=a*b;
	}
	public float getmul() {
		return mul;
	}
	public void div(int a,int b) {
		div=a/b;
	}
	public float getdiv() {
		return div;
	}
	public static void main(String[] args) {
		calc c=new calc();
		c.div(10,20);
		System.out.println(c.getdiv());
	}

}
