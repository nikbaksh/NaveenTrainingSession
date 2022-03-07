package InheritanceConcept;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BMW b1 = new BMW();
		b1.autoparking();
		b1.start();
		b1.stop();
	b1.price();
		
		Car c1 = new Car();
		c1.start();
		c1.stop();
		c1.refuel();
		c1.price();
		
		
		//Top Casting
//		
		Car c2 = new BMW();
		c2.start();//overriden
		c2.stop();
		c2.refuel();
		c2.price();//data hiding for static methods
		
		
		BMW.price();
		Car.price();
//		
//		
//		//Downcasting will give class cast exceptiona t runtime
//		BMW b2= (BMW) new Car();
//		b2.start();
//		b2.stop();
//		b2.autoparking();
//		b2.refuel();
//		
		

	}

}
