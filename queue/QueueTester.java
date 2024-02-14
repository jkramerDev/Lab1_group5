package queue;
import java.util.Scanner;

public class QueueTester {

	public static void main(String[] args) {
		
		Queue tester = new QueueImpl(20);
		
		String name = "placeholder";
		Scanner scanner = new Scanner(System.in);
		int length = name.length();
		
		System.out.print("Enter a rider's name, or leave the name blank to quit: ");
		while(length == 0) {
			
			name = scanner.nextLine();
			
			length = name.length();
			
			tester.enQueue(name);
			if(length == 0) {
				System.out.print("Enter another rider's name, or leave the name blank to quit: ");
			}
			else {
				System.out.println("Quitting..");
			}
		}
		
		
		tester.peek();
		tester.display();
	}

}
