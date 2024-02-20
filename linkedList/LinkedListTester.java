package linkedList;

public class LinkedListTester {

	public static void main(String[] args) {
		// create implementation, then...
		
		LinkedList tester = new LinkedListImpl();
		
		//Add items
		tester.addItem("one");
		tester.addItem("two");
		
		//List items
		tester.listItems();
		
		//Item count
		tester.itemCount();
		
		//Check if in list
		tester.isItemInList("one");
		tester.isItemInList("three");
		
		//Insert before
		tester.insertBefore("hello", "one");
		
		//List items
		tester.listItems();
		
		//Insert after
		tester.insertAfter("four", "one");
		
		//List items
		tester.listItems();
		
		//Delete item
		tester.deleteItem("two");
		
		//Sort
		tester.sort();
		
		//List items
		tester.listItems();
	}

}
