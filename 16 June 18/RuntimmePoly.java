package git.Learning;

class A22{
	int i,j;
	A22(){}
	A22(int a,int b){
		i=a;
		j=b;
	}
	void m1(){
		System.out.println("i , j = "+i+","+j);
	}
	final int calculate(){
		return i+j;
	}
}
class B22 extends A22{
	int x;
	final int y=0;
	B22(){}
	B22(int x, int b, int c){
		super(x,b);
		this.x=c;
	}
	void m1(){
		System.out.println("x = "+x);
		//y++; ///final variable is a named constant.
	}
	/*int calculate(){
		//Cannot override the final method from A22
	}*/
}

public class RuntimmePoly {

	public static void main(String[] args) {
		A22 a22 = new A22(12,12);
		//B22 b22 = new B22();
		
		//a22.m1();
		//b22.m1();
		A22 supref;
		supref=a22;
		supref.m1();	//this is euals to a22.m1(); 
		
		supref = new B22(12,548,45);  // upcasting
		supref.m1();
		
	}
}
