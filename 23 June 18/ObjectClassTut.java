package git.Learning;

public class ObjectClassTut {
	public static void main(String[] args) {

		Object obj; //Object type reference
		obj = new RuntimeException();
		System.out.println(obj);
		obj = new String("RAHUL");
		System.out.println(obj);
		obj = new Exception();
		System.out.println(obj);
		
		Object xyz= new Object();
		xyz.equals(obj);
		
		System.out.println(xyz.getClass());

		System.out.println(xyz.hashCode());
		System.out.println(xyz);
		System.out.println((xyz.toString()));
	}
}
