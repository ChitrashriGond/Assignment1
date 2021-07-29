import java.util.Scanner;


class RightAngle1{
	public static void main(String[] args){
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter The Number of row");
		int row = sc.nextInt();
		for (int i = 1; i<=row; i++){
			for (int j = 1; j<=i; j++){
				if(j <= row)
				System.out.print(  i +" " );
				
				else
				
                               System.out.print( "  " );
			}
  				
			System.out.println(); 
		}

		for (int i = row-1; i>0; i--){
			for (int j = 1; j<=row; j++){
				if(j <= i)
				System.out.print(  i +" " );
				
				else
				
                               System.out.print( "  " );
			}
  				
			System.out.println(); 
		}
	}
}


