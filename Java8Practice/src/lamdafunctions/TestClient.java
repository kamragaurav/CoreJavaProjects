package lamdafunctions;

public class TestClient {
	
	public static void main(String[] args) {
		TestClient testClient = new TestClient();
		testClient.callLambda();
		LamdaInterface.teststatic();
	}

	LamdaInterface interface1 = ()->{
		System.out.println("Hello");
	};
	
	public void callLambda() {
		interface1.test();
		interface1.testdefault();
	}
}
