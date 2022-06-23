package omkartest;

class Student{
	int age;
	String name;
	
	public void printInfo(int age) {
		System.out.println(this.age);
	}
	public void printInfo(String name){
		System.out.println(this.name);
	}
	public void printInfo(String name, int age) {
		System.out.println(this.name+"  "+ this.age);
	}
	Student(){
		System.out.println("constructor called");
	}
}


public class Main{
	public static void main(String [] args) {
		Student sc= new Student();
		Student mt = new Student();
		sc.age= 20;
		sc.name="omkar";
		mt.age= 25;
		mt.name="krusheel";
		
		
	
		sc.printInfo(sc.name, sc.age);
		sc.printInfo(sc.name);
		sc.printInfo( sc.age);
		mt.printInfo(mt.name, mt.age);
		mt.printInfo(mt.name);
		mt.printInfo( mt.age);
		
	}
	
}

