package demo;

@FunctionalInterface
 interface fun {
	void demo();
}
class FunctionalDemo {
	public static void main(String[] args) {
		fun f=()->{
			System.out.println("hello method");
		};
		f.demo();
	}
}
