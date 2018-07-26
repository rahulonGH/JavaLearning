package git.Learning;

import java.util.*;

public class HashSetExample {

	public static void main(String[] args) {
		int[] elements = {1,1,8,40,10,52};
		Set<Integer> s = new HashSet<Integer>();
		Set<Integer> ls = new LinkedHashSet<Integer>();
		for(int i=0;i<elements.length;i++){
			s.add(elements[i]);
			ls.add(elements[i]);
		}
		s.add(null); ls.add(null);  		//HashSet and LinkedHashSet allows null element
		System.out.println(s+"   "+ls);
		System.out.println(s.hashCode());
		System.out.println(ls.hashCode());
		System.out.println(s.equals(ls));
		Iterator it = s.iterator();
		System.out.println("========Iterator Starts======");
		while(it.hasNext())
			System.out.println(it.next());
		System.out.println("========Iterator Ends======");
		s.remove(null); // TreeSet doesn't Allow null element hence removing null element before adding the set to TreeSet
		TreeSet sortedSet = new TreeSet<Integer>(s);
		sortedSet.add(12);
		System.out.println(sortedSet);
		System.out.println("First and last element of sorted set: "+sortedSet.first()+","+sortedSet.last());
	}

}
