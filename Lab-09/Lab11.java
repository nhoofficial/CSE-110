import java.util.Scanner;
public class Lab11
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    int[]a=new int[10];
    for(int i=0;i<a.length;i++)
    {
      a[i]= sc.nextInt();
      for(int j=0;j<i;j++)
      {
        if(a[i]==a[j])
        {
          i--;
          System.out.print("Enter again");
          break;
        }
      }
    }
  }
}  
          

    