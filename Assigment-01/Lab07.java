import java.util.Scanner;
public class Lab07
{
  public static void main(String[]args)
  {
    Scanner sc= new Scanner(System.in);
    int row= sc.nextInt();
    for(int i=1;i<=row;i++)
    {
      for(int space=1;space<=row-i;space++)
        System.out.print(" ");
      for(int k=1;k<=i;k++)
        System.out.print("*");
      System.out.println();
    }
  }
}  
        