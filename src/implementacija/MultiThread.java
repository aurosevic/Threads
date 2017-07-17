package implementacija;

public class MultiThread {

	public static void main(String[] args) {
	
		Runnable a = new A();
		Runnable b = new B();
		
		Thread t1 = new Thread(a);
		Thread t2 = new Thread(b);
		
		t1.start();
		t2.start();
	}
}