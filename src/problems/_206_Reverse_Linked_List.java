package problems;

import model.ListNode;

public class _206_Reverse_Linked_List {

	public static void main(String[] args) {
		
		ListNode one = new ListNode(1);
		ListNode head = one;
		ListNode two = new ListNode(2);
		ListNode three = new ListNode(3);
		ListNode four = new ListNode(4);
		ListNode five = new ListNode(5);
		
		one.setNext(two);
		two.setNext(three);
		three.setNext(four);
		four.setNext(five);
		
		display(head);
		head = reverseList(head);
		display(head);
		
	}

	private static void display(ListNode current) {
		while(current != null) {
			System.out.print(current.getVal() +" -> \t" );
			current = current.getNext();
		}
		System.out.println();
	}
	
	// 1 -> 2 -> 3 -> 4 -> 5
	public static ListNode reverseList(ListNode current) {
		ListNode prev = null; // better to initialize as null, because the current head will become last node after reversing, and null will be its next pointer.
		ListNode next = null;
		while(current != null) {
			next = current.getNext(); // get hold of next node before we modify next pointer of current node.
			current.setNext(prev); // reverse the link.
			prev = current; // for next iteration, current node will become the previous node.
			current = next; // to iterate over all the nodes.
		}
		return prev; // return prev because that was the last successful node
	}

}
