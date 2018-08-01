package git.Learning;

import java.util.*;

public class HashTableExample {

	public static void main(String[] args) {
		
		Hashtable<String,String> ht = new Hashtable<String,String>();
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		
		ht.put("1", "One");
		ht.put("2", "Two");
		ht.put("3", "Three");
		ht.put("4", "Four");
		ht.put("4", "Four");

		hm.put(1, "One");
		hm.put(2, "Two");
		hm.put(3, "Three");
		hm.put(4, "Four");
		
		System.out.println(ht);
		System.out.println(hm);
		
		Set<String> keys = ht.keySet();
		for(String k : keys){
			System.out.println(ht.get(k));
		}
		
		for(Map.Entry<String,String> me: ht.entrySet()){
			System.out.println(me.getKey() + " # "+me.getValue());
		}
		
		for(Map.Entry<Integer,String> me: hm.entrySet()){
			System.out.println(me.getKey() + " - "+me.getValue());
		}
		
	}

}
