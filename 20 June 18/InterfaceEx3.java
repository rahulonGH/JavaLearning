package git.Learning;

import java.util.Random;

interface BizConstants{
	//public,static and final variable by default
	int COMPLETED = 1;  
	int REJECTED = 0;
	int PARKED = 2;
	int SENTFORVENDOR =3;
}

class Check implements BizConstants{
	Random r = new Random();
	int check(){
		int decision = r.nextInt(100);
		if(decision < 30)
			return PARKED;
		if(decision < 50)
			return SENTFORVENDOR;
		if(decision < 90)
			return REJECTED;
		if(decision<99)
			return COMPLETED;
		return 1000; 
			
	}
}

public class InterfaceEx3 {

	public static void main(String[] args) {
		Check ch = new Check();
		int c = ch.check();
		switch(c){
			case 0: System.out.println("REJECTED"); break;
			case 1: System.out.println("COMPLETED"); break;
			case 2: System.out.println("PARKED"); break;
			case 3: System.out.println("SENTFORVENDOR"); break;
			default:System.out.println("Something went unexpected..!!!");
		}
	}
}
