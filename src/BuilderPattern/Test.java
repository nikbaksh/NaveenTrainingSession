package BuilderPattern;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EcomApp e1= new EcomApp();
		e1.login().clickonProduct("Mac").addToCart("Mac").doPayment("5677", 123).logout();

	}

}
