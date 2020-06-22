package problems;

import model.ListNode;

/* 
 * Given a singly linked list, group all odd nodes together followed by the even nodes. 
 * Please note here we are talking about the node number and not the value in the nodes.

  You should try to do it in place. 
  The program should run in O(1) space complexity and O(nodes) time complexity.*/

public class _328_LinkedList_Odd_Even {

	public static void main(String[] args) {
		ListNode one = new ListNode(1);
		ListNode head = one;
		ListNode two = new ListNode(2);
		ListNode three = new ListNode(3);
		ListNode four = new ListNode(4);
		ListNode five = new ListNode(5);
		ListNode six = new ListNode(6);
		ListNode seven = new ListNode(7);
		ListNode eight = new ListNode(8);
		
		
		one.setNext(two);
		two.setNext(three);
		three.setNext(four);
		four.setNext(five);
		five.setNext(six);
		six.setNext(seven);
		seven.setNext(eight);
		
		display(head);
		head = oddEvenList(head);
		display(head);
	}
	
	private static void display(ListNode current) {
		while(current != null) {
			System.out.print(current.getVal() +" -> \t" );
			current = current.getNext();
		}
		System.out.println();
	}
	
	// 1-> 2-> 3-> 4-> 5-> null
	public static ListNode oddEvenList(ListNode head) {
		
		if(head == null)
			return head;
		
		ListNode oddHead = head;
		ListNode evenHead = head.getNext();
		ListNode staticEvenHead = head.getNext(); // so that we know the start of even nodes
		
		while(evenHead != null && evenHead.next != null) {
			oddHead.next = evenHead.next;
			oddHead = evenHead.next;
			evenHead.next = oddHead.next;
			evenHead = oddHead.next;
		}
		oddHead.next=staticEvenHead;
		
		return head;
	}
}
