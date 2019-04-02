package thisreference;

public class AnonymousThisReference {
	public static void main(String[] args) {
		Process process = new Process() {
			
			@Override
			public void process(int i) {
				System.out.println(this);//This will print inner anonymous class object of AnonymousThisReference o/p "thisreference.AnonymousThisReference$1@7852e922" where $ is sing for inner anonymous class.
				System.out.println(i);
				
			}
		};
		process.process(10);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "AnonymousThisReference Class";
	}
}
