import java.util.Scanner;
public class Pascal_TriangleSum
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int num=1,sum=0;
    for(int i=0;i<n;i++)
    {
      num=1;
      for(int j=0;j<=i;j++)
      {
        num=num*(i-j)/(j+1);
        sum+=num;
      }      
    }
    System.out.println(sum);
  }
}