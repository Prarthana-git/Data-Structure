package com.LinkedList;

public class MyLinkedList<T> {
	public INode<T> head;
	public INode<T> tail;

	public MyLinkedList() {
		this.head=null;
		this.tail=null;
	}
	//Add First
	public void add(INode newNode)
	{
		if(this.tail==null)
		{
			this.tail=newNode;
		}
		if(this.head==null)
		{
			this.head=newNode;
		}else {
			INode tempNode=this.head;
			this.head=newNode;
			this.head.setNext(tempNode);
		}
	}
  
	
	public void printMyNodes()
	{
		INode tempNode=head;
		StringBuffer displayNode=new StringBuffer("My Nodes:");
		while(tempNode.getNext()!=null)
		{
			    displayNode.append(tempNode.getKey());
			    if(!tempNode.equals(tail))
				displayNode.append("->");
				tempNode=tempNode.getNext();
			}
			displayNode.append(tempNode.getKey());
			System.out.println(displayNode);
		}
	}

