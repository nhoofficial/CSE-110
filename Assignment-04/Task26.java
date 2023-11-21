import java.util.Scanner;
public class Task26
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    int num=sc.nextInt();
    int divc=0;
    for(int i=1;i<=num;i++)
    {
      if(num%i==0)
        divc++;
    }
    if(divc==2)
     System.out.println("prime number");
    else
      System.out.println("NOt prime number");  
  }
}  