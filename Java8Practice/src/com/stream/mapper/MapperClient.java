package com.stream.mapper;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MapperClient {
	
	public static void main(String[] args) {
		
		Function<Employee, String> function = (e)->{
			return e.getName().substring(0, e.getName().indexOf(" "));
		};
		BiFunction<String, Double, Employee> empObj = Employee::new;
		List<Employee> employees = new ArrayList<>();
		employees.add(empObj.apply("Gaurav Kamra", 122344d));
		employees.add(empObj.apply("Sourav Ganguli", 122344d));
		employees.add(empObj.apply("Sachine Tendulkar", 122344d));
		employees.add(empObj.apply("Rahul Dravid", 122344d));
		employees.stream().map(function).collect(Collectors.toList()).forEach(System.out::println);;
	}

}
