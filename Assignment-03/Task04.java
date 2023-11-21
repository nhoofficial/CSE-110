import java.util.Scanner;
public class Task04
{
  public static void main(String[]args)
  {
    Scanner sc= new Scanner(System.in);
    int age=sc.nextInt();
    if(age>18)
    {
      int salary=sc.nextInt();
      if(salary<10000)
      {
        System.out.print("No"+" "+"tax");
      }
      else
      {
        if(salary>20000)
          System.out.print("10%"+" "+"tax");
        else
          System.out.print("5%"+" "+"tax");
      }
    }
    else
      System.out.print("No"+" "+"tax");
  }
}