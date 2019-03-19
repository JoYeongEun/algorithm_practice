package algorithm_prac;

public class stack{

	public static void main(String[] args) {
		Stack1 stack = new Stack1(5);
		
		for(int i=1;i<6;i++) {
			stack.push(i);
		}
		
		stack.printStack();
		
		stack.peek();
		
		stack.pop();
		stack.pop();
		
	}
}
	

