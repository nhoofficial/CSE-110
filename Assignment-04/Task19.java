import java.util.Scanner;
public class Task19
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    int pow= sc.nextInt();
    int i=1,pro=1;
    for(i=1;i<=pow;i++)
      pro=pro*10;
    System.out.println(pro);
  }
}  