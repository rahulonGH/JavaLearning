package git.Learning;

import java.util.*;

public class HashTableExample {

	public static void main(String[] args) {
		
		Hashtable<String,String> ht = new Hashtable<String,String>();
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		LinkedHashMap<Integer,String> lhm = new LinkedHashMap<Integer,String>();
		TreeMap<Integer,String> tm = new TreeMap<Integer,String>();
		
		ht.put("1", "One");
		ht.put("2", "Two");
		ht.put("3", "Three");
		ht.put("4", "Four");
		ht.put("4", "Four");

		hm.put(1, "One");
		hm.put(2, "Two");
		hm.put(3, "Three");
		hm.put(4, "Four");
		
		lhm.put(1, "One");
		lhm.put(2, "Two");
		lhm.put(4, "Four");		
		lhm.put(3, "Three");
		
		tm.put(1, "One");
		tm.put(3, "Three");
		tm.put(4, "Four");		
		tm.put(2, "Two");
		
		System.out.println(ht);
		System.out.println(hm);
		System.out.println(lhm);
		System.out.println(tm);
		
		Set<String> keys = ht.keySet();
		for(String k : keys){
			System.out.println(ht.get(k));
		}
		System.out.println("==================");
		for(Map.Entry<String,String> me: ht.entrySet()){
			System.out.println(me.getKey() + " # "+me.getValue());
		}
		System.out.println("------------------");
		for(Map.Entry<Integer,String> me: hm.entrySet()){
			System.out.println(me.getKey() + " - "+me.getValue());
		}
		System.out.println("------------------");
		for(Map.Entry<Integer,String> me: lhm.entrySet()){
			System.out.println(me.getKey() + " - "+me.getValue());
		}
		System.out.println("------------------");
		for(Map.Entry<Integer,String> me: tm.entrySet()){
			System.out.println(me.getKey() + " - "+me.getValue());
		}
		
	}

}
