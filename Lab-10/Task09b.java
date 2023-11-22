import java.util.Scanner;
public class Task09b
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    int[]a=new int[15];
    int zerocnt=0,onecnt=0,twocnt=0,threecnt=0,fourcnt=0,fivecnt=0,sixcnt=0,sevencnt=0,eightcnt=0,ninecnt=0;  
    for(int i=0;i<a.length;i++)
    {
      a[i]=sc.nextInt();
      if(a[i]==0)
        zerocnt++;
      else if(a[i]==1)
        onecnt++;
      else if(a[i]==2)
        twocnt++;
      else if(a[i]==3)
        threecnt++;
      else if(a[i]==4)
        fourcnt++;
      else if(a[i]==5)
        fivecnt++;
      else if(a[i]==6)
        sixcnt++;
      else if(a[i]==7)
        sevencnt++;
      else if(a[i]==8)
        eightcnt++;
      else 
        ninecnt++;
    }
    System.out.println("zero"+zerocnt+"one"+onecnt+"two"+twocnt+"three"+threecnt+"four"+fourcnt+"five"+fivecnt+"six"+sixcnt+"seven"+sevencnt+"eight"+eightcnt+"nine"+ninecnt);
  }
}  
        
        