package git.Learning;

import java.io.Serializable;

class A33{
	public interface NestedInterface{
		boolean isNegative(int x);
	}
}

class B33 implements A33.NestedInterface{

	@Override
	public boolean isNegative(int x) {
		if(x==0)
			return true;
		return (x<0) ? true : false;
	}
}
class C33 extends B33 implements A33.NestedInterface,Serializable
{
	
}

public class NestedinterfaceTest {

	public static void main(String[] args) {
		
		A33.NestedInterface a33NI = new B33();
		if(a33NI.isNegative(100))
			System.out.println("it is positive.");
		else
			System.out.println("it greated than than 0");
		if(a33NI.isNegative(0))
			System.out.println("it is positive..");
		if(a33NI.isNegative(-100))
			System.out.println("it is negative");
	}

}
