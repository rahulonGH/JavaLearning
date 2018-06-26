package git.Learning;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UserInput {

	public static void main(String a[]) throws IOException{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = sc.nextLine();
		System.out.println("your name is : "+name);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Address: ");
		String brStr = br.readLine();
		System.out.println("Address = "+brStr);
		
		/*System.out.println("Enter Password: ");
		String conStr = System.console().readLine();
		System.out.println("Password : "+conStr);
		
		NOT SUPPORTED BY IDEs*/
	}
}
