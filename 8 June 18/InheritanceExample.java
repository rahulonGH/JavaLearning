package git.Learning;

class A{ // Super class
	int a;
	int b;
	A(){
		
	}
	void show(){
		System.out.println("showAB= "+a+" "+b);
	}
}
class B extends A{ //Subclass......
	int c=0;
	void get(){
		System.out.println("Show ABC: "+a+" "+" "+b+" "+c);
	}
	void sum(int x, int y, int z){
		int sum=0;
		sum = x+y+z;
		System.out.println("SUM: "+sum);
	}
}
class C extends B{
	
}

public class InheritanceExample {
	public static void main(String a[]){
		A obj1 = new A();
		B obj2 = new B();
		
		obj1.a = 10;
		obj1.b = 20;
		obj1.show();
		obj2.c = 30;
		obj2.a = 5;
		obj2.b = 4;
		
		obj2.get();
		obj2.sum(obj2.a,obj2.b,obj2.c);
	}
}
