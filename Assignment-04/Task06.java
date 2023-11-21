import java.util.Scanner;
public class Task06
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    int N= sc.nextInt();
    int i=1,sum=0;
    while(i<=N)
    {
      if(i%2==0)
      sum-=Math.pow(i,2); 
      else
        sum+=Math.pow(i,2);
      i++;
    }
    System.out.println(sum);
  
  }
}  
    