package com.bridgelabz.hashtable.node;

public class MyMapNode<K, V> implements INode<K> {

	K key;
	V value;
	MyMapNode<K, V> next;

	public MyMapNode(K key, V value) {
		this.key = key;
		this.value = value;
	}

	@Override
	public K getKey() {
		return key;
	}

	@Override
	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	@Override
	public INode<K> getNext() {
		return next;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void setNext(INode<K> next) {
		this.next = (MyMapNode<K, V>) next;
	}

	@Override
	public String toString() {
		StringBuffer strBuffer = new StringBuffer();
		strBuffer.append("MyNode{Key=" + key + ",Value="
				+ value + "}");
		if (next != null) {
			strBuffer.append("=>" + next);
		}
		return strBuffer.toString();
	}
}