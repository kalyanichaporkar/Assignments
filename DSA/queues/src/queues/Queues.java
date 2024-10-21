package queues;

public class Queues implements Queue {
	int queueStack[];
	int rear = -1;
	int front = -1;

	@Override
	public void enqueue(int element) {
		if(isFull()) {
			return;
		}
		rear++;
		queueStack[rear] = element;
	}

	@Override
	public int dequeue() {
		if(isEmpty()) {
			return -1;
		}
		front++;
		int result = queueStack[front];
		return result;
	}

	@Override
	public boolean isEmpty() {
		if(front == rear) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isFull() {
		if(rear == queueStack.length - 1) {
			return true;
		}
		return false;
	}

}
