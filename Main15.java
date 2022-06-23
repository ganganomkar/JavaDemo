package omkartest;
import java.util.function.Function;

class Sqrt implements Function<Integer, Double>{

	public Double apply(Integer t) {
		return Math.sqrt(t);
	}
}

public class Main15 {
	public static void main(String[] args) {
		
		Sqrt sr= new Sqrt();
		System.out.println(sr.apply(9));
		
		Function<Integer, Double> sm= (Integer t)-> Math.sqrt(t);
		System.out.println(sm.apply(9));
		
//		Function<Integer, Double> sr= Math::sqrt;
//		System.out.println(sr.apply(9));
			
	}

}
