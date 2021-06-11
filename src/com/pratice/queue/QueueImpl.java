package com.pratice.queue;

public class QueueImpl {

	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.enQueue(12);
		queue.enQueue(13);
		queue.enQueue(14);
		queue.enQueue(15);
		queue.enQueue(16);
		//queue.enQueue(17);
		queue.deQueue();
		queue.deQueue();
		queue.deQueue();
		queue.deQueue();
		queue.deQueue();
		queue.deQueue();
		queue.display();
	}
}
