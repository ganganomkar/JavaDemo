package omkartest;
import java.util.*;

public class Main7 {
	public static void main(String args[]) {
	
		Scanner sc= new Scanner(System.in);
		int row=sc.nextInt();
		int column=sc.nextInt();
		int[][]matrix = new int[row][column];
		System.out.println("size is "+row+column);
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				
				matrix[i][j]=sc.nextInt();	
			}
		}
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				System.out.print(" "+matrix[i][j]);	
			}
			System.out.println();
		}

		sc.close();
	}

}
