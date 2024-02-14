package queue;

public class QueueImpl implements Queue {
	
	  protected final int DEFCAP = 20; // default capacity
	  protected String[] elements;           // array that holds queue elements
	  protected int size = 0;    // number of elements in this queue
	  protected int front = 0;          // index of front of queue
	  protected int rear;               // index of rear of queue

	  
	  public QueueImpl(int maxSize) 
	  {
		this.elements = new String[maxSize];
	    rear = maxSize - 1;
	  }
	  
	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return (size == elements.length);
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return (size == 0);
	}

	@Override
	public void enQueue(String element) {
		// TODO Auto-generated method stub
		
		if (isFull())
		      System.err.println("Queue is full.");
		    else {
		      rear = (rear + 1) % elements.length;
		      elements[rear] = element;
		      size ++;
		      System.out.println("Added element to queue.");
		    }
		
	}

	@Override
	public String deQueue() {
		// TODO Auto-generated method stub
		if (isEmpty())
		     System.err.println("Couldn't remove element from empty queue.");
		else {
		      String toReturn = elements[front];
		      elements[front] = null;
		      front = (front + 1) % elements.length;
		      size --;
		      System.out.println("Removed element from queue");
		      return toReturn;
		    }
		return null;
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Elements in the list: ");
		for(int i = 0; i<=size; i++) {
			System.out.println(elements[i]);
		}
		
	}

	@Override
	public String peek() {
		// TODO Auto-generated method stub
		return elements[rear];
	}

}
