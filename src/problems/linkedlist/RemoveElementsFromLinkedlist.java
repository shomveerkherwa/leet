package problems.linkedlist;

import model.ListNode;
import utility.LinkedListHelper;

public class RemoveElementsFromLinkedlist {

	public static void main(String[] args) {
		ListNode head = LinkedListHelper.createCustomeList(new int[]{6,6,1,2,6,3,4,6,6,6,5,6});
		int val = 6;
		head = removeElementsAgain(head, val);
		LinkedListHelper.display(head);
	}

	public static ListNode removeElementsAgain(ListNode head, int val) {
        //deal with elements present in the beginning;
        while(head != null && head.val == val)
        	head = head.next;
        
        ListNode current = head;
        
        if(current == null)
        	return current;
        
        while(current.next != null) {
        	if(current.next.val == val) {
        		current.next = current.next.next;
        	}else {
        		current = current.next;
        	}
        }
        return head;
        	
    }
	
	public static ListNode removeElements(ListNode head, int val) {
        //deal with elements present in the beginning;
        while(head != null && head.val == val)
        	head = head.next;
        
        ListNode current = head;
        
        while(current != null && current.next != null) {
        	ListNode next;
        	if(current.next.val == val) {
        		next = current.next;
        		while(next != null && next.val == val)
        			next = next.next;
        		
        		current.next = next;
        	}else {
        		current = current.next;
        	}
        }
        
        return head;
        	
    }
}
