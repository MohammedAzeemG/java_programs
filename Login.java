package oopsTasks;

public class Login {

	public static void main(String[] args) {
		person per=new person();
		per.setUser("azem@35","meeza@35");
		System.out.println("UserName :"+per.getUser());

	}

}
class person{
	private String user,pass;
	public void setUser(String u,String p) {
		user=u;
		pass=p;
	}
	public String getUser() {
		return user;
	}
}