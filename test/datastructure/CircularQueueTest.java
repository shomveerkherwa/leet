package datastructure;

public class CircularQueueTest {

	public static void main(String[] args) {
		CircularQueue myCircularQueue = new CircularQueue(2);
		boolean result = false;
		int val = -1;
		result = myCircularQueue.enQueue(6); // return True
		val =myCircularQueue.Rear();
		val =myCircularQueue.Rear();
		result =myCircularQueue.deQueue();
		result =myCircularQueue.enQueue(5);
		val =myCircularQueue.Rear();
		result =myCircularQueue.deQueue();
		val =myCircularQueue.Front();
		result =myCircularQueue.deQueue();
		result =myCircularQueue.deQueue();
		result =myCircularQueue.deQueue();
	}

}
