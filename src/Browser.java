
public class Browser {
	
	
//using else if
	
	public boolean launchBrowser(String name) {
		if(name.equals("chrome")) {
			return true;
			
		}
		else if(name.equals("ssfari")) {
			return true;
		}
		
		else {
			return false;
		}
		
	}
	
	//Using switch statement
	

	public boolean openBrowser(String brName) {
		
		switch(brName.toLowerCase()) {
		case"chrome":
			return true;
		case "firefox":
			return true;
		case "opera":
			return true;
			
			default:
				return false;
				
		
		}
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Browser br= new Browser();
	boolean flag=	br.openBrowser("firefox");
	System.out.println(flag);
		
		
//	boolean result =	br.launchBrowser("chrome");
//	if(result==true) {
//		System.out.println("Pass");
//	}
//	else {
//		System.out.println("Fail");
//	}
		

	}

}
