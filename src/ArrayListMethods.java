import java.util.ArrayList;
import java.util.Collections;

public class ArrayListMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> emplist = new ArrayList<String>();
		emplist.add("Zom");
		emplist.add("Yikki");
		emplist.add("Biran");
		
		Collections.sort(emplist);
//		Collections.sort(emplist,Collections.reverseOrder());
		System.out.println(emplist);
		
		ArrayList<String> al= new ArrayList<String>();
		al.add("nikki");
		al.add("bikki");
		al.add("cikki");
		
		for(int i=al.size()-1;i>=0;i--) {
			System.out.println(al.get(i));
		}
		
		System.out.println();
		
		
		
		
		
		
		

	}

}
