import java.util.Scanner;
public class Lab19
{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int line=n; line>=1; line--)
    {
      for(int sp=line-1; sp>=1; sp--)
        System.out.print(" ");
      for(int col=line; col<=n; col++)
      {
        if((line==n || line==1))
          System.out.print(col);
        else if(col==line || col==n)
          System.out.print(col);
        else
          System.out.print(" ");
      }
      System.out.println();
    }
  }
}