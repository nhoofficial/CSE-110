import java.util.Scanner;
public class Lab12
{
  public static void main(String[]args)
  {
      
    Scanner sc= new Scanner(System.in);
    int row = sc.nextInt();
    for(int i=1;i<=row;i++)
    {
        for(int space=1;space<=row-i;space++)
        {
          System.out.print(" ");
        }
        for(int s=1;s<=(i*2)-1;s++)
        {    
         System.out.print("*");
        }
        System.out.println();
       
    }
      for(int i=row-1;i>=0;i--)
    {
        for(int space=1;space<=row-i;space++)
        {
          System.out.print(" ");
        }
        for(int s=1;s<=(i*2)-1;s++)
        {    
         System.out.print("*");
        }
        System.out.println();
       
    }
    
    
  }
}  