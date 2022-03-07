
public class Employee {
	String name;
	int age;
	double salary;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee();
		e1.name="Shikha";
		e1.age=25;
		e1.salary=333;
		
		Employee e2 = new Employee();
		e2.name= "nikki";
		e2.age = 30;
		e2.salary = 300;
		
		
		Employee e3 = new Employee();
		e3.name = "abhijeet";
		e3.age = 40;
		e3.salary = 400;
		
		
		System.out.println(e1.name+" "+e1.age+" "+e1.salary);
		
		e1=e2;
		
//		
//		System.out.println();
		
		
	
		

	}

}
