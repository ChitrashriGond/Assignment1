import java.util.Scanner;
public class Star2
{
  public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        int rows = scanner.nextInt();
       System.out.println("Enter the Number of rows ");
       for (int i=1; i<=rows; i++)
  {
   for (int j = 1; j <= i; j++)
   {System.out.print("*");
            }
       for (int k = i*2; k <= rows*2-1; k++)
            { System.out.print(" ");
      }
    for (int c = 1; c <= i; c++)
            { System.out.print("*");
            }
            System.out.println();
        }
          for (int i=1; i<=rows-1; i++)
        {
            for (int j = rows-1; j >= i; j--)
            {  System.out.print("*");
            }
            for (int k = 1; k <= i*2; k++)
            {
                System.out.print(" ");
            }
            for (int c = rows-1; c >= i; c--)
            {
                System.out.print("*");
            }
           
            System.out.println();
        }
        
    }
}