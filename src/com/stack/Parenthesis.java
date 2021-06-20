package com.stack;

/**
*Created by: Prarthana Chaudhari
*Purpose:read an Arithmetic Expression eg.(8+1)∗(4-2)/(4+1)
*Ensure parentheses must appear in a balanced or not.
**/
public class Parenthesis {
	public static void main(String args[])
	{
		Utility input=new Utility();
		System.out.println("Enter size");
		int no=input.inputInteger();
		
		/* Creating Stack */
		Stack stack = new Stack(no);
		System.out.println();
		System.out.println("Parenthesis Matching");
		System.out.println();
		 

		/* Accepting expression */
		System.out.println("Enter expression: ");
		String exp = input.inputString();        
		int len = exp.length();
		System.out.println("Matches and Mismatches: ");

		for (int i = 0; i < len; i++)
		{    
		char ch = exp.charAt(i);

			if (ch == '(')
			{
			stack.push(i);
			}
				else if (ch == ')')
				{
					try
					{
					long p = (stack.pop() + 1);
					System.out.println("')' at index "+(i+1)+" matched with '(' at index "+p);
					}
					catch(Exception e)
					{
					System.out.println("')' at index "+(i+1)+" is unmatched");
					}
				}            
			}
		while (!stack.isEmpty() )
		{
		System.out.println("'(' at index "+(stack.pop() +1)+" is unmatched");
		}                          
    }
	}


