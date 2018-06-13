package git.Learning;

public class ControlStatments {

	public static void main(String[] args) {
		int age=10;
		String place="Hyderabad";
		
		if(age>=18){ //if statement to check one or more conditions
			System.out.println("you can vote!!");
		}
		if(age>18 || place=="Hyderabad"){	//if statement to check one or more conditions
			System.out.println("you can vote from hyderabad");
		}
		
		
		if(age>=18){ //if statement to check one or more conditions
			System.out.println("Sure! you can vote.");
		}
		else
		{
			System.out.println("You can't Vote!!");
		}
		
		
		
		
		if(age>=18){ //if statement to check one or more conditions
			System.out.println("Sure! you can vote.");
		}
		else if(place=="Hyderabad"){
			System.out.println("we got! you r from hyderabad");
		}
		else
		{
			System.out.println("You can't Vote!!");
		}
		
		
		if(age>=10){
			
			if(place=="Hyderabad"){ /// NESTED IF
					System.out.println("u r 18 and from Hyderabad");
			}
		}
		
		
		switch(age){
		case 10: if(age<18){
						
				 }
					System.out.println("your age is 10"); 
					break;	//continue;
		case 18: System.out.println("you are 18"); 
					break;
		case 60: System.out.println("u r senior citizen"); 
					break;
		default: System.out.println("no case match.!! this is default statement");
		}
		
		
		
		int initialVal=0;
		
		for(initialVal=1;initialVal<=10;initialVal++){
			for(int x=0; x<100;x++){
				System.out.println(x);
				continue;
			}
			if(initialVal==2){
				break;
			}
			System.out.println(initialVal);
		}
		initialVal=100;
		while(initialVal>50){
				System.out.println("RAMA "+initialVal);
			initialVal--;
			//--initialVal;
		}
		
		
		initialVal=0;
		do{
			System.out.println("SITA "+initialVal);
			initialVal++;
		}while(initialVal<50);
		
		double values[][] = { { 0*0, 1*0, 2*0, 3*0 },  { 0*1, 1*1, 2*1, 3*1 },  { 0*2, 1*2, 2*2, 3*2 } };
		int val[][] = new int[4][4];
		
		for(int row=0;row<3;row++){
			
			for(int col=0;col<3;col++){
				System.out.print(values[row][col]);
				System.out.print("  ");
			}
			System.out.println();
		}
		int counter=0;
		//inserting vaules in array
		for(int row=0;row<4;row++){
			
			for(int col=0;col<4;col++){
				val[row][col] =  counter++;
			}			
		}
		//Displaying values from array
		for(int row=0;row<4;row++){
			
			for(int col=0;col<4;col++){
				System.out.print(val[row][col]);
				System.out.print("\t");
			}
			System.out.println();
		}		
		
		System.out.println("########## End of Main() ###############");	
	}

}
