import java.util.Scanner;
public class Task03
{
  public static void main(String[]args)
  {
    Scanner sc= new Scanner(System.in);
    int[]a= new int [5];
    a [0]=sc.nextInt();
    int max = a[0];
    int maxloc=0;
    int min = a[0];
    int minloc=0;
    for(int i=1;i<a.length;i++)
    {
      a[i]= sc.nextInt();
      if(max<a[i])
      {  
        max=a[i];
        maxloc=i;
      }
      else
      {
        if(a[i]<min)
        {
          min=a[i];
          minloc=i;
        }
      }  
        
    }
    System.out.println("max"+max+"maxloc"+maxloc+"min"+min+"minloc"+minloc);
  }
}  
      