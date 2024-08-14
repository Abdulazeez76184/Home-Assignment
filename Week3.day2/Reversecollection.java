package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Reversecollection {
	public static void main(String[] args) {
		String[] text1={"HCL","Wipro","Aspire Systems","CTS"};
	List<String> myList = new ArrayList<>();
	  myList.add("HCL");
      myList.add("Wipro");
      myList.add("Aspire Systems");
      myList.add("CTS");
      

      Collections.sort(myList);
      for (int i =text1.length-1;i>=0;i--); 
      {
    	 Collections.reverse(myList);
  		System.out.print(myList);
      }
	}
}