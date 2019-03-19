package algorithm_prac2;

public class Stack2 {

	public static void main(String[] args) {
		LinkedStack list = new LinkedStack();
		
		list.push("jye");
		System.out.println("---LIST---");
		list.push("kjm");
		list.push("pmk");
		list.push("jbk");
		list.push("khn");
		list.push("khj");
		list.push("jkw");
		
		System.out.println(list.peek());
		System.out.println(list.pop());
		System.out.println(list.pop());
		System.out.println(list.pop());
		System.out.println(list.pop());
		System.out.println(list.peek());
	}

}
