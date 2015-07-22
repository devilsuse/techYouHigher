package com.nano.hacker.ds.linkedList;

/**
 * Problem Statement
 * 
 * This challenge is part of a tutorial track by MyCodeSchool and is accompanied
 * by a video lesson.
 * 
 * You�re given the pointer to the head node of a linked list and an integer to
 * add to the list. Create a new node with the given integer, insert this node
 * at the tail of the linked list and return the head node. The head pointer
 * given may be null meaning that the initial list is empty.
 * 
 * Input Format You have to complete the Node* Insert(Node* head, int data)
 * method which takes two arguments - the head of the linked list and the
 * integer to insert. You should NOT read any input from stdin/console.
 * 
 * Output Format Insert the new node at the tail and just return the head of the
 * updated linked list. Do NOT print anything to stdout/console.
 * 
 * Sample Input
 * 
 * NULL, data = 2 2 --> NULL, data = 3
 * 
 * Sample Output
 * 
 * 2 -->NULL 2 --> 3 --> NULL
 * 
 * Explanation 1. We have an empty list and we insert 2. 2. We have 2 in the
 * tail, when 3 is inserted 3 becomes the tail.
 * 
 * @author LXMRX
 *
 */
public class InsertNodeAtTail
{

    public static void main(String[] args)
    {
	Node head = null;
	insert(head, 1);

    }

    /*
     * Insert Node at the end of a linked list head pointer input could be NULL
     * as well for empty list Node is defined as
     */
    static class Node
    {
	int  data;
	Node next;
    }

    static Node insert(Node head, int data)
    {
	// This is a "method-only" submission.
	// You only need to complete this method.
	Node node = new Node();
	node.data = data;
	node.next = null;

	Node originalHead = head;
	Node prevNode = null;

	// if LinkedList is empty
	if (head == null)
	{
	    head = node;
	    return head;
	}

	while (head != null)
	{
	    prevNode = head;
	    head = head.next;
	}

	prevNode.next = node;
	return originalHead;
    }

}
