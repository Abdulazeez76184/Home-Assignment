package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingElement {

	public static void main(String[] args) {
		int[] age= {1,2,3,4,10,6,8};
		Arrays.sort(age);
		List<String> myList = new ArrayList<>();
		  myList.add("1");
	      myList.add("2");
	      myList.add("3");
	      myList.add("4");
	      myList.add("6");
	      myList.add("8");
	      myList.add("10");
		 for(int i = 0; i < age.length; i++) 	
		 {
			if(age[i]!=i+1) 
					{
			System.out.println("Missing :" + (i+1));
					}
		 }
					
					}
					
}
		 
