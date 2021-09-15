package com.yml.hash;

public class MyLinkedList<K> {
	public INode<K> head;
	public INode<K> tail;
	
	public MyLinkedList() {
		this.head = null;
		this.tail = null;	
	}
		
	public void append(INode<K> newNode) {
		if(this.head == null) {
			this.head = newNode;
		}
		if(this.tail == null) {
			this.tail = newNode;
		}
		else {
			this.tail.setNext(newNode);
			this.tail = newNode;

		}
	}
	
	public INode<K> search(K Key) {
		INode<K> tempNode = head;
		while(tempNode != null && tempNode.getNext() != null) {
			if (tempNode.getKey().equals(Key)){
				return tempNode;
			}
			tempNode = tempNode.getNext();
		}
		return null;
	}
	
	
	public String printMyNodes() {
		return "My Nodes: "+head;
	}
	
}


