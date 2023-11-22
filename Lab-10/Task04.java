import java.util.Scanner;
public class Task04
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    int[]a= new int[5];
    int min,minIndex,temp=0;
    for(int i=0;i<a.length;i++)
    {
      a[i]= sc.nextInt();
    }
     for(int i=0;i<a.length;i++)
    {
      min=a[i];
      minIndex=i;
      for(int j=i+1;j<a.length;j++)
      {
        if(min>a[j])
        {
          min=a[j];
          minIndex=j;
        }
      }
      if(min<a[i])
      {
        temp=a[i];
        a[i]=a[minIndex];
        a[minIndex]=temp;
        }
      }
       for (int i=0;i<a.length;i++)
        System.out.print(a[i]+" ");
  }
}













  

        
        