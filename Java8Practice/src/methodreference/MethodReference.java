package methodreference;

public class MethodReference {
	
	public static void m1() {
		System.out.println("Child Thread");
	}
	
	
	public static void main(String[] args) {
		MethodReference methodReference = new MethodReference();
		Runnable runnable = MethodReference::m1;
		Thread thread = new Thread(runnable);
		thread.start();
	}
	Runnable runnable2 = new Runnable() {
		
		@Override
		public void run() {
			MethodReference.m1();
			
		}
	};

	
	
	
	
}
