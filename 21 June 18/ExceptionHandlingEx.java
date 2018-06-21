package git.Learning;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;


public class ExceptionHandlingEx {

	public static void main(String[] args) {
			BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
			try{
			System.out.println("Enter Address 1: ");
			try{
				String brStr1 = br1.readLine();
					try{
						File f = new File("D:\rahul.txt");
					}catch(NullPointerException e){
						
					}
			}catch(IOException e){
				System.out.println(e.getMessage());
			}
			try{
			System.out.println(10/0);  ///runtime exception point
			}catch(ArithmeticException e){
				System.out.println(e.getMessage());
			}
			
			System.out.println("RAHUL");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter Address 2: ");
			
			try{
				String brStr = br.readLine();
			}catch(IOException e){
				System.out.println(e.getMessage());
			}
			}
			catch(Exception e){
				try{
					System.out.println(100/0);
				}catch(ArithmeticException ae){
					System.out.println(e.getMessage());
					System.out.println("try within catch");
				}
				
			}
			finally{
				try{
					System.out.println(45/0);
				}finally{
					System.out.println("nested finally");
				}/*catch(Exception e){
					
				}*/
			}
			
		
		System.out.println("END");
	}

}
