
public class ThreadDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Main thread starts....");
		
		RunnableDemo target1 = new RunnableDemo("T1");
		RunnableDemo target2 = new RunnableDemo("T2");
		
		try {
			Thread.sleep(3000);
			
			target1.thread.interrupt();
			
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			//System.out.println("T1 is interrupted");
		}
		
		
		
		
		

		System.out.println("Main thread Ends....");

	}
}
