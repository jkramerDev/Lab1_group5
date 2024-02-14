package stack; 

public class StackImpl implements Stack {
	
	private String[] elements;
	private int top;
	private int size;
	
	public StackImpl(int size)
	{
		elements = new String[size];
		top = -1;
		this.size=size;
	}
	
	@Override
	public void push(String s) 
	{
		
		//Increases top location
		if (!isFull())
		{
			top++;
		
			//assigns element to top
			elements[top] = s;
		}
		else
			System.out.println("Cannot add String: "+ s+ " because stack is full");
		//for testing push method
		//System.out.println("thing i added to stack: " + s);
	
	}

	@Override
	public String pop() 
	{
		
		if (top != -1)
		{
			String s = elements[top];
			top--;
			return s;
		}
		else
		{
			System.out.println("Stack is empty, nothing to pop");
			return null;
		}
		
	}

	@Override
	public Boolean isEmpty() 
	{
		
		//Checks to see if top is equal to -1 when initialized
		return top==-1;

	}

	@Override
	public Boolean isFull() 
	{
		
		//Checks to see if top is equal to size
		//size is minus 1 due to indexing
		return top == size-1;
	}

	@Override
	public int size() 
	{
		
		//Returns the total number of items in an array
		return top+1;
	}

	@Override
	public String peek() 
	{
		
		return elements[top];
	}

	
	/*
	Said to ignore
	capacity is set when stack is initialized in constructor 
	Changed to get capacity
	 */
	@Override
	public int getCapacity() 
	{
		return size;
	}
	
	
	@Override
	public void display() 
	{
		if (!isEmpty())
		{
			System.out.println("The Strings in the stack are: ");
			for(int i = 0; i<=top;i++)
			{
				System.out.println(elements[i]);
			}
		}
		else
			System.out.println("The stack is empty");
	}
 

}
