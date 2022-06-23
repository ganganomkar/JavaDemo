package omkartest;

import java.util.Arrays;
public class main10 {
	
	public static void bubble() {
		
		int sort[]= {6, 2, 7, 9 ,4, 1, 8};
		
		Arrays.sort(sort);
//		for(int i =0;i<sort.length-1;i++) {
//			for(int j=0; j<sort.length-1-i;j++) {
//				if(sort[j]>sort[j+1]) {
//					int temp = sort[j];
//					sort[j]=sort[j+1];
//					sort[j+1]= temp;
//					
//				}
//			}
//		}
//	
		for(int i=0; i< sort.length;i++) {
			System.out.print(sort[i]);
		}
		System.out.println("");
	}
	
//	public static void selection() {
//		int sort[]= {6, 2, 7, 9 ,4, 1, 8};
//		
//		for(int i=0; i<sort.length-1;i++) {
//			int small= i;
//			for(int j=i+1;j<sort.length;j++) {
//				if(sort[small]>sort[j]) {
//					small=j;
//					
//				}
//			}
//				int temp = sort[small];
//				sort[small]=sort[i];
//				sort[i]= temp;	
//		}
//		for(int i=0; i< sort.length;i++) {
//			System.out.print(sort[i]);
//		}
//		System.out.println();
//	}
	
//	public static void Insertion() {
//int sort[]= {6, 2, 7, 9 ,4, 1, 8};
//		
//		for(int i=1; i<sort.length-1;i++) {
//			int temp=sort[i];
//			int j=i-1;
//			while(j>=0 && temp < sort[j]) {
//				sort[j+1]=sort[j];
//			j--;
//		}
//			sort[j+1]= temp;
//		}
//		
//		for(int i=0; i< sort.length;i++) {
//			System.out.print(sort[i]);
//		}
//		
//	}
	public static void main(String args[]) {
	bubble();
//	selection();
//	Insertion();
	}	

}
