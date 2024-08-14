package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class Twostring {

	public static void main(String[] args) {
		String[] a= {"3","2","11","4","6","7"};
		String[] b= {"1","2","8","4","9","7"};
		List<String> myList = new ArrayList<String>();
		
		 for(int i = 0; i < a.length; i++) {
			 for(int j = 0; j < b.length; j++) {		
			 if (a[i] == b[j]) {
				 myList.add(a[i]);
			 }
		 }
		 }		
System.out.println(myList);
}
}