package implementacija;

public class A implements Runnable {

	@Override
	public void run() {
		for(int i = 0; i < 4; i++) {
			System.out.println("A");
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}