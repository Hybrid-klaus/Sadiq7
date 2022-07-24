import java.util.Scanner;

public class firstPro {

	public static void main(String[] args) {
		//Write a program to check if a given integer number is odd or even.
	   // int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number");
        int n = s.nextInt();
        if(n % 2 == 0)
        {
            System.out.println("Even ");
        }
        else
        {
            System.out.println(" Odd ");
	    }

	}

}
