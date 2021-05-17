import java.util.Scanner;

class Star1{
	public static void main(String[]arg){
	Scanner sc = new Scanner (System.in);
		System.out.println("Enter The Number of row");
	int row = sc.nextInt();
		for (int i = 1; i<=5; i++){
			for (int j =i; j<5; j++){
		
			System.out.print("  ");	
	
  			}
			for (int k =1; k<=i; k++){
	
			System.out.print(" * ");
			}
			System.out.println();		
                        
		}
	}
}
	
		
