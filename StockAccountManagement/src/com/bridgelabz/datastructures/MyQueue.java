package com.bridgelabz.datastructures;

public class MyQueue {

	private final MyLinkedList myLinkedList;
	
	public MyQueue() {
		this.myLinkedList = new MyLinkedList();
	}
	
	public void enqueue(INode newNode) {
		myLinkedList.append(newNode);
	}

	public void printQueue() {
		myLinkedList.printMyNodes();
	}

	public INode dequeue() {
		INode tempNode = myLinkedList.pop();
		return tempNode;
	}
	
	public INode removeRear() {
		INode tempNode = myLinkedList.popLast();
		return tempNode;
	}

	public int getSize() {
		// TODO Auto-generated method stub
		return myLinkedList.getSize();
	}
	
}
