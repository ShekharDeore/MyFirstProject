package mypackage;

public class ladderIfStatement {

	public static void main(String[] args) {
		// to sort grade system
		
		int a=101;
		
		if(a<40) {
			System.out.println("Fail");
		}else if(a<70 && a>=40){
			System.out.println("C Grade");	
		}else if(a<85 && a>=70) {
			System.out.println("B Grade");
		}else if(a<100 && a>=85) {
			System.out.println("A Grade");
		}else if(a==100){
			System.out.println("You are ExtraOrdinary");
		}else {
			System.out.println("Use valid value");
		}
			
		
		
	}

}
