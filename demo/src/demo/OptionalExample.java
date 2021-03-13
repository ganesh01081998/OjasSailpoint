package demo;

import java.util.*;

public class OptionalExample {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(null);
		list.add(1);
		list.add(null);
		list.add(2);
		//list.remove(null);
		list.remove(Collections.singleton("null"));
		
//		for (Integer i : list) {
//			if (i == null) {
//				list.remove(i);
//			} else {
//			}
//		}
		System.out.println(list);
		
	}
}