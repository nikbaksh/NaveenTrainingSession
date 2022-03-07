
public class Student {
	
	public int getStudenMarks(String studentName) {
		int marks=-1;
		
		if(studentName.equals("nikki")) {
			marks=90;
		}
		else if(studentName.equals("Naveen")) {
			marks=100;
		}
		else {
		System.out.println("Please pass correct student Name");
		}
		return marks;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st= new Student();
		int m = st.getStudenMarks("nikki");
		System.out.println(m+5-3);
		m = st.getStudenMarks("n");
		System.out.println(m);
		if(m==-1) {
			System.out.println("Dont generate marksheet");
		}
			
		

	}

}
