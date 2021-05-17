import java.util.Scanner;

class Opyramid{
	public static void main(String[]arg){
int n ;
	Scanner sc = new Scanner (System.in);
		System.out.println("Enter The Number of row");
	n = sc.nextInt();
		for (int i = n; i>0 ; i--){
			for (int j=1; j<=n-i;  j++){
		
			System.out.print("  ");	
	
  			}
			for (int k=1; k<=i; k++){
	
			System.out.print(" * ");
			}
                           
			System.out.println();		
                        
		}
	}
}