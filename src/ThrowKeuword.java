
public class ThrowKeuword {
	public static void getData() {
	String data = null;
	if(data==null) {
		System.out.println("Data is bot found");
		try {
		throw new Exception("data not present exception");
	}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getData();

	}

}
