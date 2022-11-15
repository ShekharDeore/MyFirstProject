package mypackage;

class ChildClass extends ParentClass{
	int a;
	int b;

	public ChildClass(int a, int b) {
		super(10);
		super.a = a;  // calling parent class instance variable
		this.b = b;
	}

	protected int m1() {
		super.m1(); // calling parent class method
		return 0;
	}

	public void display() {
		//calling parent class instance variable and child instance variable
		System.out.println(super.a+" "+this.b+" "+super.b); 
	}



}
