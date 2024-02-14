package linkedList;

public class LinkedListTester {

	public static void main(String[] args) {
		// create implementation, then...
		
		LinkedList tester = new LinkedListImpl();
		tester.addItem("an item to add");
		tester.addItem("an item to add 2");
		tester.listItems();
		tester.itemCount();
		//tester.isItemInList("hello");
		tester.insertBefore("hello", "an item to add 2");
		tester.listItems();
		tester.itemCount();
		tester.deleteItem("hello");
		//tester.isItemInList("hello");
		tester.listItems();
		tester.itemCount();
	}

}
