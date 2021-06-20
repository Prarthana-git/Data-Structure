package com.stack;

public class Stack {
	private int maxSize;
	private long[] Array;
	private int top;
	
	//for size
	public  Stack(int size)
	{
		maxSize=size;
		Array=new long[maxSize];
		top=-1;
	}
	//for push
	public void push(long j)
	{
		Array[++top]=j;
	}
	//for pop
	public long pop()
	{
		return Array[top--];
	}
	//for peek
	public long peek()
	{
		return Array[top];
	}
	//to check whether stack is empty
	public boolean isEmpty()
	{
	return (top == -1);
	}
	//to check whether stack is full	   
		public boolean isFull()
		{
		return (top == maxSize - 1);
		}
}
