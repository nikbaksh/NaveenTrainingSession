package ConstructorConcept;

public class Employee {

	String name;
	int age;
	String empID;
	String dept;
	
	public Employee() {
		System.out.println("Default Constructor");
	}
	
	public Employee(int i) {
		System.out.println("integer arg constructor"+i);
	}
	
	public Employee(int i,String j) {
		System.out.println("Both int and string:"+i+j);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e= new Employee();
		Employee e1= new Employee(10);
		Employee e2= new Employee(10,"nikki");
		
		
	

	}

}
