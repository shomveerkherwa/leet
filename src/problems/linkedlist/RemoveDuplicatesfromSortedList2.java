package problems.linkedlist;

import model.ListNode;
import utility.LinkedListHelper;

/*
Given the head of a sorted linked list, delete all nodes that have duplicate numbers,
 leaving only distinct numbers from the original list. Return the linked list sorted as well.
 Example = 1 -> 2 -> 2 -> 3 -> 4 -> 4 -> 5
 Result  = 1 -> 3 -> 5
 */
public class RemoveDuplicatesfromSortedList2 {

	public static void main(String[] args) {
		int[] inp = {1,1};
		ListNode head = LinkedListHelper.createCustomeList(inp);
		LinkedListHelper.display(head);
		head = deleteDuplicates(head);
		System.out.println();
		LinkedListHelper.display(head);
	}
	
	public static ListNode deleteDuplicates(ListNode head) {
		ListNode curr = head;
		ListNode prev = null;
		ListNode temp = null;	
		while(curr != null) {
			System.out.print(curr.val +"\t");
			if( ((curr.next != null) && (curr.val == curr.next.val)) || 
				((temp != null &&  temp.val == curr.val)) ) {
				temp = curr;
				curr = curr.next;
				continue;
			}
			if(prev == null) {
				prev = curr;
				head = prev;
			}
			else
				prev.next = curr;
			prev = curr;
			curr = curr.next;
		}
		if(prev == null) {
			return prev;
		}else {
			prev.next = curr;
		}
		return head;
    }

}
