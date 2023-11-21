public class Task05
{
  public static void main(String[]args)
  {
    int []mark={50,30,20,10,40};
    int max,maxIndex,temp=0;
     for(int i=0;i<mark.length;i++)
    {
      max=mark[i];
      maxIndex=i;
      for(int j=i+1;j<mark.length;j++)
      {
        if(max<mark[j])
        {
          max=mark[j];
          maxIndex=j;
        }
      }
      if(max>mark[i])
      {
        temp=mark[i];
        mark[i]=mark[maxIndex];
        mark[maxIndex]=temp;
        }
      }
       for (int i=0;i<mark.length;i++)
        System.out.print(mark[i]+" ");
  }
}