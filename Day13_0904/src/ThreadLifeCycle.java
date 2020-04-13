
public class ThreadLifeCycle {

	public static void main(String[] args) {
		 RunnableDemo target1 = new RunnableDemo("T1");
		 
		 System.out.println("\n\t T1 = " + target1.thread.getState());
		 target1.start();
		 
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 System.out.println("\n\t T1 = " + target1.thread.getState());
		 try {
				target1.thread.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 System.out.println("\n\t T1 = " + target1.thread.getState());

		 target1.start();
	}

}
