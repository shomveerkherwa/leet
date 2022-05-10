package datastructure;

public class CircularQueue {
	
	int size;
	int[] input;
	int front = -1;
	int rear = -1;
	
	public CircularQueue(int size) {
		this.size = size;
		input = new int[size];
	}
	
	public boolean enQueue(int value) {
        if(isFull()) {
        	return false;
        }
    	//check if even head needs to be instantiated
    	if(front == -1)
    		front = 0;
    	rear = (rear + 1) % size;
    	input[rear] = value;
        return true;
    }
    
    public boolean deQueue() {
       if(isEmpty())
    	   return false;
       //System.out.println("removed "+ input[front]);
      
       // check if they need to reset the pointers
       if(front == rear) {
    	   front = rear = -1;
    	   return true;
       }
       front = (front + 1) % size;
       return true;
    }
    
    public int Front() {
    	if(front == -1)
    		return front;
        return input[front];
    }
    
    public int Rear() {
    	if(rear == -1)
    		return rear;
        return input[rear];
    }
    
    public boolean isEmpty() {
        if(front == -1 && rear == -1) {
        	//System.out.println("queue is full");
        	return true;
        }
        return false;
    }
    
    public boolean isFull() {
        if((rear +1) % size == front) {
        	//System.out.println("queue is full");
        	return true;
        }
        return false;
    }
	
}
