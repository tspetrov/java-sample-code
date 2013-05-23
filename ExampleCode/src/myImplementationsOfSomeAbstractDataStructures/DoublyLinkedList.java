package myImplementationsOfSomeAbstractDataStructures;

public class DoublyLinkedList {
	private class Node {
		private Object elem;
		private Node next;
		private Node prev;

		public Node(Object elem, Node next, Node prev) {
			this.elem = elem;
			this.next = next;
			this.prev = prev;
		}

	}

	private Node head;
	private Node tail;
	int count;

	public int getCount() {
		return count;
	}

	public Node getNodeAt(int index) {
		Node temp = head;
		if (index >= count || index < 0)
			throw new IndexOutOfBoundsException("Incorrect index");
		for (int i = 0; i < index; i++)
			temp = temp.next;
		return temp;
	}

	public void mySwap(int index1, int index2) {
		Integer elem = (Integer) getNodeAt(index1).elem;
		getNodeAt(index1).elem = getNodeAt(index2).elem;
		getNodeAt(index2).elem = elem;
	}

	public DoublyLinkedList() {
		head = null;
		tail = null;
		count = 0;
	}

	public void add(Object elem) {
		if (count == 0) {
			Node n = new Node(elem, null, null);
			this.head = n;
			this.tail = n;
			count++;

		} else {
			Node n = new Node(elem, null, tail);
			this.tail.next = n;

			tail = n;
			count++;
		}

	}

	public void add(Object elem, int position) {
		if (position > count || position < 0)
			throw new IndexOutOfBoundsException("Incorrect index");
		if (position == 0) {
			Node temp = new Node(elem, head, null);
			head.prev = temp;
			head = temp;
			count++;
			return;
		}
		if (position == count) {
			add(elem);
			return;
		}
		if (position < count / 2) {
			Node temp = new Node(elem, null, null);
			Node n = head;
			for (int i = 0; i < position - 1; i++)
				n = n.next;

			temp.prev = n;
			temp.next = n.next;
			n.next = temp;
			temp.next.prev = temp;
		} else {
			Node temp = new Node(elem, null, null);
			Node n = tail;
			for (int i = count - 1; i > position; i--)
				n = n.prev;

			temp.next = n;
			temp.prev = n.prev;
			n.prev = temp;
			temp.prev.next = temp;

		}
		count++;
	}

	public boolean contains(Object elem) {
		Node n = head;
		if (n.elem.equals(elem))
			return true;
		else
			for (int i = 0; i < this.count - 1; i++) {
				n = n.next;
				if (n.elem.equals(elem))
					return true;
			}
		return false;
	}

	public void delElemAt(int index) {
		if (index >= count || index < 0)
			throw new IndexOutOfBoundsException(
					"Incorrect index or the array does not exist");
		if (count == 1) {
			head = null;
			tail = null;
		}
		if (index == 0) {
			head = head.next;
			head.prev = null;
			count--;
			return;
		}
		if (index == count-1) {
			tail = tail.prev;
			tail.next = null;
			count--;
			return ;
		}
		if (index < count / 2) {
			Node n = head;
			for (int i = 0; i < index - 1; i++)
				n = n.next;
			n.next = n.next.next;
			n.next.prev = n;
		} else {
			Node n = tail;
			for (int i = count - 1; i > index + 1; i--)
				n = n.prev;
			n.prev = n.prev.prev;
			n.prev.next = n;
		}
		count--;

	}


	public Object getElemAt(int index) {
		Node temp = head;
		if (index >= count || index < 0)
			throw new IndexOutOfBoundsException("Incorrect index at: " + index);
		for (int i = 0; i < index; i++)
			temp = temp.next;
		return temp.elem;
	}

	public Object[] getArray() {
		Object[] arr = new Object[count];
		for (int i = 0; i < count; i++)
			arr[i] = getElemAt(i);
		return arr;
	}

	public void printInfo() {
		Node n = this.head;
		for (int i = 0; i < count; i++) {
			System.out.println("Node " + i + " = " + n.elem);
			n = n.next;
		}

	}
}
