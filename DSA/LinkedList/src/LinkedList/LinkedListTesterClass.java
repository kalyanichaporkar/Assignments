package LinkedList;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTesterClass {
	public static void main(String[] args) {
		linkedlistss list = (linkedlistss) new LinkedList();
		list.insertAtbeginning(90);
		list.insertAtend(80);
		list.insertAtposition(0, 20);
		list.insertAtposition(2, 40);
		
		System.out.println(list);
		list.deleteFromBeginning();
		
		System.out.println(list);
	}
}
