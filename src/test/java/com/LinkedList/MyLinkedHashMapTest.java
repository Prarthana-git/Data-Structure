package com.LinkedList;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MyLinkedHashMapTest {

	 @Test
	    public void givenSentence_WhenWordsAreAddedToList_ShouldReturn_WordFrequency() {
	        String sentence = "Paranoids are not paranoid because they are paranoid but " +
	                "because they keep putting themselves " +
	                "deliberately into paranoid avoidable situations";
	        MyLinkedHashMap<String, Integer> myLinkedHashMap = new MyLinkedHashMap<>();
	        String[] words = sentence.toLowerCase().split(" ");
	        for (String word : words) {
	            Integer value = myLinkedHashMap.get(word);
	            if (value == null)
	                value = 1;
	            else
	                value = value + 1;
	            myLinkedHashMap.add(word, value);
	        }
	        System.out.println(myLinkedHashMap);
	        int frequency = myLinkedHashMap.get("paranoid");
	        assertEquals(3,frequency);
	    }
}
