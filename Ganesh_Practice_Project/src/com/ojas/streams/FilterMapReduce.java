package com.ojas.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterMapReduce {
  public static void main(String args[]) {
	  List <Integer> list = Arrays.asList(1,2,4,5);
	   
	 int res = list.stream()
	                 .filter(x -> x % 2 ==0).map(x -> x * x)
	                 .reduce(0,(d,s) -> d+s);
	 //.reduce(1,(d,s) -> d*s);
	  
	 System.out.println(res);
	  
  }
}
