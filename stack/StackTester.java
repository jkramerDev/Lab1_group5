package stack;

public class StackTester {

	public static void main(String[] args) {

		Stack stackTester = new StackImpl(10);
		runTests(stackTester);
		

	}
	
	public static void runTests(Stack stack) 
	{
		//Check is stack empty
		System.out.println("Is stack Empty: " + stack.isEmpty());
		
		//Gets number of elements in stack
		System.out.println("Number of strings in stack: "+ stack.size());
		
		//Pushes 2 names to stack
	 	stack.push("John");
		stack.push("Jake");
		
		//Gets number of elements in stack
		System.out.println("Number of strings in stack: "+ stack.size());
				
		//Pushes 3 more names to stack
		stack.push("Jack");
		stack.push("Matt");
		stack.push("Luke");
		
		//Displays items in stack
		stack.display();
		
		//Peeks top item
		System.out.println("Top item in stack: " + stack.peek());
		
		//pops top two
		System.out.println("Popped item is: "+stack.pop());
		System.out.println("Popped item is: "+stack.pop());
		
		//Gets number of elements in stack
		System.out.println("Number of strings in stack: "+ stack.size());
		
		//Check is stack empty and full
		System.out.println("Is stack Empty: " + stack.isEmpty());
		System.out.println("Is stack Full: " + stack.isFull());
		
		//Displays items in stack
		stack.display();
		
		//Peeks top item
		System.out.println("Top item in stack: " + stack.peek());
		
		//Push lots of items into stack more then set capacity
		stack.push("A");
		stack.push("B");
		stack.push("C");
		stack.push("D");
		stack.push("E");
		stack.push("F");
		stack.push("G");
		
		//Check is stack empty and full
		System.out.println("Is stack Empty: " + stack.isEmpty());
		System.out.println("Is stack Full: " + stack.isFull());
		stack.push("H");
		stack.push("I");
		stack.push("J");
		stack.push("K");
		
		//Check is stack empty and full
		System.out.println("Is stack Empty: " + stack.isEmpty());
		System.out.println("Is stack Full: " + stack.isFull());
		
		//Check capacity of the stack
		System.out.println("Total stack capacity: " + stack.getCapacity());
		
		//Pops all and more elements then inserted
		System.out.println("Popped item is: "+stack.pop());
		System.out.println("Popped item is: "+stack.pop());
		System.out.println("Popped item is: "+stack.pop());
		System.out.println("Popped item is: "+stack.pop());
		System.out.println("Popped item is: "+stack.pop());
		System.out.println("Popped item is: "+stack.pop());
		System.out.println("Popped item is: "+stack.pop());
		System.out.println("Popped item is: "+stack.pop());
		System.out.println("Popped item is: "+stack.pop());
		System.out.println("Popped item is: "+stack.pop());
		
		//Elements that do not exist
		System.out.println("Popped item is: "+stack.pop());
		System.out.println("Popped item is: "+stack.pop());
		
		//Displaying empty stack
		stack.display();
		
	}

}
