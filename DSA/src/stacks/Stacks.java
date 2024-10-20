package stacks;

public class Stacks implements StackOperations {

	private int top = -1;
	private int[] stackData;
	

	@Override
	public void push(int element) {
		if(isFull()) {
			return;
		}
		++top;
		stackData[top] = element;
	}

	@Override
	public int pop() {
		if(isEmpty()) {
			return -1;
		}
		int result = stackData[top];
		--top;
		return result;
	}

	@Override
	public boolean isEmpty() {
		if(top == -1) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isFull() {
		if(top == stackData.length - 1) {
			return true;
		}
		return false;
	}
}
