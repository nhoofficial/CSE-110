import java.util.Scanner;
public class Task15
{
  public static void main(String[]args)
  {
    Scanner sc= new Scanner(System.in);
    int hour=sc.nextInt();
    if(hour<0)
      System.out.print("Wrong"+" "+"time");
    else if(hour<4)
      System.out.print("Patience"+" "+"is"+" "+"a"+" "+"virtue");
    else if(hour<=6)
      System.out.print("Breakfast");
    else if(hour<12)
      System.out.print("Patience"+" "+"is"+" "+"a"+" "+"virtue");
    else if(hour<=13)
      System.out.print("Lunch");
    else if(hour<16)
      System.out.print("Patience"+" "+"is"+" "+"a"+" "+"virtue");
    else if(hour<=17)
      System.out.print("Lunch");
    else if(hour==18)
      System.out.print("Patience"+" "+"is"+" "+"a"+" "+"virtue");
    else if(hour<=20)
      System.out.print("Dinner");
    else if(hour<=23)
      System.out.print("Patience"+" "+"is"+" "+"a"+" "+"virtue");
    else
      System.out.print("Wrong"+" "+"time");
    }
  }