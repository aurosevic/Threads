package waitNotify;

public class Number {

	int num;
	boolean value = false;
	
	public synchronized void set(int num) {
		while(value) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.num = num;
		System.out.println("Set: " + num);
		value = true;
		notify();
	}
	
	public synchronized void get() {
		while(!value) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Get: " + num);
		value = false;
		notify();
	}
}