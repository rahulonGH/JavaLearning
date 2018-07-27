package git.Learning;

import java.util.*;

public class LinkedListPractice {

	public static void main(String[] args) {
		
		LinkedList<String> llist = new LinkedList<String>();
		llist.add("RAM");
		llist.add("SHYAM");
		llist.add("sonu");
		llist.add("geeta");
		llist.add("Seeta");
		llist.add("sweety");
		llist.add("titu");
		llist.add("harpreet");
		llist.set(0, "RAHUL");
		llist.removeLast();
		System.out.println("Peek: "+llist.peek());
		System.out.println("Poll: "+llist.poll());
		//System.out.println(llist);
		llist.addLast("Harpreet");
		//System.out.println(llist.getLast());
			Collections.swap(llist, 0, 2);
		//System.out.println(llist);
		ListIterator<String> lIt =   llist.listIterator(llist.size());
		/*while(lIt.hasPrevious())
		{
			System.out.println(lIt.previous());				
		}*/
		
		LinkedList<String> llist1 = new LinkedList<String>();
			llist1.addAll(llist);
			System.out.println(llist1.size());
			System.out.println(llist1);
			llist.set(4, "Deepak");
			
			for(String str:llist1){
				System.out.println(llist.contains(str)?"YES":"NO");
			}
			
			
		Vector v = new Vector();
		v.add("RAJU");
		v.add("X");
		v.add("Y");
		System.out.println(v);
		}

}
