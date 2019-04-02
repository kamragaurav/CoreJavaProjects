package defaultandstaticmethods;

public class MyInterfaceImpl implements MyInterface,MyInterface1{
	
	public static void main(String[] args) {
		MyInterfaceImpl impl = new MyInterfaceImpl();
		
		impl.printHello();
		impl.method1();
		
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("Hiiii");
	}

	@Override
	public void printHello() {
		// TODO Auto-generated method stub
		MyInterface1.super.printHello();
	}

}
