import java.util.Scanner;
public class Task05
{
  public static void main(String[]args)
  {
    Scanner sc= new Scanner(System.in);
    int sec=sc.nextInt();
    int hour=sec/3600;
    sec=sec%3600;
    int min=sec/60;
    sec=sec%60;
    System.out.print(hour+"hour"+" "+min+"min"+" "+sec+"sec");
  }
}