import java.util.Scanner;
public class Task01
{
  public static void main(String[]args)
  {
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    if(n>50)
      System.out.print("Pass");
    else
      System.out.print("You"+" "+"shall"+" "+"not"+" "+"pass");
  }
}