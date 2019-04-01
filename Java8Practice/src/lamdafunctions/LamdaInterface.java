package lamdafunctions;

public interface LamdaInterface {
	
	void test();
	
	public static void teststatic() {
		System.out.println("Static");
	}
	
	public default void testdefault() {
		System.out.println("Default");
	}

}
