package com.LinkedList;

import java.util.ArrayList;

public class MyLinkedHashMap<T, V> {

	private final int numBuckets;
	ArrayList<MyLinkedList<T>> myBucketArray;

	public MyLinkedHashMap() {
		this.numBuckets = 10;
		this.myBucketArray = new ArrayList<>(numBuckets);

		for (int i = 0; i < numBuckets; i++) {
			this.myBucketArray.add(null);
		}
	}

	private int getBucketIndex(T key) {
		int hashcode = Math.abs(key.hashCode());
		int index = hashcode % numBuckets;
		return index;
	}

	public V get(T key) {
		int index = this.getBucketIndex(key);
		MyLinkedList<T> myLinkedList = this.myBucketArray.get(index);
		if (myLinkedList == null) {
			return null;
		}
		MyMapNode<T, V> myMapNode = (MyMapNode<T, V>) myLinkedList.search(key);
		return (myMapNode == null) ? null : myMapNode.getValue();
	}
	public void add(T key,V value)
	{
		int index=this.getBucketIndex(key);
		MyLinkedList<T>myLinkedList=this.myBucketArray.get(index);
		if(myLinkedList==null)
		{
			myLinkedList=new MyLinkedList<>();
			this.myBucketArray.set(index, myLinkedList);
		}
		MyMapNode<T,V> myMapNode = (MyMapNode<T, V>) myLinkedList.search(key);
        if (myMapNode == null){
            myMapNode = new MyMapNode<>(key,value);
            myLinkedList.append(myMapNode);
        }else {
            myMapNode.setValue(value);
        }
	}

	  public String toString(){
	        return "MyLinkedHashMap List{" + myBucketArray+ "}";
	    }
}
