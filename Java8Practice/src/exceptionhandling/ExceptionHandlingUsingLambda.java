package exceptionhandling;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

public class ExceptionHandlingUsingLambda {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,4,6,8);
		doProcess(list, wrapperLambda((n)->n/0));
	}
	
	private static void doProcess(List<Integer> list,Function<Integer, Integer> function) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		for (Integer iterator:list) {
			arrayList.add(function.apply(iterator));
			
		}
		arrayList.forEach(System.out::println);
	}
	
	private static Function<Integer, Integer> wrapperLambda(Function<Integer, Integer> function) {
		/*return (n)->{
			return function.apply(n);
		};*/
		
		return t -> {
	        try {
	            return function.apply(t);
	        } catch (ArithmeticException ex) {
	            System.out.println("Arithmetic Exception");
	        }
			return t;
	    };
	}

}
