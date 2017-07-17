package waitNotify;

class Consumer implements Runnable {

	Number n;
	
	public Consumer(Number n) {
		this.n = n;
		Thread t = new Thread(this);
		t.start();
	}
	
	@Override
	public void run() {
		while(true) {
			n.get();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}