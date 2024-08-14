package week3.day1;

import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {
		String text1="stops";
		String text2="potss";
		
		if (text1.length()==text2.length()) {
			
        char[] charArray1 = text1.toCharArray();
		char[] charArray2 = text2.toCharArray();

		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		
		boolean Result = Arrays.equals(charArray1, charArray2);
		if(Result==true)
		{
			System.out.println("Strings are Anagrams");
		}
		else
		{
			System.out.println("Strings are not Anagrams");
		}	
			
	}
	}
}

