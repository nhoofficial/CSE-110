import java.util.Scanner;
public class Task04
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    int num1= sc.nextInt();
    int i=1,min=num1,sum=num1;
    for(i=1;i<8;i++)
    {
      int num2= sc.nextInt();
      if(min>num2)
        min=num2;
      if(num2%2==0)
        sum+=num2;
    }
    double avg= sum/8;
    System.out.println("min"+min+"avg"+avg);
  }
}  