package AssistedProject5;

import java.io.*;


// SinglyLinkedList
public class LinkedList {
	Node head;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

// Method to add a new node 
	public static LinkedList add(LinkedList list, int data) {
		 
		Node newnode = new Node(data);
		newnode.next = null;
		// If the Linked List is empty, then make the new node as head
		if (list.head == null) {
			list.head = newnode;
		} else {
			// Else traverse till the last node and add the newnode there
			Node last = list.head;
			while (last.next != null) {
				last = last.next;
			}
			// add the newnode at last node
			last.next = newnode;
		}
		return list;
	}

	public static void printList(LinkedList list) {
		Node currNode = list.head;
		System.out.print("LinkedList: ");
		// Traverse through the LinkedList
		while (currNode != null) {
			// Print the data at current node
			System.out.print(currNode.data + " ");
			// Go to next node
			currNode = currNode.next;
		}
		System.out.println();
	}

	// Method to delete a node in the LinkedList by KEY
	public static LinkedList deleteByKey(LinkedList list, int key) {
		// Store head node
		Node currNode = list.head, prev = null;
		if (currNode != null && currNode.data == key) {
			list.head = currNode.next; // Changed head
			System.out.println(key + " found and deleted");
			return list;
		}
		while (currNode != null && currNode.data != key) {
			prev = currNode;
			currNode = currNode.next;
		}
		if (currNode != null) {
			prev.next = currNode.next;
			System.out.println(key + " found and deleted");
		}
		if (currNode == null) {
			System.out.println(key + " not found");
		}
		return list;
	}

	// method to create a Singly linked list with n nodes
	public static void main(String[] args) {
		/* Start with the empty list. */
		LinkedList list = new LinkedList();
		// add the values
		list = add(list, 1);
		list = add(list, 2);
		list = add(list, 3);
		list = add(list, 4);
		list = add(list, 5);
		
		printList(list); // Print the LinkedList

		deleteByKey(list, 1);

		printList(list);

		deleteByKey(list, 4);

		printList(list);
	}
}
