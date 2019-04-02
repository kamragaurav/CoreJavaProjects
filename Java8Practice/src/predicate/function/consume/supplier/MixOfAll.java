package predicate.function.consume.supplier;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public interface MixOfAll {
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		Predicate<Employee> predicate = e -> e.getSalary() >= 10000;
		BiFunction<String, Double, Employee> function = Employee::new;
		//Supplier<Employee> supplier = (Supplier<Employee>) function.apply("Gaurav", 12000d);
		employees.add(function.apply("Gaurav", 12000d));
		employees.add(function.apply("kamra", 23000d));
		employees.add(function.apply("xyz", 8000d));
		Consumer<Employee> consumer = (e)->{
			System.out.println(e+" is having salary greater then 10000 "+ predicate.test(e));
		};
		
		for (Employee employee:employees) {
			consumer.accept(employee);
			
		}
		
	}
}
