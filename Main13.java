package omkartest;

//class Demo implements Runnable{
//
//	
//	public void run() {
//		System.out.println("run method is called");
//		
//	}
//		
//}

public class Main13 {
	public static void main(String[] args) {
//		Thread thread= new Thread(new Demo());
//		thread.start();
		
		Runnable Demo=()->
			System.out.println("run method is called again");
			
		Thread threadLambda= new Thread(Demo);
		threadLambda.start();
		}
		
		
		
		
	}


