package lambdaExpession;

public class MultiThread {

	public static void main(String[] args) {

		Runnable a = () -> {
			for(int i = 0; i < 4; i++) {
				System.out.println("A");
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		Runnable b = () -> {
			for(int i = 0; i < 4; i++) {
				System.out.println("B");
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		Thread t1 = new Thread(a);
		Thread t2 = new Thread(b);
		t1.start();
		t2.start();

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