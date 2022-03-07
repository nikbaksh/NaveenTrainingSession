
public class Car {
	//instance variables
	String name;
	int price;
	String color;
	String model;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c = new Car();
		c.name="BMW";
		c.price=100;
		c.color="blue";
		c.model="mnk";
		
		System.out.println(c.name+" "+c.price+" "+c.color+" "+c.model);
		
		Car c1= new Car();
		System.out.println(c1.name+" "+c1.price+" "+c1.color+" "+c1.model);
		
		Car c2= new Car();
		c2.price=200;
		c2.color="blue";
		System.out.println(c2.name+" "+c2.price+" "+c2.color+" "+c2.model);
		
		
		
		
		

	}

}
