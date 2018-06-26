package git.Learning;

// can we start a thread twice?
// NO, IllegalThreadState exception
public class ThredStateExample extends Thread{
	public static void main(String[] args) {
		ThredStateExample t =new ThredStateExample();
		t.start();
		//t.start();
	}

	@Override
	public void run() {
		System.out.println("Running from run()");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("thread is going to terminate");
	}
}
