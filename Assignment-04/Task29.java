import java.util.Scanner;
public class Task29//perfect number
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int sum=0;
    for(int i=1;i<num;i++)
    {
      if(num%i==0)
        sum+=i;
    }
    if(sum==num)
      System.out.println("Perfect number");
    else
      System.out.println("Not Perfect number");
  }
}  