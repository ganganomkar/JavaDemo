package omkartest;

interface Addable {
	int addNo(int a, int b);
}

//class Addition implements Addable{
//	public int addNo(int a, int b) {
//		return a+b;
//	}
//}
class Add{
	public static int plus(int a,int b) {
		return a+b;
	}
}
public class Main11 {
	public static void main(String[] args) {
//	Addition ad = new Addition();
//	System.out.println("addition is: "+ad.addNo(5, 10));
		
//		Addable Addition = (a, b) -> a + b;
//		int result = Addition.addNo(10, 20);
//		System.out.print(result);
		
		Addable Addition = Add::plus;
		System.out.println(Addition.addNo(30, 40));

	}
}
