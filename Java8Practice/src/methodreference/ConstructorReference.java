package methodreference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class ConstructorReference {
	public static void main(String[] args) {
		List<Integer> numbers =Arrays.asList(2,4,5,7);
		numbers.forEach(System.out::println);
		System.out.println("---------------------------------------");
		ConstructorReference.findSqrtOfNumber(numbers,Integer::new);
	}

	private static void findSqrtOfNumber(List<Integer> numbers, Function<Integer, Integer> function) {
		List<Double> results = new ArrayList<>();
		//numbers.forEach(x->results.add(Math.sqrt(x)));// both line doing same thing
		numbers.forEach(x->results.add(Math.sqrt(function.apply(x))));
		results.forEach(System.out::println);
		
	}

}
