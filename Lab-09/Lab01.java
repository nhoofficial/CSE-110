import java.util.Scanner;
public class Lab01
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    int[]a=new int[3];
    int sum=0;
    for(int i=0;i<a.length;i++)
    {
      a[i]= sc.nextInt();
      sum=sum+a[i];
    }
    System.out.println(sum);
  }
}  
    