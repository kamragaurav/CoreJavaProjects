package com.stream.mapper;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIMapTest {
	public static void main(String[] args) {
		List<String> uris = new ArrayList<>();
		uris.add("C://testFile1.txt");
		uris.add("C://testFile2.txt");
		uris.add("C://testFile3.txt");
		uris.add("C://testFile4.txt");
		Stream<Path> paths = uris.stream().map((file)->Paths.get(file));
		paths.forEach(System.out::println);
		
		List<String> parts1 = new ArrayList<>();
		parts1.add("Part_1");
		parts1.add("Part_2");
		parts1.add("Part_3");
		parts1.add("Part_4");
		
		List<String> parts2 = new ArrayList<>();
		parts2.add("Part_5");
		parts2.add("Part_6");
		parts2.add("Part_7");
		parts2.add("Part_8");
		
		Details details1 = new Details(101,parts1);
		Details details2 = new Details(102,parts2);
		List<Details> details = new ArrayList<>();
		details.add(details1);
		details.add(details2);
		
		List<String> detailsString=details.stream().flatMap((detail)->detail.getParts().stream()).collect(Collectors.toList());
		detailsString.forEach(System.out::println);
		//Stream<String> parts = details.stream().flatMap((detail)->detail.getParts().stream());
		//parts.forEach(System.out::println);
		
	}

}