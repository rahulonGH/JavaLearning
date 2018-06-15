package git.Learning;

class A12{
	int a,b;
	A12(){
		a=10;
		b=20;
	}
	A12(int x, int y){
		a=x;
		b=y;
	}
}
class B12 extends A12{
	int c;
	B12(){};
	B12(int x,int y){
		super(x,y);
		c=30;
	}
	B12(int x,int y,int z){ //constructor overloading
		super();
		c=z;
	}
	void getB12(){
		System.out.println(a+" "+b+" "+c);
	}
}
class C12 extends B12{
	C12(){
		super.getB12();
	}
}

public class SuperEx {
	public static void main(String a[]){
		B12 b12 = new B12(45,98,100);
		b12.getB12();
		C12 c12 = new C12();
	}
}
