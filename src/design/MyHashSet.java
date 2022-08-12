package design;

import model.ListNode;

public class MyHashSet {
	
	private ListNode head;
	
	public MyHashSet() {}
    
    public void add(int key) {
    	if(!contains(key)) {
    		ListNode added = new ListNode(key);
            ListNode curr = head;
            if(curr == null) {
            	head = added;
            } else if(curr.next == null) {
            	curr.next = added;
            } else {
            	while(curr.next != null) {
                	curr = curr.next;
                }
            	curr.next = added;
            }
    	}
    }
    
    public void remove(int key) {
        if(head == null)
        	return;
        ListNode curr = head;
        ListNode prev = null;
        while(curr != null) {
        	if(curr.val == key) {
        		if(prev == null) {
        			head = curr.next;
        			return;
        		}
        		prev.next = curr.next;
        	}
        	prev = curr;
        	curr = curr.next;
        }
    }
    
    public boolean contains(int key) {
        ListNode curr = head;
        while(curr != null) {
        	if(curr.val == key) {
        		return true;
        	}
        	curr = curr.next;
        }
        return false;
    }
}
