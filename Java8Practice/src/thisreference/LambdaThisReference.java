package thisreference;

public class LambdaThisReference {
	public Process printThisReference() {
		return i->{
			System.out.println(this);
			System.out.println(i);
		};
		
	}
	public static void main(String[] args) {
		LambdaThisReference reference = new LambdaThisReference();
		Process process =reference.printThisReference();
		process.process(20);
		
	}

}
