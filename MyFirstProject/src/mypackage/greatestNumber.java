package mypackage;

public class greatestNumber {

	public static void main(String[] args) {
		// to find out a greatest number
		
		int a = 29;
		int b = 31;
		int c = 33;

		
		if(a>b) {
			if(a>c) {
					System.out.println(a+ " is a greater number");
			}
		}else if(b>c) {
			if(b>a) {
				System.out.println(b+ " is a greater number");
			}
		}else if(c>a) {
			if(c>b) {
				System.out.println(c+ " is a greater number");
			}
		}
	}

}
