package git.Learning;

class ThrdNew implements Runnable{
	String thName;
	Thread th;
	boolean suspensionFlag;
	
	public ThrdNew(String thName) {
		this.thName = thName;
		th = new Thread(this,thName);
		System.out.println("new born Thread: "+th);
		suspensionFlag = false;
		th.start();
	}
	@Override
	public void run() {
		try{
			for(int x=0;x<2;x++){
				System.out.println(thName+"::"+x);
				//Thread.sleep(500);
				synchronized(this){
					while(suspensionFlag){
						wait();
					}
				}				
			}
		}catch(InterruptedException ie){
			ie.printStackTrace();
		}
		System.out.println(thName+"--->RUN ENDS");
		
	}
	void doSuspend(){
		suspensionFlag=true;
	}
	synchronized void doResume(){
		suspensionFlag = false;
		notify();
	}
}

public class SuspendResumeTest {

	public static void main(String[] args) {
		ThrdNew obj1 = new ThrdNew("Thred1~~");
		ThrdNew obj2 = new ThrdNew("Thred2~~");
		try {
			System.out.println("Joining");
			obj1.th.join();
			obj2.th.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		try{
			Thread.sleep(1000);
			obj1.doSuspend();
			System.out.println("Thrad1 suspended");
			Thread.sleep(1000);
			obj1.doResume();
			System.out.println("Thrad1 resumed");
			Thread.sleep(1500);
			obj2.doSuspend();
			System.out.println("Thrad2 suspended");
			Thread.sleep(1500);
			obj2.doResume();
			System.out.println("Thrad2 resumed");
		}catch(InterruptedException ie){
			ie.printStackTrace();
		}	
		
		System.out.println("MAIN THREAD ENDS");
	}
}
