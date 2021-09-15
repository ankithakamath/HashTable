package com.yml.hash;


	public class MyMapNode<K,V> implements INode<K> {
		
		K key;
		V value;
		MyMapNode<K,V> next;
		
		public MyMapNode(K key,V value) {
			this.key = key;
			this.value = value;
			next = null;
		}
		@Override
		public K getKey() {
			// TODO Auto-generated method stub
			return key;
		}

		@Override
		public void setKey(K key) {
			// TODO Auto-generated method stub
			this.key = key;
			
		}

		@Override
		public INode<K> getNext() {
			// TODO Auto-generated method stub
			return next;
		}

		@Override
		public void setNext(INode<K> next) {
			// TODO Auto-generated method stub
			this.next = (MyMapNode<K,V>) next;
			
		}
		
		public V getValue() {
			return this.value;
		}
		
		public void setValue(V value) {
			this.value = value;
		}
		
		public String toString() {
			StringBuilder myMapNodeString = new StringBuilder();
			myMapNodeString.append("MyMapNode{" + "key= ").append(key)
			.append(", Value = ").append(value).append('}');
			if(next != null) {
				myMapNodeString.append("->").append(next);
			}
			return myMapNodeString.toString();
		}

	}

