import java.util.Scanner;

public class userinput {

	public static void main(String[] args) {
		//create scanner object
		Scanner input = new Scanner(System.in);
		
		//output prompt
		//System.out.println("Enter an line of text: ");
		System.out.println("Enter an integer: ");
		
		//wait for the user to enter line
		//String line = input.nextLine();
		int value = input.nextInt();
		
		//tell them what they enetered
		System.out.println("You entered: " + value);
		
		
	
		
	}

}
