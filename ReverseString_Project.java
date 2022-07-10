import java.util.Scanner;

public class ReverseString_Project {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String give;
		System.out.println("Enter your string=");
		give=input.nextLine();
//		int length=give.length();
//		System.out.println("Our Given String= "+give);
//	
//		String reverse="";
//		
//		for(int i =length-1;i>=0;i--) {
//			reverse=reverse + give.charAt(i);
//		}
//		input.close();

		
		StringBuilder reverse = new StringBuilder(give);
		reverse.reverse();
		System.out.println("Reverse= "+reverse);
	}

}
