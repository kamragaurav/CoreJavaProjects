package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StudentClientParallelStream {
	
	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<>();
		students.add(new Student("AK",24));
		students.add(new Student("GK",23));
		students.add(new Student("XK",45));
		students.add(new Student("CK",34));
		students.add(new Student("KK",37));
		students.add(new Student("BK",52));
		students.add(new Student("AK",21));
		students.forEach(System.out::println);
		System.out.println("-----------------");
		
		Supplier<Stream<Student>> streamSupplier = ()->students.parallelStream();
		streamSupplier.get().sorted().forEach(System.out::println);
		
		System.out.println("-----------------");
		//pStream.sorted((s1,s2)->s1.getName().compareTo(s2.getName()));
		streamSupplier.get().forEach(System.out::println);
		
		
	}
	
	/*private static BiConsumer<Student,Student> doProcess(BiConsumer<Student,Student> consumer) {
		return (s1,s2)->{
			 consumer.accept(s1,s2);
		};
	}*/
	
	private static Consumer<Student> doProcess(Consumer<Student> consumer) {
		return (s1)->{
			 consumer.accept(s1);
		};
	}

}
