import java.util.Scanner;

public class Malefem {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		// taking input from user 
	
		System.out.println("Enter age");
		int age = sc.nextInt();
		System.out.println("Enter M/F");
		int user = sc.next().charAt(0);
		
		// checking if user is female
		if(user == 'F') {
			if((age>=1) && (age<=58))
			System.out.println("the percentage of interest is 8.2%");
		}
		else if((age >= 59) && (age <=100)) {
			System.out.println("the percentage of interest is 9.2%.");
		}
		// checking if user is male
		if(user == 'M') {
			if((age >= 1) && (age <= 58)) {
				System.out.println("the percentage of interest is 8.4%.");
			}
	
			else if((age >= 59) && (age <=100)) {
				System.out.println("the percentage of interest is 10.5%.");
		}
	}
}
}

