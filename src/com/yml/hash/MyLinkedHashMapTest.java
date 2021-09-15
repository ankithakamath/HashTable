package com.yml.hash;

public class MyLinkedHashMapTest {

	public static void findFrequency() {
		String sentance = "“Paranoids are not paranoid because they are paranoid but because "
				+ "they keep putting themselves deliberately into paranoid avoidable situations";
		MyLinkedHashMap<String,Integer> myLinkedHashMap = new MyLinkedHashMap<>();
		String[] words = sentance.toLowerCase().split(" ");
		for(String word : words) {
			Integer value = myLinkedHashMap.get(word);
			if(value == null) value = 1;
			else value = value + 1;
			myLinkedHashMap.add(word,value);
		}
		
		System.out.println(myLinkedHashMap);
		int f = myLinkedHashMap.get("paranoid");
		System.out.println("Frequency of word paranoid is "+f);
	}
	
	public static void main(String[] args) {
		findFrequency();
		
	}


}