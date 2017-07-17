package waitNotify;

class Producer implements Runnable {

	Number n;
	
	public Producer(Number n) {
		this.n = n;
		Thread t = new Thread(this);
		t.start();
	}
	
	@Override
	public void run() {
		int i = 0;
		while(true) {
			n.set(i++);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}