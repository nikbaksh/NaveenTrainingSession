import java.util.ArrayList;
import java.util.Arrays;

public class Company {
	
	
	public Object[] getCompanyInfo(String cmpName) {
		Object[] info = new Object[5];
		if(cmpName.equals("IBM")) {
			info[0]="IBM";
			info[1]=1000;
			info[2]=5.5;
			info[3]="Bangalore";
			info[4]="Tom";
		}
		
		else if(cmpName.equals("Microsoft")) {
			info[0]="Microsoft";
			info[1]=2000;
			info[2]=5.5;
			info[3]="Bangalore";
			info[4]="Tome";
			
		}
		else {
			System.out.println("comp name is not found");
		}
		return info;
		
		
	}
	
	//using switch case
	public ArrayList<String> getProductList(String compName){
		
	
	ArrayList<String> al= new ArrayList<String>();
	switch(compName) {
	case"amazon":
		al.add("amazon");
		al.add("Macbook");
		al.add("Samsung");
		break;
		
	case"walmart":
		al.add("walmart");
		al.add("mc");
		al.add("jm");
		break;
		
	default:
		System.out.println("Please give correct company name");
		break;
		
	}
	return al;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company cmp= new Company();
ArrayList<String> mn=	cmp.getProductList("walmart");
//	Object mp[]=	cmp.getCompanyInfo("IBM");
//	System.out.println(Arrays.toString(mp));
//	for(int i=0; i<mp.length;i++) {
//		System.out.println(mp[i]);
//	}
	
	//using for each loop
//	for(Object a : mp) {
//		System.out.println(a);

		
//		
//	}

System.out.println(mn);

	}

}
