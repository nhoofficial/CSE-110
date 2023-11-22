import java.util.Scanner;
public class Lab13
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    int[]a=new int[10];
    int sum1=0,sum2=0,sum3=0;
    for(int i=0;i<a.length;i++)
    {
      a[i]= sc.nextInt();
    }
    for(int j=0;j<a.length;j++)
    {
      if(a[j]%5==0)
        sum1+=a[j];
      else if(a[j]%2==0)
        sum3+=a[j];
      else
        sum2+=a[j];
    }
    System.out.print("sum1:"+sum1+"sum2:"+sum2+"sum3:"+sum3);
  }
}  
      