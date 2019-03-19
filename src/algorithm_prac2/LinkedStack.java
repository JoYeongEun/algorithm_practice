package algorithm_prac2;

public class LinkedStack {
	
	private Node top;
	
	public LinkedStack() {
		this.top = null;
	}
	
	public boolean isEmpty() {
		return (top==null);
	}
	
	public void push(Object data) {
		Node newNode = new Node(data);
		newNode.next = top;
		top = newNode;
	}
	
	public Object peek() {
		if(isEmpty()) {throw new ArrayIndexOutOfBoundsException();}
		else {
			return top.data;
		}
	}
	
	public Object pop() {
		Object item = peek();
		top = top.next;
		return item;
	}
}
