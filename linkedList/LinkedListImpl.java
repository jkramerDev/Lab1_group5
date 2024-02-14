package linkedList;

public class LinkedListImpl implements LinkedList {
	ListItem head;
	@Override
	public Boolean isItemInList(String thisItem) {
		
		ListItem temp = head;
		while( temp != null) {
			if(temp.data.equalsIgnoreCase(thisItem)) {
				System.out.println("The item was in the list");
				return true;
			}
		}
		return false;
	}

	@Override
	public Boolean addItem(String thisItem) {
		
		
		System.out.println("hello from addItem in LinkedListImpl - the item passed in: " + thisItem);
		
		if(head == null) {
			head = new ListItem(thisItem);
			return true;
		}
		ListItem current = head;
		while(current.next != null) {
			current = current.next;
			return true;
		}
		current.next = new ListItem(thisItem);
		return false;
	}

	@Override
	public Integer itemCount() {
		
		Integer count = 0;
		ListItem temp = head;
		while( temp != null) {
			temp = temp.next;
			count ++;
		}
		System.out.println("There are " + count + " item(s) in the list");
		return count;
	}

	@Override
	public void listItems() {
		
		ListItem temp = head;
		while( temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
		
	}

	@Override
	public Boolean deleteItem(String thisItem) {
		
		if(head == null) {
			return false;
		}
		
		ListItem current = head;
		while(current.next != null) {
			if(current.next.data == thisItem) {
				current.next = current.next.next;
				return true;
			}else {
				current = current.next;
				return false;
			}
		}
		return null;
	}

	@Override
	public Boolean insertBefore(String newItem, String itemToInsertBefore) {
		
		ListItem current = head;
		while( current != null) {
			if(current.next.data.equalsIgnoreCase(itemToInsertBefore)) {
				ListItem itemNew = new ListItem(newItem);
				itemNew.next = current.next;
				current.next = itemNew;
				return true;
			}
		}
		return false;
		
	}

	@Override
	public Boolean insertAfter(String newItem, String itemToInsertAfter) {
		
		ListItem current = head;
		while( current != null) {
			if(current.data.equalsIgnoreCase(itemToInsertAfter)) {
				ListItem itemNew = new ListItem(newItem);
				itemNew.next = current.next;
				current.next = itemNew;
				return true;
			}
		}
		return false;
		
	}

	@Override
	public void sort() {
		// TODO Auto-generated method stub
		
	}
	
}
