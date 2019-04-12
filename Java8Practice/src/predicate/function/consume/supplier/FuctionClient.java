package predicate.function.consume.supplier;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class FuctionClient {
	
	public static void main(String[] args) {
	
		Function<Employee,Employee> firstNameList = (e)-> {
			e.setFirstName(e.getName().substring(0, e.getName().indexOf(" ")));
			return e;
		};

		Function<Employee, String> getName = e->e.getFirstName();
		BiFunction<String, Double,Employee> empObject = Employee::new;
		Consumer<String> consumer = System.out::println;
		List<Employee> employees = new ArrayList<>();
		employees.add(empObject.apply("Gaurav Kamra", 2312312d));
		employees.add(empObject.apply("Sachine Tendulkar",232334d));
		employees.add(empObject.apply("Virat Kohli", 234122d));
		employees.add(empObject.apply("Sourav Ganguli", 234232d));
		employees.add(empObject.apply("Mia Kalifa", 3242342423522234d));
		processNames(employees, getName.compose(firstNameList), consumer);
		
	}
	
	public static void processNames(List<Employee> employees,Function<Employee, String>function , Consumer<String> consumer) {
		for (Employee employee : employees) {
			consumer.accept(function.apply(employee));
		}
	}

}
