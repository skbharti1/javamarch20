import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Account {
	
	private int balance = 0;
	
	public Account(int balance) {
		this.balance = balance;
	}
	
	public void withdraw(int amount) {
		this.balance = this.balance - amount;
	}
	
	public void deposit(int amount) {
		this.balance = this.balance + amount;
	}
	
	public int getBalance() {
		return this.balance;
	}
	
}

class Bank{
	
	private Account[] accounts;
 	
	public Bank() {
		
 		
		accounts = new Account[10];
		for(int i=0; i<accounts.length; i++) {
			accounts[i] = new Account(100);
		}
	}
	
	public int getTotalBankBalance() {
		int sum =0;
		for(int i=0;i<accounts.length;i++) {
			sum = sum + accounts[i].getBalance();
		}
		return sum;
	}
	
	
	public synchronized void transfer(int from, int to, int amount) {
	
		
		if(amount <= accounts[from].getBalance()) {
			accounts[from].withdraw(amount);
			accounts[to].deposit(amount);
			System.out.println(amount  + " is transfered from account #" + from + " to Account #" + to + " Total Bank Balance = " + getTotalBankBalance());
		}
		
		
	}
}


class Transaction implements Runnable{

	private Bank bank;
	private int fromAccount;
	
	public Transaction(Bank bank, int fromAccount) {
		this.bank = bank;
		this.fromAccount = fromAccount;//2
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			System.out.println("["+ Thread.currentThread().getName() +"] starts transferring amount....");

			
			
			int toAccount = (int) (Math.random() * 10);  //
			
			if(toAccount == fromAccount)
				continue;
			
			int amount = (int)(Math.random() * 100);  //0 - 99
			
			if(amount == 0) continue;
			
			bank.transfer(fromAccount, toAccount, amount);
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("["+ Thread.currentThread().getName() +"] ends transferring amount....");
		}
		
		
	}
}


public class SynchronizationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank bank = new Bank();		//single resource

		//t1  t2  t3  t4   t5 t6 ... t10
		for(int i=0; i<10; i++) {
			Thread t = new Thread(new Transaction(bank, i), "T" + (i+1));
			t.start();
		}
		
	}

}
