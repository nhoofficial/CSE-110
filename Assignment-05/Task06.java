import java.util.Scanner;
public class Task06
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    int []mark={10,30,20,50,40};
    int max,maxIndex,temp=0;
     for(int i=0;i<mark.length;i++)
    {
      max=mark[i];
      maxIndex=i;
      for(int j=i+1;j<mark.length;j++)
      {
        if(max<mark[j])
        {
          max=mark[j];
          maxIndex=j;
        }
      }
      if(max>mark[i])
      {
        temp=mark[i];
        mark[i]=mark[maxIndex];
        mark[maxIndex]=temp;
        }
      }
     int n=sc.nextInt();
     System.out.print(mark[n]);
  }
}