package AssistedProject7;

// doubly LinkedList
public class D_LinkedList {

	Node head;

	class Node {
		int data;
		Node prev;   // it stores address for previous node
		Node next;

		Node(int d) {
			data = d;
		}
	}

	public void push(int newdata) {
		Node new_Node = new Node(newdata);
		new_Node.next = head;
		new_Node.prev = null;
		if (head != null)
			head.prev = new_Node;
		head = new_Node;
	}

	public void InsertAfter(Node prev_Node, int newdata) {
		if (prev_Node == null) {
			System.out.println("The given previous node cannot be NULL ");
			return;
		}
		Node new_node = new Node(newdata);
		new_node.next = prev_Node.next;
		prev_Node.next = new_node;
		new_node.prev = prev_Node;
		if (new_node.next != null)
			new_node.next.prev = new_node;
	}

	void append(int newdata) {
		Node new_node = new Node(newdata);
		Node last = head;
		new_node.next = null;
		if (head == null) {
			new_node.prev = null;
			head = new_node;
			return;
		}
		while (last.next != null)
			last = last.next;
		last.next = new_node;
		new_node.prev = last;
	}

	public void printlist(Node node) {
		Node last = null;
		System.out.println("Traversal in forward Direction");
		while (node != null) {
			System.out.print(node.data + " ");
			last = node;
			node = node.next;
		}
		System.out.println();
		System.out.println("Traversal in reverse direction");
		while (last != null) {
			System.out.print(last.data + " ");
			last = last.prev;
		}
	}

	public static void main(String[] args) {
		D_LinkedList Dll = new D_LinkedList();
		Dll.append(0);
		Dll.push(7);
		Dll.push(1);
		Dll.append(42);
		Dll.InsertAfter(Dll.head.next, 8);
		System.out.println("Created D_LinkedList is: ");
		Dll.printlist(Dll.head);
	}
}
