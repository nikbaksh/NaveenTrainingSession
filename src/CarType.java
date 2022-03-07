
public class CarType {
	
	
	
	String name;
	int price;
	String color;
	static int wheels = 4;
	
	public static void start() {
		System.out.println("start");
	}
	
	public void stop() {
		System.out.println("stop");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		CarType c1= new CarType();
		CarType.wheels=5;
		System.out.println(CarType.wheels);
		CarType c = new CarType();
		c.name="BMW";
		c.price=1000;
		System.out.println(c.name+" "+c.price+" "+CarType.wheels);
		
		
		

	}

}
