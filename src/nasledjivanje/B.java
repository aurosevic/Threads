package nasledjivanje;

public class B extends Thread {

	public void show() {
		for(int i = 0; i < 4; i++) {
			System.out.println("Class B");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	@Override
	public void run() {
		show();
	}
}