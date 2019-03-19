package algorithm_prac;

class Stack1 implements StackArray{
	int top= -1;
	int []stack;
	int size;
	
	public Stack1(int size) {
		this.top= -1;
		stack=new int[size];
		this.size=size;
	}
	
	public void pop() {
		if(stack.length>0) {
			System.out.println(stack[top--]+"is pop!");
		}
		else {
			System.out.println("anythong is left.");
		}
		
	}
	
	public void peek() {
		System.out.println(stack[top]+"is top value");
	}
	
	public void push(int data) {
		stack[++top]=data;
	}
	
	public void printStack() {
		System.out.println("----StackList----");
		if(top>=0) {
			for(int i=0;i<=top;i++) {
				System.out.print(stack[i]+" ");
			}
			System.out.println();
		}
		else {
			System.out.println("stack is empty!");
		}
	}
}
