package BuilderPattern;

public class EcomApp {
	private int orderID;
	public EcomApp login(String un,String pwd) {
		System.out.println("Login with"+un+" "+pwd);
		return this;
	
	}
	
	public EcomApp login() {
		System.out.println("Login as guest user");
		return this;
	}

	public EcomApp search(String productName) {
		System.out.println("Search with product name");
		return this;
	}
	
	public void search(String productName,int price) {
		System.out.println("Search with product price");
	}
	
	public EcomApp clickonProduct(String productName) {
		System.out.println("select a product");
		return this;
		
	}
	
	public EcomApp addToCart(String productName) {
		System.out.println("Add to cart");
		return this;
	}
	public EcomApp doPayment(String cc,int cvv) {
		System.out.println("Do payment");
		return this;
	}
	
	public EcomApp logout() {
		System.out.println("Logout for user");
		return this;
	}
	public EcomApp generateOrderID(){
		this.orderID=12345;
		return this;
		
		
	}
	public int getOrderID() {
		return this.orderID;
	}
}
