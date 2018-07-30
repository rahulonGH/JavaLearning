package git.Learning;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		StudentPr comparator = new StudentPr();	
		
		StudentPr s1= new StudentPr(1,22,"Rahul");
		StudentPr s2= new StudentPr(4,2,"Ram");
		StudentPr s3= new StudentPr(3,25,"Raj");
		
		PriorityQueue<StudentPr> pq = new PriorityQueue<StudentPr>(comparator);
		pq.add(s1);
		pq.add(s2);
		pq.add(s3);
		
		System.out.println(pq);
		
		/*Iterator it = pq.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}*/
		while(!pq.isEmpty())
			System.out.println(pq.poll());

	}

}
