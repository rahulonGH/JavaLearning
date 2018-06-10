package git.Learning;

public class OneLineProgram {
	public static void main(String[] args) {
		System.out.println("Online\nProgram!!");
		System.out.print("\"Hard\tcafe\"");
		int x=10;
		byte b = 20;
		float f = 10.3f;
		System.out.println("\n"+x +"----"+b);
		x=b; //automatic/implicit type conversion
		System.out.println("\n"+x +"----"+b);
		x=(int)f; //explicit casting / type conversion
	}
}
