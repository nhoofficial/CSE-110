import java.util.Scanner;
public class Task18
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int dig=0;
    while(num>0)
    {  
      num/=10;
      dig++;
    }
    System.out.println(dig);
  }
}  
      