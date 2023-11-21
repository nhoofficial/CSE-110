import java.util.Scanner;
public class Task16
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    int sum=0;
    for(int i=1;i<=n;i++)
    {
      sum+=i/(2*i-1);
    }
    System.out.println(sum);
  }
}
      
        
                            