import java.util.Scanner;

public class fourthPro {
		// Initialize two character variables in a program and display the characters in alphabetical order
//		Scanner s=new Scanner(System.in);
//		char char1=s.next().charAt(0);
//		char char2=s.next().charAt(0);
//		if(char1>char2)
//		{
//		System.out.println(char2+","+char1);
//		}
//		else 
//		{
//			System.out.println(char1+","+char2);
//		}
//}				


		
		//
	public static void main(String[] args) {
		System.out.print("Enter any value");
		Scanner s=new Scanner(System.in);
		char c=s.next().charAt(0);
		int i;
		
		if(c>='a'&&c<='z') {
		System.out.println(c+"->");
		i=(int)c;
		c=(char)(i-32);
		System.out.println(c);
		}
		
		else {
			System.out.print(c+"->");
		    i=(int)c;
			c=(char)(i+32);
			System.out.println(c);
		}
	}
}

