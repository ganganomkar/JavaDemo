package omkartest;



public class Main8 {
	public static void pattern(int size){
        int k=1;
        for(int i=size;i!=0;i--){

            for(int l=1;l!=k+1;l++){
               System.out.print("* ");

            }
            k++;

            System.out.println("");

        }
        int t= size;

        for(int i=0;i<=size;i++){
            for(int q=0;q<t;q++){
                System.out.print("  ");
            }

            for(int j=0;j<i;j++){
                System.out.print(" *");
            }
            System.out.println();
            t--;
        }
}

	public static void main(String[] args) {
	 pattern(5);      
	
	}
}
