package omkartest;

abstract class Car{
	abstract void run();
	abstract void color();
	void print() {
		System.out.println(" car is safe ");
	}
}

class Audi extends Car{
	void run() {
		System.out.println(" Audi is running");
	}
	void color() {
		System.out.println(" white");
	}
	
	}

class BMW extends Car{
	void run() {
		System.out.println(" BMW is running");
	}
	void color() {
		System.out.println(" Red ");
	}
}

public class Main3 {
	public static void main(String []args) {
		Car obj = new Audi();
		obj.run();
		obj.color();
		obj.print();
		
		Car obj1 = new BMW();
		obj1.run();
		obj1.color();
		obj1.print();
	}
}
