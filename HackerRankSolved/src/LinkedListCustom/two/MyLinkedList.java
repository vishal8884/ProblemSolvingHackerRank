package LinkedListCustom.two;

public class MyLinkedList {

	int length;
	Node head;

	class Node {
		int data;
		Node next;

		Node(int x) {
			this.data = x;
		}
	}

	public MyLinkedList() {
		this.length = 0;
		this.head = null;
	}

	public int get(int index) {
		if (index < 0 || index >= this.length) {
			return -1;
		} else {
			Node curr = head;
			int counter = 0;
			while (index < index) {
				curr = curr.next;
				counter++;
			}

			return curr.data;
		}
	}
}
