package com.ojas.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class  Example{
	int empno;
	String empname;
	double empsalary;
	public Example(int empno, String empname, double empsalary) {
		super();
		this.empno = empno;
		this.empname = empname;
		this.empsalary = empsalary;
	}
	@Override
	public String toString() {
		return "Example [empno=" + empno + ", empname=" + empname + ", empsalary=" + empsalary + "]";
	}
	
}
public class Employee {
	public static void main(String args[]) {
		List<Example> list = new ArrayList<Example>();
		
		list.add(new Example(1,"Ganesh",20000));
		list.add(new Example(2,"Sonia",60000));
		list.add(new Example(3,"Rama Devi",50044));
		
		
		List<Example> res = list.stream()
				                .filter( x -> x.empno < 2)
		                        .collect(Collectors.toList());
		
		
		/*
		 * Double ress = list.stream() .collect(Collectors.averagingInt(x->x.empno));
		 */
		
        System.out.println(res);		
	}

}
