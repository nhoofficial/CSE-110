import java.util.Scanner;
public class Lab09
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    int[]a=new int[10];
    int i;
    for(i=0;i<a.length;i++)
    {
      a[i]= sc.nextInt();
    }  
      int num=sc.nextInt();
      for(int j=0;j<a.length;j++)
      {
        if(num==a[j]){
         System.out.println("yes");
         break;
        }
        else{
         System.out.println("no");
         break;
        }
      }
    }  
  }   


    