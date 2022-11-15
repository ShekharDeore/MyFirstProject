package mypackage;

public class Practice1 {
	
	int a;
	Practice1(int a){
		this.a=a;
		
	}
	
	Practice1(int b, int c){
		
	}
	
	int Practice1(){
		
		System.out.println("hiii");
		return 0;
	}
	
	int Practice2() {
		return 0;
	}
	
	public static void main(String[] args) {
		Practice1 obj = new Practice1(10);
		obj.Practice1();
		System.out.println(obj.a);
		
	}
}
