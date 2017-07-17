package lambdaExpession;

public class MultiThread {

	public static void main(String[] args) {

		Runnable a = () -> {
			for(int i = 0; i < 4; i++) {
				System.out.println("A " + Thread.currentThread().getPriority());
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		Runnable b = () -> {
			for(int i = 0; i < 4; i++) {
				System.out.println("B " + Thread.currentThread().getPriority());
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		//	Creating threads and naming them
		Thread t1 = new Thread(a);
		t1.setName("aThread");
		Thread t2 = new Thread(b, "bThread");
		
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		
		//	Setting threads priority 
		t1.setPriority(1);
		t2.setPriority(Thread.MAX_PRIORITY);
		
		t1.start();
		t2.start();

		//	Checking if threads are alive
		System.out.println(t1.isAlive() + " " +t2.isAlive());
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(t1.isAlive() + " " +t2.isAlive());
	}
}