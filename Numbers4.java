import java.util.Scanner;

	class Numbers4{
		public static void main(String[]a){
			
		Scanner scanner=new Scanner(System.in);
			System.out.println("Enter The Number of row");
                   short row =scanner.nextShort();
                         for(int i=row; i>=1; i--){
		    	    for(int j=1; j<=i; j++){

			System.out.print(j+" ");

		    	    }

                       
               System.out.println();
                }


	}
 
 }