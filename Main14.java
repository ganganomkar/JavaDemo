package omkartest;

import java.util.function.Supplier;
import java.time.LocalDateTime;

//class DisplayTime implements Supplier<LocalDateTime>{
//
//	@Override
//	public LocalDateTime get() {
//		
//		return LocalDateTime.now() ;
//	}
//}



public class Main14 {
	public static void main(String[] args) {
//		Supplier<LocalDateTime> DT= new DisplayTime();
//		System.out.println("current time is: "+ sd.get());
		
		Supplier<LocalDateTime> DT=()-> LocalDateTime.now();
		
		 System.out.println("time is : "+ DT.get());
	}

}
