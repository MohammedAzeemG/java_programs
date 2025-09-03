package oopsTasks;

interface detail{
	String getDetails();
}
class Jfs implements detail {
	private int id;
	private String name;
	public Jfs(int id,String name) {
		this.id=id;
		this.name=name;
	}
	public String getDetails() {
		return id+name;
	}
	
}
class Dfs implements detail {
	private int id;
	private String name;
	public Dfs(int id,String name) {
		this.id=id;
		this.name=name;
	}
	public String getDetails() {
		return id+name;
	}
	
}
class Pfs implements detail {
	private int id;
	private String name;
	public Pfs(int id,String name) {
		this.id=id;
		this.name=name;
	}
	public String getDetails() {
		return id+name;
	}
	
}
public class MultiInheritEx {

	public static void main(String[] args) {
		detail jfs=new Jfs(1," Alice");
		detail dfs=new Dfs(2," John snow");
		detail pfs=new Pfs(3," Stark");
		System.out.println("Student of JFS :"+jfs.getDetails());
		System.out.println("Student of DFS :"+dfs.getDetails());
		System.out.println("Student of PFS :"+pfs.getDetails());
		

	}

}
