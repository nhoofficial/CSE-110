import java.util.Scanner;
public class Lab02
{
  public static void main(String[]args)
  {
    Scanner sc= new Scanner(System.in);
    int[]a=new int[10];
    for(int i=0;i<a.length;i++)
    {
      a[i]=sc.nextInt();
    }
     int n=sc.nextInt();
    System.out.print(a[n]+"  ");
  }
}  
    
    