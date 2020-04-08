
class MyThread extends Thread{
	
	public MyThread(String name) {
		super(name);
	}
	
	//override the run() method represents the task to be executed inside a thread
	public void run() {
		System.out.println("This is " + getName());
		for(int i=1; i<=10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("i = " + i);
		}
	}
}

class MyThread2 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("This is " + Thread.currentThread().getName());
		for(int a=1; a<=10; a++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("\t\t a = " + a);
		}
	}
	
}



public class ThreadingDemo1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			MyThread t1 = new MyThread("T1");
			t1.start();
			
			MyThread2 task2 = new MyThread2();
			Thread t2 = new Thread(task2, "T2");
			t2.start();
			
			System.out.println("This is " + Thread.currentThread().getName());
			for(int j=1; j<=10; j++) {
				Thread.sleep(1000);
				System.out.println("\t j = " + j);
			}
	}

}
