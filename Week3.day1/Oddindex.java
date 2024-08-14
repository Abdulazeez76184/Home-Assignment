package week3.day1;

public class Oddindex {

	public static void main(String[] args) {
		String text="changeme";
		char[] charArray1 = text.toCharArray();
		
		for (int i = 0; i < charArray1.length; i++) {
			
			if (i%2==1) {
				
				char upperCase = Character.toUpperCase(charArray1[i]);
				
				System.out.print(upperCase);
				
			}
			
			else {
				
				System.out.print(" "+charArray1[i]+" ");
			}
			
		}

		
	}

}
