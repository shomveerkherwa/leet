package problems;

import model.ListNode;
import utility.LinkedListHelper;

/*NOTE: This logic has a failed testcase which am unable to find.*/
public class _19_Remove_Nth_Node_From_LinkedList {

	public static void main(String[] args) {
		ListNode head = LinkedListHelper.create1To5List();
		int n=0;
		LinkedListHelper.display(head);
		removeNthNodeFromTheEnd(head, n);
		LinkedListHelper.display(head);
	}

	private static ListNode removeNthNodeFromTheEnd(ListNode head, int n) {
		if(head == null || n <= 0)
			return head;
		
		int size = length(head);
		System.out.println(size);
		int NthNode = size - n;
		
		if(NthNode < 0) {
			return head;
		}
		
		ListNode pointer = head;
		int i=1;
		
		while(i < NthNode && pointer != null) {
			pointer = pointer.next;
			i++;
		}
		
		pointer.next = pointer.next.next;
		
		return head;
	}

	private static int length(ListNode head) {
		int i=0;
		while(head != null) {
			++i;
			head = head.next;
		}
		return i;
	}

}
