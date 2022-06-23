package omkartest;

import java.util.*;

public class Main12 {
	public static void main(String[]args) {
		ArrayList<String> list=new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("type names then type done");
		
		
		while(true) {
			String x= sc.nextLine();
			String y= "done";
			int h =x.compareTo(y);
			if(h==0){
				break;
			}
			list.add(x);
		}
		
		sc.close();
		System.out.print("loop done");
	}

}
