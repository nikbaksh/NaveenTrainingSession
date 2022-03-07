
public class Users {
	
	//class data member
	
	//no input and no return
	public void test() {
		System.out.println("Hello test");
	}
	
	
	//no input and some return
	public int getNumber() {
		return 100;
		
	}
	
	//some input and some return
	public String getName(String name) {
		
		return name;
	}
	
	public int sum(int a, int b) {
		int c = a+b;
		return c;
	}
	public boolean getStatus() {
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//no input and no return
		
		Users user = new Users();
		user.test();
		int num =user.getNumber();
		System.out.println(num+5);
		user.getName("nikki");
		int sum1=user.sum(2, 3);
		System.out.println(sum1+20);
		
		
		
		
		
		
		
		

	}

}
