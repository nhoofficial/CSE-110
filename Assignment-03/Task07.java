import java.util.Scanner;
public class Task07
{
  public static void main(String[]args)
  {
    Scanner sc= new Scanner(System.in);
    int x=sc.nextInt();
    int y=sc.nextInt();
    int z=sc.nextInt();
    double s=(x+y+z)/2;
    double area=Math.sqrt(s*(s-x)*(s-y)*(s-z));
    System.out.print(area);
  }
}