package defaultandstaticmethods;

public class MyInterfaceImpl implements MyInterface{
	
	public static void main(String[] args) {
		MyInterfaceImpl impl = new MyInterfaceImpl();
		impl.printHello();
		impl.method1();
		MyInterface.printBye();
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("Hiiii");
	}

}
