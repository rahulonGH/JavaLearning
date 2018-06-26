package git.Learning;

public class RunDirectly extends Thread{

	public static void main(String[] args) {
		RunDirectly rd = new RunDirectly();
		RunDirectly rd1 = new RunDirectly();
		RunDirectly rd2 = new RunDirectly();
		rd.run();
		rd2.run();
		rd1.run();
	}
	
	@Override
	public void run() {
		System.out.println("Running..!!");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("thread is going to terminate");
	}
}
