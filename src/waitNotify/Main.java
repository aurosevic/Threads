package waitNotify;

public class Main {

	public static void main(String[] args) {
		
		Number n = new Number();
		
		Producer producer = new Producer(n);
		Consumer consumer = new Consumer(n);
	}
}