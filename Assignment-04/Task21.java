import java.util.Scanner;
public class Task21//left to right
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Please input number: "); 
    int num=sc.nextInt();
    int copynum=num,pow=1;
    while(copynum/10>0)
    {
      pow*=10;
      copynum/=10;
    }
    while(pow>0)
    {
      System.out.print(num/pow);
      num=num%pow;
      pow/=10;
    }
  }
}  