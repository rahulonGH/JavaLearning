package git.Learning;

import java.util.*;

class Students{
	int roll;
	String Name;
	String school;
	Students(){		
	}
	Students(int x, String y, String z){
		this.roll=x;
		this.Name=y;
		this.school=z;			
	}
	void get(){
		System.out.println("Roll: "+roll+" Name: "+Name+" School: "+school);
	}
}

public class CollectionPractice {
		
	public static void main(String[] args) {
		Students s1 = new Students(1,"Rahul","ITSVM");
		Students s2 = new Students(2,"Mohit","NVN");
		
		ArrayList alist =new ArrayList(); //non-generic
		alist.add(s1);
		alist.add(s2);
		//s1.get();
		//s2.get();
		int c=0;
		for(Object s:alist){			
			Students obj =(Students)alist.get(c);
			obj.get();
			c++;
		}
		System.out.println("-------------------------------");
		ArrayList<Students> al = new ArrayList<Students>(); //generic style
	
		al.add(s2);
		al.add(s1);
		al.add(s1);
		
		Iterator itr = al.iterator();
		while(itr.hasNext()){
			Students obj =(Students)itr.next();
			obj.get();
			//System.out.println(itr.next());
		}
		
	}

}
