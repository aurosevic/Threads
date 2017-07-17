package implementacija;

public class B implements Runnable {

	@Override
	public void run() {
		for(int i = 0; i < 4; i++) {
			System.out.println("B");
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}