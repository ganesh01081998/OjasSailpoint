package com.ojas.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ConcatTwoStreams {
	public static void main(String args[]) {
		List<String> list = Arrays.asList("a","b","x");
		List<Object> list1 = Arrays.asList("ahhhhh","bfdgdg","xdfgdg",233);
		
		Stream<Object> res = Stream.concat(list.stream(), list1.stream());
		
		res.forEach(r -> System.out.println(r));lll
		
	}

}
