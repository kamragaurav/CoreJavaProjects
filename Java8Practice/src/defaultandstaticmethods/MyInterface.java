package defaultandstaticmethods;

public interface MyInterface {
	default void printHello() {
		System.out.println("Hello From Interface");
	}
	
	public static void printBye() {
		System.out.println("Bye from interface");
	}
	
	void method1();

}
