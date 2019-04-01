package lamdafunctions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrintList {
	public static void main(String[] args) {
	
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("ABC", 10000));
		employees.add(new Employee("FGH", 60000));
		employees.add(new Employee("ZXC", 20000));
		employees.add(new Employee("JHF", 30000));
		employees.forEach(System.out::println);
		System.out.println("-------------------------------------------------");
		Collections.sort(employees, (e1,e2)->e1.getName().compareTo(e2.getName()));
		employees.forEach(System.out::println);
		Map<String, Employee> empMap = new HashMap<>();
		empMap.put("ABC", new Employee("ABC", 10000));
		empMap.put("FGH", new Employee("FGH", 10000));
		empMap.put("ZXC", new Employee("ZXC", 10000));
		empMap.put("JHF", new Employee("JHF", 10000));
		empMap.forEach((k,v)->System.out.println("Key is "+k+" Value is "+v));
	}

}

