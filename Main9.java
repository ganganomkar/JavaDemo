package omkartest;
import java.util.*;
public class Main9 {
	
	public static void main(String[] args) {
		ArrayList<Integer>Prime_no= new ArrayList<>();
		
		Prime_no.add(2);
		Prime_no.add(3);
		Prime_no.add(5);
		Prime_no.add(9);
		Prime_no.add(11);
		Prime_no.add(12);
		Prime_no.add(15);
		Prime_no.add(17);
		Prime_no.add(19);
		
		System.out.println(Prime_no);
		
		System.out.println(Prime_no.get(0));
		Prime_no.add(23);
		System.out.println(Prime_no);
		Prime_no.set(5,13);
		System.out.println(Prime_no);
		Prime_no.add(3,7);
		System.out.println(Prime_no);
		Prime_no.remove(4);
		System.out.println(Prime_no);
	//	Prime_no.clear();
		System.out.println(Prime_no+"cleared");
		
		Iterator<Integer> it = Prime_no.iterator();
		
		while(it.hasNext()) 
		{		System.out.println("Iterator"+ it.next());
	}
		
		
		
		
	}
	

}
