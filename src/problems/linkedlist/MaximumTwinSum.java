package problems.linkedlist;

import model.ListNode;
import utility.LinkedListHelper;

public class MaximumTwinSum {

	public static void main(String[] args) {
		ListNode head = LinkedListHelper.createCustomeList(new int[] {5,4,2,1});
		LinkedListHelper.display(head);
		System.out.println(pairSum(head));
	}

	public static int pairSum(ListNode head) {
        int max = 0;
        
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        ListNode next = null;
        
        while(fast != null && fast.next != null) {
        	fast = fast.next.next;
        	
        	next = slow.next;
        	slow.next = prev;
        	prev = slow;
        	slow = next;
        }
        
        fast = slow;
        slow = prev;
        
        while(slow != null || fast != null) {
        	max = Math.max(max, fast.val+slow.val);
        	slow = slow.next;
        	fast = fast.next;
        }
        
        return max;
    }
}
