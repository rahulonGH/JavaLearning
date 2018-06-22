package git.Learning;

class firstException extends Exception{
	int val;
	String vendorname;
	firstException(int x){
		val=x;
		vendorname="ABCDEF";
	}
	public String toString(){
		return " firstException val = "+val;
	}
}

public class UserDefinedExceptionEx {
	
	public static void invoke(int z)
	{
		System.out.println("invoke called :: "+z);
		if(z>10){
			try {
				throw new firstException(z);
			} catch (firstException e) {
				System.out.println("firstException Caught..!"+e.toString());
			}
		}
		System.out.println("Normal end of invokeException");
	}

	public static void main(String[] args) {
		try{
			invoke(100);
		}/*catch(firstException fe){
			//this will be unreachable
		}*/
		finally{
			System.out.println("Finally");
		}
	}
}