package queue;
import java.util.Scanner;

public class QueueTester {

	public static void main(String[] args) {
		
		Queue tester = new QueueImpl(20);
		
		String name = "placeholder";
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("Enter a rider's name, or leave the name blank to quit: ");
		while (true) {
	        name = scanner.nextLine();
	        int length = name.length(); // Moved inside the loop to check the length of the new name
	        
	        if (length == 0) {
	            System.out.println("Quitting..");
	            break;
	        } else {
	            tester.enQueue(name);
	            System.out.print("Enter another rider's name, or leave the name blank to quit: ");
	        }
	    }
		
		
		System.out.println("Peeked element: " + tester.peek());
		tester.display();
	}

}
