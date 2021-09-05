package com.bridgelabz.datastructures;

public class MyStack {
	
	private INode top;
	private int size;
	
	public MyStack() {
		this.top = null;
		this.size=0;
	}
	
	public void push(INode myNode) {
		
		if(this.top==null) {
			this.top=myNode;
		}
		else {
			INode tempNode = this.top;
			this.top = myNode;
			this.top.setNext(tempNode);
		}
		this.size++;
	}
	
	public void printMyNodes() {
		StringBuffer myNodes = new StringBuffer("My nodes: ");
		INode tempNode = this.top;
		if(tempNode==null)
			System.out.println("Empty Stack!");
		else {
			while(tempNode.getNext()!=null) {
				myNodes.append(tempNode.getKey());
				myNodes.append("->");
				tempNode = tempNode.getNext();
			}
			myNodes.append(tempNode.getKey());
			System.out.println(myNodes);
		}
	}
	
	public INode peek() {
		return this.top;
	}
	
	public INode pop() {
		if(this.top == null) {
			//System.out.println("Empty Stack!");
			return null;
		}
		INode tempNode = this.top;
		this.top = tempNode.getNext();
		return tempNode;
	}
	
	public int getSize() {
		return this.size;
	}
	
	public void popTillEmpty() {
		INode tempNode = this.top;
		if(tempNode==null)
			System.out.println("Empty Stack!");
		else {
			while(tempNode.getNext()!=null) {
				tempNode = this.top;
				this.top = tempNode.getNext();
				System.out.println("Popped Element: "+tempNode.getKey());
			}
		}
	}
	
}
