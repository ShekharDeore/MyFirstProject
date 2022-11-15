package polymorphism;

public class Dog extends Animal{
	String colour = "Black";
	void eat() {
		System.out.println("Dog is eating dog food");
	}
	
	public static void main(String[] args) {
		
		//upCasting
		Animal a = new Dog();
		a.eat();
		
		//lowCasting
		//Dog a1 = new Animal();// compile time Error
		//Dog a1 = (Dog) new Animal(); //runtime error=classcastexception
		
		
	}
}