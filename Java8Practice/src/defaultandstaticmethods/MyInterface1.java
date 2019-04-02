package defaultandstaticmethods;

public interface MyInterface1 {

	default void printHello() {
		System.out.println("Hello From Interface");
	}

}
