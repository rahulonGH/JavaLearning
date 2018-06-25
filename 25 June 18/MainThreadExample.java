package git.Learning;

public class MainThreadExample {
	public static void main(String[] args) {
		///Controlling main Thread
		Thread th = Thread.currentThread();
		System.out.println("MAIN THREAD: "+th);
		th.setPriority(th.MIN_PRIORITY);
		System.out.println("MAIN THREAD: "+th);
		th.setName("RAHUL");
		System.out.println("MAIN THREAD: "+th);
		th.setPriority(8);
		try {
			th.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("MAIN THREAD: "+th);
	}
}
