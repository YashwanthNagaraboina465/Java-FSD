package AssistedProject6;

//  Circular LinkedList

public class LinkedList {

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	Node head;

	LinkedList() {
		head = null;
	}

	void sortedInsert(Node newnode) {
		Node current = head;
		if (current == null) {
			newnode.next = newnode;
			head = newnode;
		} else if (current.data >= newnode.data) {
			while (current.next != head)
				current = current.next;
			current.next = newnode;
			newnode.next = head;
			head = newnode;
		} else {
			while (current.next != head && current.next.data < newnode.data)
				current = current.next;
			newnode.next = current.next;
			current.next = newnode;
		}
	}

	void printList() {
		if (head != null) {
			Node temp = head;
			do {
				System.out.print(temp.data + " ");
				temp = temp.next;
			} while (temp != head);
		}
	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		int arr[] = new int[] { 12, 6, 2, 11, 1, 90 };
		Node temp = null;
		for (int i = 0; i < 6; i++) {
			temp = new Node(arr[i]);
			list.sortedInsert(temp);
		}
		list.printList();
	}
}
