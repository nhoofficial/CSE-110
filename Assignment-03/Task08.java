import java.util.Scanner;
public class Task08
{
  public static void main(String[]args)
  {
    Scanner sc= new Scanner(System.in);
    int article=sc.nextInt();
    int fee= 500*article;
    System.out.print(fee);
  }
}