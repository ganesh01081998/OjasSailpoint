package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLargestNumber {
	public static void main(String[] args) {
		/*
		 * List<Integer> list = Arrays.asList(1,90,5,10,56,22); Collections.sort(list);
		 * System.out.println(list.get(list.size()-2));
		 */
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(8);
		list.add(90);
		list.add(67);
		list.add(7);
		
		//Collections.sort(list); System.out.println(list.get(list.size()-2));
		 
		System.out.println(Collections.max(list));
	}

}
