import java.util.Scanner;
public class Task11
{
  public static void main(String[]args)
  {
    Scanner sc= new Scanner(System.in);
    int temp=0;
    int a=sc.nextInt();
    int b=sc.nextInt();
    temp=a;
    a=b;
    b=temp;
    System.out.println("a"+"="+" "+a);
    System.out.println("b"+"="+" "+b);
  }
}