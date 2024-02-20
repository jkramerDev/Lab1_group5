package linkedList;

public class LinkedListImpl implements LinkedList {
	ListItem head;
	@Override
	public Boolean isItemInList(String thisItem) {
		
		ListItem temp = head;
		while( temp != null) {
			if(temp.data.equalsIgnoreCase(thisItem)) {
				System.out.println("The station " + thisItem + " was in the list");
				return true;
			}
			temp = temp.next;
		}
		System.out.println("The station " + thisItem + " was not in the list");
		return false;
	}

	@Override
	public Boolean addItem(String thisItem) {
		
		if(head == null) {
			System.out.println(thisItem + " was added to the list");
			head = new ListItem(thisItem);
			return true;
		}
		ListItem current = head;
		while(current.next != null) {
			
			current = current.next;
		}
		current.next = new ListItem(thisItem);
		System.out.println(thisItem + " was added to the list");
		return true;
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
			if(current.next.data.equals(thisItem)) {
				System.out.println(thisItem + " was removed from the list");
				current.next = current.next.next;
				return true;
			}else {
				current = current.next;
			}
		}
		return false;
	}

	@Override
	public Boolean insertBefore(String newItem, String itemToInsertBefore) {
		
		ListItem itemNew = new ListItem(newItem);
		
		if(head != null && head.data.equalsIgnoreCase(itemToInsertBefore)) {
			System.out.println(newItem + " was added before " + itemToInsertBefore);
			itemNew.next = head;
			head = itemNew;
			return true;
		}
		
		ListItem current = head;
		while( current != null && current.next != null) {
			if(current.next.data.equalsIgnoreCase(itemToInsertBefore)) {
				System.out.println(newItem + " was added before " + itemToInsertBefore);
				itemNew.next = current.next;
				current.next = itemNew;
				return true;
			}
			current = current.next;
		}
		return false;
		
	}

	@Override
	public Boolean insertAfter(String newItem, String itemToInsertAfter) {
		
		ListItem current = head;
		while( current != null) {
			if(current.data.equalsIgnoreCase(itemToInsertAfter)) {
				System.out.println(newItem + " was added after " + itemToInsertAfter);
				ListItem itemNew = new ListItem(newItem);
				itemNew.next = current.next;
				current.next = itemNew;
				return true;
			}
			current = current.next;
		}
		return false;
		
	}

	@Override
	public void sort() {
		boolean keepGoing = true;
		while(keepGoing) {
			keepGoing = false;
			ListItem current = head;
			while(current != null && current.next != null) {
				if(current.data.compareToIgnoreCase(current.next.data) > 0) {
					String temporary = current.data;
					current.data = current.next.data;
					current.next.data = temporary;
					keepGoing = true;
				}
				current = current.next;
			}
		}
		
	}
	
}
