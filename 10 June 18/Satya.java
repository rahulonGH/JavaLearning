package git.Learning;

public class Satya {

	public static void main(String[] args) {
		int $age$;
		String _name;
		String _NAME;
		double cost2Company;
		//int 2tt; //compilation error- identifiers should not start with numeric value
		
		//Arrays  syntax:  type variblename [] = new type[size];
		
		int array[] = new int[20]; // 1-D array having 1 row only 
		boolean bArray[] = new boolean[2];
		
		array[0]=10;
		array[1]=20;
		bArray[0]= true;
		bArray[1]= false;
		
		System.out.println("1-D array:: "+ array[0]+" "+array[1]);
		System.out.println("1-D array:: "+ bArray[0]+" "+bArray[1]);
		
		
		int twoDArr[][] = new int[3][4];  //2-D array have row as well as column index; like a matrix
		twoDArr[0][0]=100;
		twoDArr[0][1]=200;
		System.out.println("2-D array:: "+ twoDArr[0][0]+" "+twoDArr[0][1]);
		
	}
	

}
