import java.util.Scanner;
public class Task14
{
  public static void main(String[]args)
  {
    Scanner sc= new Scanner(System.in);
    int num=sc.nextInt();
    if(num<0)
     System.out.println((-1)*num);
    else
     System.out.println(num);
  }
}