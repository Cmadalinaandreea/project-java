import java.util.Scanner;

public class Loops {
	public static void main(String[] args) {

		int value = 0;
		boolean loop = value < 20;

		// while loop
		while (value < 10) {
			System.out.println("caca" + value);

			value = value + 1;
		}

		// for loop
		for (int i = 0; i < 5; i++) {
			System.out.printf("hello value of is: %d\n", i);
		}

		// if loop
		int myint = 15;
		if (myint < 10) {
			System.out.println("yes is true");
		} else if (myint > 20) {
			System.out.println("no is false");
		} else {
			System.out.println("caca");
		}

		// do while loop
		Scanner scanner = new Scanner(System.in);

		/*
		 * System.out.println("Da si tu un numar: "); 
		 * int valuee = scanner.nextInt();
		 * 
		 * while(valuee != 5){ System.out.println("enter numbir: "); valuee =
		 * scanner.nextInt(); }
		 */

		int valuee= 0;
		
		do {
			System.out.println("Da si tu un numar: "); 
			valuee = scanner.nextInt();
		}
		while(valuee != 5);
		
		System.out.println("Got 5!");

		//switch loops
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a command: ");
		String text = input.nextLine();
		
		switch(text) {
		
		case "start" : 
			System.out.println("machine started");
			break;
		case "stop" :
			System.out.println("machine stopped");
			break;
			default: 
				System.out.println("command not recognized");
		}
		
	}
}
