package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class SomeOperations {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Aman");
		names.add("Chaman");
		names.add("Arpit");
		names.add("Marpit");
		names.add("Sudhir");
		names.add("Rahul");
		names.add("Modi");
		names.add("Gaurav");
		names.add("Sonia");
		names.add("Amit");
		names.add("Smriti");
		names.add("Arun");
		
		names.stream().filter(n->n.startsWith("A")).forEach((n)->System.out.println(n));
		System.out.println(names.stream().anyMatch(s->s.contains("Gaurav")));
		System.out.println(names.stream().allMatch(n->n.contains("a")));
		
	}
}
