import java.util.Scanner;
public class Task22
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    int sum=0;
    for(int i=1;i<=10;i++)
    {
      int n=sc.nextInt();
      if(n%2!=0)
        sum+=n;
    }
    System.out.println(sum);
  }
}