
public class Throwskeyword {
	int i;
	
	public void m1()throws ArithmeticException {
		m2();
		
	}
	public void m2()throws ArithmeticException {
		m3();
	}
	
	public void m3() throws ArithmeticException{
	 i =9/0;
	}

	public static void main(String[] args) {
		Throwskeyword obj = new Throwskeyword();
		try {
		obj.m1();
		// TODO Auto-generated method stub
		}
		catch(ArithmeticException e) {
			System.out.println("Exception found");
			e.printStackTrace();
		}

	}

}
