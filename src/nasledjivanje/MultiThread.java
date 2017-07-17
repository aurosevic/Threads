package nasledjivanje;

public class MultiThread {

	public static void main(String[] args) {
		
		A a = new A();
		a.start();
		
		B b = new B();
		b.start();
	}
}