package com.bridgelabz.datastructures;

public class MyNode<K> implements INode<K> {

	private K key;
	private INode next;
	
	public MyNode(K key) {
		this.key = key;
		this.next=null;
	}
	
	public void setNext(INode next){
		this.next=next;
	}

	public INode getNext(){
		return this.next;
	}

	@Override
	public K getKey() {
		// TODO Auto-generated method stub
		return key;
	}

	@Override
	public void setKey(K Key) {
		// TODO Auto-generated method stub
		this.key = key;
		
	}
	
}
