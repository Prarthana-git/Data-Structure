package com.LinkedList;

public class MyMapNode<T,V>implements INode<T> {

	private  T Key ;
    private  V Value;
    MyMapNode<T,V> next;
    
	public MyMapNode(T key, V value) {
		Key = key;
		Value = value;
		this.next = null;
	}

	@Override
	public T getKey() {
		
		return Key;
	}

	@Override
	public void setKey(T key) {
	this.Key=Key;
		
	}

	@Override
	public INode getNext() {
		return next;
	}

	@Override
	public void setNext(INode next) {
	this.next=(MyMapNode<T, V>) next;
	}
	 public V getValue() {
	        return this.Value;
	    }

	    public void setValue(V value) {
	        this.Value = value;
	    }

	@Override
	public String toString() {
		StringBuilder myMapNodeString=new StringBuilder();
		myMapNodeString.append("MyMapNode{"+"K=").append(Key).append("V=").append(Value).append("}");
		if(next!=null)
			myMapNodeString.append("->").append(next);
		return myMapNodeString.toString();
	}
	

}
