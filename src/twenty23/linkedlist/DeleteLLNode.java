package twenty23.linkedlist;

import model.ListNode;
import utility.LinkedListHelper;

public class DeleteLLNode {

	public static void main(String[] args) {
		ListNode head = LinkedListHelper.create1To5List();
		LinkedListHelper.display(head);
		ListNode somenode = head.next.next; // 3
		solution(somenode);
		LinkedListHelper.display(head);
	}

	private static void solution(ListNode node) {
		node.val = node.next.val;
		node.next = node.next.next;
	}

}
