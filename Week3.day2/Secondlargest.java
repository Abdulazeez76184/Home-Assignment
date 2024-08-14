package week3.day2;

	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.List;


	public class Secondlargest {

		public static void main(String[] args) {
			int[] a= {3,2,11,4,6,7};
	List<Integer> myList = new ArrayList<Integer>();
	for (int i = 0; i < a.length; i++) {
		
		myList.add(a[i]);
		
	}
	Collections.sort(myList);
	
	int size = myList.size();
	
	System.out.println("Total List Size: "+size);
	
	System.out.println("Second Largest Number in List: "+myList.get(size-2));
			
				

	}
	}
	