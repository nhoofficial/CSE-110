public class Task17
{
  public static void main(String[]args)
  {
    int first=0,second=1;
    System.out.print(first);
    System.out.print(second);
    int sum=first+second;
    while(sum<1600)
    {
      System.out.print(sum);
      first=second;
      second=sum;
      sum=first+second;
    }
  }
}  
      
    