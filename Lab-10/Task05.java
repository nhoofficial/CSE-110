import java.util.Scanner;
public class Task05
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    int[]a= new int[5];
    int max,maxIndex,temp=0;
    for(int i=0;i<a.length;i++)
    {
      a[i]= sc.nextInt();
    }
     for(int i=0;i<a.length;i++)
    {
      max=a[i];
      maxIndex=i;
      for(int j=i+1;j<a.length;j++)
      {
        if(max<a[j])
        {
          max=a[j];
          maxIndex=j;
        }
      }
      if(max>a[i])
      {
        temp=a[i];
        a[i]=a[maxIndex];
        a[maxIndex]=temp;
        }
      }
       for (int i=0;i<a.length;i++)
        System.out.print(a[i]+" ");
  }
}













  

        
        