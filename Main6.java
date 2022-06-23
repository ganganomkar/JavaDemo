package omkartest;

class Vehicle{
	void run() {
		System.out.println("exit");
	}
}
class Bike extends Vehicle{
	void run() {
		System.out.println("running");
			
	}
}


public class Main6 {
	public static void main(String []args) {
		Bike bk= new Bike();
		bk.run();
		
		Vehicle vh= new Vehicle();
		vh.run();
		
		
		
	}
	

}
