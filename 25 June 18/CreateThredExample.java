package git.Learning;

class Process1 implements Runnable{
	Thread ownTh; //initializing an object of type Thread
	String nameOfThread;
	//Thread(Runnable runnnableObj, String threadName){}    
	//runnableObject is the instance of a class that is implemeting Runnable interface
	Process1(String nameOfThread){
		this.nameOfThread = nameOfThread;
		ownTh = new Thread(this,nameOfThread); //	NEW/READY state
		System.out.println("new born Thread:: "+ownTh); 
		ownTh.start();  //start will implicitly execute a call to run() method
		display();
	}
	@Override
	public void run() {
		// entry point of newly created thread.
		//Thread is now in running state
		
		try {
			for(int x=5;x>0;x--){
				System.out.println(this.nameOfThread+"-----"+x);
			Thread.sleep(5000);}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("END of "+this.nameOfThread);
	}
	void display(){
		System.out.println("diplay called..!");
	}
}

public class CreateThredExample {

	public static void main(String[] args) {
		new Process1("1stThread");   //anonymous object referencing
		new Process1("2ndThread");
		new Process1("3rdThread");
		Thread mainTh = Thread.currentThread();
		System.out.println("--Main Thead::"+mainTh);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("End of Main Thead::"+mainTh);
	}

}
