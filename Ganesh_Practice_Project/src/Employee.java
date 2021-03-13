import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Employee {
	private int empno;
	private String empname;

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	@Override
	public int hashCode() {
		return empno;
	}
	
	@Override
	public boolean equals(Object e) {
		Employee s = (Employee) e;
		return s.empname.equals(this.empname);
	}

	@Override
	public String toString() {
		return "Ganesh [empno=" + empno + ", empname=" + empname + "]";
	}

	public Employee(int empno, String empname) {
		super();
		this.empno = empno;
		this.empname = empname;
	}

	public static void main(String[] args) {

		Set<Employee> list = new HashSet<Employee>();
		list.add(new Employee(20129, "Ganesh"));
		list.add(new Employee(20130, "Prakash"));
		list.add(new Employee(20129, "Ganesh"));
		System.out.println(list);
		
		//Set<Employee> s = new HashSet<Employee>(list);
	//	System.out.println(s);

		 
	}

}
