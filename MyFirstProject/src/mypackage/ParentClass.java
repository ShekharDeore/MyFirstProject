package mypackage;

public class ParentClass {

	int a;  //instance Variable
	int b = 30;  //instance Variable
	int c;
	int d;

	protected ParentClass(int c) {
		this.c=c;
		
	}

	protected int m1() {
		System.out.println("m1 Parent Method");
		return a;
	}
}