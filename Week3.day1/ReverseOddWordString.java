package week3.day1;

public class ReverseOddWordString {
	public static void main(String[] args) {
		
			String name = "I am a software tester";
			String[] split = name.split(" ");
			for (int i = 0; i <= split.length-1; i++) { 
				if(i%2!=0) {
					char[] charArray = split[i].toCharArray();
					for (int j=charArray.length-1; j>=0; j--) {
					System.out.print(charArray[j]);
					}
					System.out.print(" ");
				}else if(i%2==0) {
					System.out.print(split[i] +" ");
}
}
}
}