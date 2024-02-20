package app;
 
import linkedList.LinkedList;
import linkedList.LinkedListImpl;
import queue.Queue;
import queue.QueueImpl;
import stack.Stack;
import stack.StackImpl;

public class StagBusClient {

	public static void main(String[] args) {
		// create implementation, then

		System.out.println("-----L I S T  T E S T------");
		
		//listRunTestMethod...
 		
		System.out.println("-----S T A C K  T E S T------");
		stagBusStack();
		//QRunTestMethod...
	 
		System.out.println("----Q U E U E  T E S T-------");
		

		//StackRunTestMethod...
		
	 	}
	
	public static void stagBusStack()
	{
		//Creates new stack of riders on the bus
		StackImpl riders = new StackImpl(10);
		
		//Pushes the 6 riders to the stack
		riders.push("Mike");
		riders.push("John");
		riders.push("Max");
		riders.push("Jack");
		riders.push("Sophia");
		riders.push("Matt");
		
		//Displays all the riders in the stack
		riders.display();
		
		//Peek at the first rider
		System.out.println("The last person on the bus is: " + riders.peek());
		
		//removes the top rider
		System.out.println(riders.pop()+" left the bus.");
		
		//Displays all the riders
		riders.display();
		
		//Peek at the first rider
		System.out.println("The last person on the bus is: " + riders.peek());
		
		//Add 2 more riders
		riders.push("Luke");
		riders.push("Evan");		
		
		//Peek at the first rider
		System.out.println("The last person on the bus is: " + riders.peek());
		
		while(!riders.isEmpty())
		{
			riders.pop();
		}
		
		System.out.println("Is the bus empty: "+riders.isEmpty()+"\n");
	}

}
