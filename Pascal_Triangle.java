import java.util.Scanner;
public class Pascal_Triangle
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int num=1;
    for(int i=0;i<n;i++)
    {
      for(int space=1;space<=n-i;space++)
        System.out.print(" ");
      num=1;
      for(int j=0;j<=i;j++)
      {
        System.out.print(num+" ");
        num=num*(i-j)/(j+1);
      }
      System.out.println();
    }
  }
}
      
    
    