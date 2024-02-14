package stack;

public interface Stack {
 
	public void push(String s);
	public String pop();
	public Boolean isEmpty();
	public Boolean isFull();
	
	//Returns total number of elements in stack
	public int size();
	public String peek();
	
	//Changed set to get capacity
	//Returns total possible number of elements in stack
	public int getCapacity();
	public void display();
}
