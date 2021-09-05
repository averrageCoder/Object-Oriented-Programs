package com.bridgelabz.datastructures;

public class MyLinkedList {
	
	private INode head;
	private INode tail;
	private int size;

	public MyLinkedList() {
		this.head = null;
		this.tail=null;
		this.size=0;
	}

	public void add(INode myNode) {
		
		if(this.tail==null) {
			this.tail=myNode;
		}
		if(this.head==null) {
			this.head=myNode;
		}
		else {
			INode tempNode = this.head;
			this.head = myNode;
			this.head.setNext(tempNode);
		}
		this.size++;
	}
	
	public void printMyNodes() {
		StringBuffer myNodes = new StringBuffer("My nodes: ");
		INode tempNode = this.head;
		if(tempNode==null)
			System.out.println("Empty List!");
		else {
			while(tempNode.getNext()!=null) {
				myNodes.append(tempNode.getKey());
				if(!tempNode.equals(tail))
					myNodes.append("\n\t->");
				tempNode = tempNode.getNext();
			}
			myNodes.append(tempNode.getKey());
			System.out.println(myNodes);
		}
	}

	public void append(INode myNode) {
		if(this.tail==null) {
			this.tail=myNode;
		}
		else {
			this.tail.setNext(myNode);
			this.tail = myNode;
		}
		if(this.head==null) {
			this.head=myNode;
		}
		this.size++;
	}

	public void insert(INode startNode, INode newNode) {
		
		INode tempNode = startNode.getNext();
		startNode.setNext(newNode);
		newNode.setNext(tempNode);
		this.size++;
	}

	public INode pop() {
		
		INode tempNode = this.head;
		this.head=tempNode.getNext();
		return tempNode;
		
	}

	public INode popLast() {
		INode tempNode = head;
		if(head!=tail) {
			while(!tempNode.getNext().equals(tail)) {
				tempNode = tempNode.getNext();
			}
			this.tail = tempNode;
			tempNode = tempNode.getNext();
			this.tail.setNext(null);
			return tempNode;
		}
		else {
			return head;
		}
	}

	public <K> INode search(K key) {
		INode tempNode = head;
		while(tempNode!=null) {
			//System.out.println(tempNode.getKey()+" "+key);
			if(tempNode.getKey().equals(key)) {
				return tempNode;
			}
			tempNode=tempNode.getNext();
		}
		return null;
	}

	public <K> boolean searchAndInsert(K key, INode fourthNode) {
		
		INode tempNode = head;
		while(tempNode!=null) {
			if(tempNode.getKey().equals(key)) {
				this.insert(tempNode, fourthNode);
				return true;
			}
			tempNode=tempNode.getNext();
		}
		return false;
		
	}

	public int getSize() {
		// TODO Auto-generated method stub
		return this.size;
	}

	public <K> boolean remove(K key) {
		
		INode tempNode = head, prevNode=null;
		while(tempNode!=null) {
			if(tempNode.getKey().equals(key)) {
				if(tempNode.equals(head))
					this.head=tempNode.getNext();
				else
					prevNode.setNext(tempNode.getNext());
				if(tempNode.equals(tail))
					this.tail=prevNode;
				
				this.size--;
				return true;
			}
			prevNode = tempNode;
			tempNode=tempNode.getNext();
		}
		return false;
		
	}
	
}
