package problems.linkedlist;

import model.ListNode;
import utility.LinkedListHelper;

public class RotateList {

	public static void main(String[] args) {
		ListNode head = LinkedListHelper.createCustomeList(new int[] {0,1,2}); int k = 4;
		LinkedListHelper.display(head);
		head = rotateRight(head, k);
		LinkedListHelper.display(head);
	}
	
	
	public static ListNode rotateRight(ListNode head, int k) {
        
		if(head == null || head.next == null)
			return head;
		int size = 0;
        
        ListNode temp = head;
        
        while(temp != null ) {
        	size++;
        	temp = temp.next;
        }
        
        k = k < size ? k : k % size;
        int headNodeCount = size - k;
        if(k > 0) {
        	ListNode prev = null;
            temp = head;
            ListNode oldHead = head;
            
            for(int i=0; i<headNodeCount; i++) {
            	prev = temp;
            	temp = temp.next;
            }
            
            prev.next = null;
            head = temp;
            
            while(temp.next != null)
            	temp = temp.next;
            temp.next = oldHead;
        }
        return head;
    }

}
