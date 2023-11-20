import java.util.Scanner;
public class Lab11
{
  public static void main(String[]args)
  {
      
    Scanner sc= new Scanner(System.in);
    int row = sc.nextInt();
    for(int i=1;i<=row;i++)
    {
        int space;
        for( space=1;space<=row-i;space++)
        {
            System.out.print(" ");
        }  
            for(int s=space;s<=row;s++)
            {    
              System.out.print(s);
            }
            System.out.println();
            
        
        
    }
  }
}  