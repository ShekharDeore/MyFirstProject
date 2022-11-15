package mypackage;

public class abstraction1 extends abstraction {
	public int m1() {
		System.out.println("This is child m1");
		return 1;
	}

	public static void main(String[] args) {
		abstraction ab = new abstraction1();
		ab.m1();
	}
}
