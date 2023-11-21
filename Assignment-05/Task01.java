public class Task01
{
  public static void main(String[]args)
  {
    int []mark={10,30,20,50,40};
    int max=0,min=0,sum=0;
    double avg;
    for(int i=0;i<mark.length;i++)
    {
      max=mark[0];
      min=mark[0];
      for(int j=1;j<mark.length;j++)
      {
        if(max<mark[j])
          max=mark[j];
        else
        {
          if(min>mark[j])
          min=mark[j];
        }
      }
    }
    for(int i=0;i<mark.length;i++)
    {
      sum+=mark[i];
    }
    avg=sum/mark.length;
    System.out.println("Highest"+" "+"mark"+" "+"is"+" "+max);
    System.out.println("Lowest"+" "+"mark"+" "+"is"+" "+min);
    System.out.println("Average"+" "+"mark"+" "+"is"+" "+avg);
  }
}
    
          
      
    
    