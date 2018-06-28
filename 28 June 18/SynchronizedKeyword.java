package git.Learning;

class SeviceProvider {
	static int CNTR=0;
	void doService(String instruction) {
		System.out.print("<<<< doService instruction :: " + instruction);
		try {
			CNTR++;
			Thread.sleep(500);
		} catch (InterruptedException e) {
			System.out.println("InterruptedException in serviceMethod");
		}
		System.out.println(" >>>>"+CNTR);
	}
	synchronized void _doService(String instruction) {
		System.out.print("*** _doService instruction :: " + instruction);
		try {
			CNTR++;
			Thread.sleep(600);
		} catch (InterruptedException e) {
			System.out.println("InterruptedException in serviceMethod");
		}
		System.out.println(" ***"+CNTR);
	}
}

class ServiceConsumer implements Runnable {
	Thread thrd;
	String instruction;
	SeviceProvider sProvider;

	public ServiceConsumer(SeviceProvider tmpObj, String str) {
		instruction = str;
		sProvider = tmpObj;
		thrd = new Thread(this);
		thrd.start();
	}
	// doService() method will get synchronized calls i.e only one thread can have the lock over doService() method at a time
	public void run() {
		synchronized (sProvider) { // synchronized block
			sProvider.doService(instruction);
			sProvider._doService(instruction);
		}
		//sProvider._doService(instruction);
		//sProvider.doService(instruction);
	}
}

public class SynchronizedKeyword {

	public static void main(String[] args) {
		SeviceProvider sProvider = new SeviceProvider();
		ServiceConsumer consumer1 = new ServiceConsumer(sProvider, "consumer1 instruction");
		ServiceConsumer consumer2 = new ServiceConsumer(sProvider, "consumer2 instruction");
		ServiceConsumer consumer3 = new ServiceConsumer(sProvider, "consumer3 instruction");
		/*ServiceConsumer consumer4 = new ServiceConsumer(sProvider, "consumer4 instruction");
		ServiceConsumer consumer5 = new ServiceConsumer(sProvider, "consumer5 instruction");
		ServiceConsumer consumer6 = new ServiceConsumer(sProvider, "consumer6 instruction");
		ServiceConsumer consumer7 = new ServiceConsumer(sProvider, "consumer7 instruction");*/
		
		
		// joining the threads
		try {
			consumer1.thrd.join();
			consumer2.thrd.join();
			consumer3.thrd.join();
		} catch (InterruptedException e) {
			System.out.println("InterruptedException while joining threads");
		}
		System.out.println("MAIN ENDS");
	}

}
