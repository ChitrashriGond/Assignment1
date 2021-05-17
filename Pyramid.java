import java.util.Scanner;

class Pyramid{
	public static void main(String[]arg){
	Scanner sc = new Scanner (System.in);
		System.out.println("Enter The Number of row");
	int row = sc.nextInt();
		for (int i = 1; i<=5 ; i++){
			for (int j=1; j<=5-i;  j++){
		
			System.out.print("  ");	
	
  			}
			for (int k=1; k<=i; k++){
	
			System.out.print(" * ");
			}
			System.out.println();		
                        
		}
	}
}
	
		
