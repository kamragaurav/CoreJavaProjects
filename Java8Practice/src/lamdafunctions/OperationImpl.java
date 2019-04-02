package lamdafunctions;

public class OperationImpl {
	
	public static void main(String[] args) {
		int b = 90;
		/*OperationImpl.doOperate(40, new Operation() {
			
			@Override
			public int operate(int i) {
				// TODO Auto-generated method stub
				return i+b;
			}
		});*/
		
		OperationImpl.doOperate(40,(n)->n+b);
		
		//using both lambda and ananomus class
	}
	
	public static void doOperate(int i,Operation o) {
		System.out.println(o.operate(i));
	}

}
