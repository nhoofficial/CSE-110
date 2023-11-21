
public class Task02
{
  public static void main(String[]args)
  {
    int []mark={10,30,20,50,40};
    int count=0,sum=0;
    double avg;
     for(int i=0;i<mark.length;i++)
    {
      sum+=mark[i];
    }
     avg=sum/mark.length;
      for(int i=0;i<mark.length;i++)
    {
      if(mark[i]>avg)
        count++;
    }
      System.out.print(count);
  }
}
    