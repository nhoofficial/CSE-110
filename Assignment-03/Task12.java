import java.util.Scanner;
public class Task12
{
  public static void main(String[]args)
  {
    Scanner sc= new Scanner(System.in);
    int temp=0;
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    temp=a;
    a=b;
    b=c;
    c=temp;
    System.out.println("a"+"="+" "+a);
    System.out.println("b"+"="+" "+b);
    System.out.println("c"+"="+" "+c);
  }
}