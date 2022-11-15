package mypackage;

public class MethodOverloading {
	
	void m1() {
		
	}
	
	void m1(int a) {
		
	}
	
	int m1(int a, String b) {
		return a;
		
	}
	
	void m1(String b , int a) {
		
	}
	
	public static void main(String[] args) {
		MethodOverloading ref = new MethodOverloading();
		ref.m1(10);
	}
}
