import java.util.Scanner;
public class Task16
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    int c1= sc.nextInt();
    int sum=c1,max=c1,min=c1;
    for(int i=1;i<10;i++)
    {
      int c2= sc.nextInt();
      if(max<c2)
        max=c2;
      else
      {
        if(min>c2)
          min=c2;
      }
      sum+=c2;
    }
    System.out.print("max"+max+"min"+min);
    double avg=sum/10;
    System.out.println("avg"+avg);
  }
}  
      