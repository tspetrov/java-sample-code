package myImplementationsOfSomeAbstractDataStructures;

public class DynamicStack {
	private class Node {
		Object elem;

		public Node(Object elem, Node next) {
			this.elem = elem;
			this.next = next;
		}

		Node next;
	}

	private Node top;

	public DynamicStack() {
		top = null;
	}

	public void add(Object elem) {
		if (top == null) {
			Node temp = new Node(elem, null);
			top = temp;
		} else {
			Node temp = new Node(elem, top);
			top = temp;
		}
	}

	// destroys stack
	public void printInfo() {
		while (top != null) {
			System.out.println(top.elem + " ");
			top = top.next;
		}
	}

	public Object pop() {
		Object elem = top.elem;
		top = top.next;
		return elem;
	}

	public Object peek() {
		Object elem = top.elem;
		return elem;
	}

	public int size() {
		int size = 0;
		Node temp = top;
		while (temp != null) {
			temp = temp.next;
			size++;
		}
		return size;
	}

	public void clear() {
		top = null;
	}

	public boolean contains(Object elem) {
		Node temp = top;
		while (temp != null) {
			if (temp.elem.equals(elem))
				return true;
			temp = temp.next;
		}
		return false;
	}

	public Object[] toArray() {
		Object[] stackArray = new Object[size()];
		Node temp = top;
		int i = 0;
		while (temp != null) {
			stackArray[i] = temp.elem;
			i++;
			temp = temp.next;
		}
		return stackArray;
	}

}
