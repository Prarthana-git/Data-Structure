package com.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Utility {
	BufferedReader value;
	//constructor to initialize bufferedReader
public Utility(){
	value = new BufferedReader(new InputStreamReader(System.in));
}
	//Take Integer Input
		public int inputInteger(){
			try{
				try{	
					return Integer.parseInt(value.readLine());
				}
				catch(NumberFormatException e){
					System.out.println(e.getMessage());	
				}
			}catch(IOException e){
				System.out.println(e.getMessage());
			}
			return 0;
		}

		//take input word
		public String inputString(){
			try{
				return value.readLine();
			}
			catch(IOException ioe){
				System.out.println(ioe.getMessage());
			}
			return "";
		}

}
