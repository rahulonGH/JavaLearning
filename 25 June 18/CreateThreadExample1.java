package git.Learning;

class Process2 extends Thread{
	Process2(){
		super("NEW BORN");
		System.out.println("child thread...!!");
		start();
	}
	@Override
	public void run() {
		// entry point of newly created thread.
		//Thread is now in running state
		try {
			for(int x=10;x>0;x--){
				System.out.println(x);
			Thread.sleep(1000);}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("END of NEW BORN");
	}
	void display(){
		System.out.println("diplay called-----!");
	}
}
public class CreateThreadExample1 {

	public static void main(String[] args) {
		new Process2();   //anonymous object referencing
		Thread mainTh = Thread.currentThread();
		System.out.println("--Main Thead::"+mainTh);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("End of Main Thead::"+mainTh);
	}

}
