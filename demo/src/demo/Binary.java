package demo;

import java.util.*;

public class Binary {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println(list);
		ListIterator<Integer> itr = itr = list.listIterator(list.size());
		while(itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
	}

}
