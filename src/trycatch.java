
public class trycatch {
	String name;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		trycatch obj = new trycatch();
		obj = null;
		try {
		obj.name="nikki";
		
		}catch(NullPointerException e) {
			System.out.println("NPE is coming");
			e.printStackTrace();
			
		}
		
		try {
			int i=9/0;
			int ar[] = new int[4];
			ar[8]=20;
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception is coming");
			e.printStackTrace();
			
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("AIOB is coming");
			e.printStackTrace();
		}
		
		
		

	}

}
