package com.yml.hash;

public class MyHashMapTest {
	
		
		public static void findFrequency() {
			String sentence = "To be or not to be";
			MyHashMap<String,Integer> myHashMap = new MyHashMap<>();
			String[] words = sentence.toLowerCase().split(" ");
			for(String word : words) {
				Integer value = myHashMap.get(word);
				if(value == null) value = 1;
				else value = value + 1;
				myHashMap.add(word,value);
				myHashMap.remove("avoidable", 1);
			}
			int f = myHashMap.get("be");
			System.out.println(myHashMap);

		}
		
		public static void main(String[] args) {
			findFrequency();
			
		}

	}

