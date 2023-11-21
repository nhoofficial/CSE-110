import java.util.Scanner;
public class Task30//perfect number & prime 
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    int range= sc.nextInt();
    for(int num=1;num<range;num++)//number range
    {
      int divc=0,divsum=0;
      for(int i=1;i<num;i++)
      {
        if(num%i==0)
        {  
          divsum+=i;
          divc++;
        }
      }  
        if(divc==1)
          System.out.print(num);
        else if(divsum==num)
          System.out.print(num);
      }
  }
}  
      
          