package git.Learning;

import java.util.*;

public class QueueExample {

	public static void main(String[] args) {
		Queue<String> q = new PriorityQueue<String>();

		q.add("Task1");
		q.add("Task4");
		q.add("Task2");
		q.add("Task3");
		q.add("Task5");
		
		Iterator it = q.iterator();
				while(it.hasNext()){
					System.out.println(it.next());
				}
		
	}

}
