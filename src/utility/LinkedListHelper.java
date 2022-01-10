package utility;

import model.ListNode;

public class LinkedListHelper {

	// 1->2->3->4->5-> NULL
	public static ListNode create1To5List() {
		ListNode five = new ListNode(5);
		ListNode four = new ListNode(4);
			four.setNext(five);
		ListNode three = new ListNode(3);
			three.setNext(four);
		ListNode two = new ListNode(2);
			two.setNext(three);
		ListNode one = new ListNode(1);
			one.setNext(two);
		ListNode head = one;
		return head;
	}
	
	public static void display(ListNode current) {
		while(current != null) {
			System.out.print(current.getVal() +" -> \t" );
			current = current.getNext();
		}
		System.out.println();
	}
	
	public static ListNode create1To8List() {
		ListNode head = create1To5List();
		ListNode pointer = head;
		
		while(pointer.next != null) {
			pointer = pointer.next;
		}
		
		for(int i=6; i<9; i++) {
			ListNode node = new ListNode(i);
			pointer.next = node;
			pointer = node;
		}
		
		return head;
	}
	
	public static ListNode create1To15List() {
		ListNode head = new ListNode(1);
		ListNode pointer = head;
		for(int i=2; i<16; i++) {
			ListNode node = new ListNode(i);
			pointer.next = node;
			pointer = node;
		}
		return head;
	}
	
	public static ListNode findLinkedListMidNode(ListNode head) {
		if(head == null) {
			return null;
		}
		
		ListNode slow = head;
		ListNode fast = head;
		
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
}
