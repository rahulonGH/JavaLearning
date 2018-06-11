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
			if(initialVal==5){
				continue;
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
		
		System.out.println("End of program");
		
		
	}

}
