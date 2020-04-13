
public class RunnableDemo implements Runnable {

	private String tName;
	public Thread thread;
	
	public  RunnableDemo(String name) {
		this.tName = name;
		thread = new Thread(this);
		
	}
	
	public void start() {
		thread.start();
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(this.tName + " started...");
		System.out.println("T1 State = " + Thread.currentThread().getState());
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(tName + " interrupted");
		}
		
		
		for(int i=1; i<=5;i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println(tName + " interrupted");
			}
			System.out.println(this.tName + " : " + i);
		}
		System.out.println(this.tName + " Ended...");
	}

}
