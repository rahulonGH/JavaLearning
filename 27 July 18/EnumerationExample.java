package git.Learning;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class EnumerationExample {
	public static void main(String[] args) {
		Enumeration daysOfWeek;
		
		//List<String> list = new ArrayList<String>();
		Vector list = new Vector();
		list.add("Sunday");
		list.add("Monday");
		list.add("Tuesday");
		list.add("Wedday");
		list.add("Thursday");
		list.add("Friday");
		list.add("Saturday");
		daysOfWeek = list.elements();
		while(daysOfWeek.hasMoreElements()){
			System.out.println(daysOfWeek.nextElement());
		}
	}
}
