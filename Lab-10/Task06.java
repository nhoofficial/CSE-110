import java.util.Scanner;
public class Task06
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    int min,minIndex,sum=0,med,temp=0;
    int num= sc.nextInt();
    int[]a = new int[num];
    for(int i=0;i<a.length;i++)
      a[i]= sc.nextInt();
    for(int i=0;i<a.length;i++)
    {
      min = a[i];
      minIndex=i;
      for(int j=i+1;j<a.length;j++)
      {
        if(a[j]<min)
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
    if(num%2==0)
    {
      sum= a[(num/2)-1]+a[num/2];
      med=sum/2;
    }
    else
      med=a[(num-1)/2];
    System.out.print("median"+med);}
}

    
   
          