package com.LinkedList;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class MyHashMapTest {
	

	@Test
	 public void givenSentenceWhenWordsAreAddedToListShouldReturnFrequency(){
    String sentence="To be or not To be";
    MyHashMap<String,Integer>myHashMap=new MyHashMap<>();
    String[] words=sentence.split("");
    for(String word : words) {
    	Integer value=myHashMap.get(word);
        if(value==null) {
        	value=1;
        }else {
        	value=value+1;
        	myHashMap.add(word, value);
        }
        int frequency=myHashMap.get("To");
        System.out.println(myHashMap);
        assertEquals(2, frequency);
    }
    }
}
