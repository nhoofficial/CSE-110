import java.util.Scanner;
public class Task10
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    int i=1,sum=0;
    while(i<=10)
    {
      int num=sc.nextInt();
      if(num%2!=0)
      sum+=num; 
      i++;
    }
    double avg=sum/10;
    System.out.println(avg);
  
  }
}  
    