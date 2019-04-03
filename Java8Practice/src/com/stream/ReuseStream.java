package com.stream;

import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class ReuseStream {
	
	public static void main(String[] args) {
		//Stream<String> stream = Stream.of("A","C","B");
		Supplier<Stream<String>> str = ()->Stream.of("A","C","B");
		str.get().forEach(System.out::println);
		str.get().forEach(System.out::println);
		System.out.println(str.get().count());
		System.out.println(str.get().anyMatch(s->s.contains("S")));
	}

}
