package twenty23.array;

import model.ListNode;
import utility.LinkedListHelper;

public class AddtwoNumbers {

	public static void main(String[] args) {
		ListNode head1 = LinkedListHelper.createCustomeList(new int[] {9,9,9});
		ListNode head2 = LinkedListHelper.createCustomeList(new int[] {1});
		LinkedListHelper.display(head1);
		LinkedListHelper.display(head2);
		ListNode addition = solution(head1, head2);
		LinkedListHelper.display(addition);
		
	}

	public static ListNode solution(ListNode head1, ListNode head2) {
		ListNode curr = null;
		ListNode prev = null;
		ListNode head = null;
		int carry = 0;
		
		
		while(head1 != null || head2 != null || carry != 0 ) {
			
			int val1 = head1 == null ? 0 : head1.val;
			int val2 = head2 == null ? 0 : head2.val;
			int newVal = val1 + val2 + carry; 
			
			carry = newVal / 10;
			newVal = newVal % 10;
			
			curr = new ListNode(newVal);
			
			if(prev != null) {
				prev.next = curr;
			}
			if(head == null) {
				head = curr;
			}
			prev = curr;
			
			head1 = head1 != null ? head1.next : null;
			head2 = head2 != null ? head2.next : null;
		}
		
		return head;
	}
}
