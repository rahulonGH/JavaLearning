package git.Learning;

class A11{
	 static int a1cnt=0;
	 A11(){
		 this(new B1());
		 System.out.println("conter :"+a1cnt);
		 a1cnt++;
		 
	 }
	 
	 A11(int x){
	  this();   ///constructor chaining i.e calling default constructor from parameterized constructor or vice versa ... this() should be the first line of constructor
	  System.out.println("HI");
	 }
	 A11(B1 b1){
		System.out.println("### "+b1.x); 
	 }
	void method1(A11 this){
		System.out.println("HELLO");
	}
 }

class B1{
	int x=1000;
	A11 a13 = new A11(this);   //this is used as parameter to a constructor
}

public class Cchaining {

	public static void main(String[] args) {
			A11 a11 = new A11(10);
			A11 a12 = new A11();
			a12.method1();
			B1 b = new B1();
		}

}
