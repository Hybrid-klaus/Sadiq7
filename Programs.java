import java.util.Scanner;

public class Programs 
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		char c=s.next().charAt(0); //charAt(0) function returns the first character in that string
		if((c>='a'&&c<='z') || (c>='A'&&c<='Z')) 
		{
		System.out.println("Alphabet");
		}
		else if(c>='0'&&c<='9')
		{
		System.out.println("Digit");
		}
		else 
		{
		System.out.println("Special Symbol");
	    }
	}
}
