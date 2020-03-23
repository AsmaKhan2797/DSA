package test.java.multithread;

public class MyThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A aa = new A();
		B bb = new B();
		aa.start();
		
//Thread tt = new Thread(aa);
Thread bt = new Thread(bb);
		bt.start();
		// bb.stop();
		//tt.start();
	}

}

/*
 * class A extends Thread{ public void run() { for(int i =0;i<10;i++)
 * System.out.println("Inside A..."); } } class B extends Thread{ public void
 * run() { for(int i =0;i<10;i++) System.out.println("Inside B..."); } }
 */

class A  extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Inside A..."+i);
				try {if(i==5)
					sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
			System.out.println("Inside A...");
	}
}

class B implements Runnable{
	public void run() {
		for (int i = 0; i < 10; i++)
			System.out.println("Inside B...");
	}
}