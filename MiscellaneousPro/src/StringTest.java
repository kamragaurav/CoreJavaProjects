class Test{
	public String test;
	public Test(String test) {
		this.test = test;
	}
}

public class StringTest {
	
	public static void main(String[] args) {
		Test test = new Test("Sample");
		Test test1 =test;
		Test test2 = test;
		Test test3 = test;
		
		System.out.println(test.hashCode());
		System.out.println(test1.hashCode());
		System.out.println(test2.hashCode());
		System.out.println(test3.hashCode());
		
		System.out.println(test==test1);
		System.out.println(test.equals(test1));
	}

}
