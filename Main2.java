package omkartest;


class Animal{
	int legs;
	String name;
	String color;
	void show(){
		System.out.println("I am animal");
	}
	
}

class Horse extends Animal{
	void print() {
		System.out.println("i am horse");
		System.out.println(legs);
		System.out.println(name);
		System.out.println(color);
	}
	
	
	
}


public class Main2{
	public static void main(String [] args) {
		Horse sc= new Horse();
		sc.legs= 20;
		sc.name="omkar";
		sc.color="Red";
		sc.show();
		sc.print();
	}
}
	

