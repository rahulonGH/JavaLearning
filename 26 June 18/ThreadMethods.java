package git.Learning;

public class ThreadMethods extends Thread{

	public static void main(String[] args) {
		ThreadMethods th = new ThreadMethods();
		System.out.println(th);
		System.out.println(th.getName());
		th.setName("RAHUL THREAD");
		System.out.println(th.getName());
		th.setPriority(MAX_PRIORITY);
		System.out.println(th.getPriority());
		System.out.println("th id: "+th.getId());
		ThreadMethods th1 = new ThreadMethods();
		System.out.println("th1 Id: "+th1.getId());
		th.start();
		try {
			th.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		th1.start();		
	}
	public void run(){
		try {
			for(int x=1;x<=10;x++)
			{
				System.out.println("10*x : "+(10*x));
				Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
