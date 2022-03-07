
public class FinallyBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		try {
			i=9/3;
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
			
		}
		
		finally {
			System.out.println("Print finally block");
		}

	}

}
