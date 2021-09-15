package com.yml.hash;

public class MyHashMap<K,V > {
	
	MyLinkedList<K> myLinkedList;
	
	public MyHashMap() {
		this.myLinkedList = new MyLinkedList<>();
	}

	public void add(K key, V value) {
		MyMapNode<K,V> myMapNode = (MyMapNode<K,V>) this.myLinkedList.search(key);
		if(myMapNode == null) {
			myMapNode = new MyMapNode<>(key,value);
			this.myLinkedList.add(myMapNode);
		}else {
			myMapNode.setValue(value);
		}
	}

	public V get(K key) {
		MyMapNode<K,V> myMapNode = (MyMapNode<K,V>) this.myLinkedList.search(key);	
		return (myMapNode == null)?null : myMapNode.getValue();
	}
	public void remove(K key,V value)
	{
		System.out.println(key);
		MyMapNode<K,V> myMapNode=(MyMapNode<K,V>)this.myLinkedList.search(key);
		System.out.println(myMapNode);
		if(myMapNode!=null)
		{
			myMapNode=new MyMapNode<>(key,value);
			this.myLinkedList.delete();
			System.out.println("Deleted successfully");
		}
		else
		{
			System.out.println("Word not found.");
		}
	}
	
	public String toString() {
		return "MyHashNodes{" + myLinkedList.printMyNodes() + '}';
	}
		
}