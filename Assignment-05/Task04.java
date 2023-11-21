public class Task04
{
  public static void main(String[]args)
  {
    int []mark={10,30,20,50,40};
    int max=0,maxloc,temp=0;
    for(int i=0;i<mark.length;i++)
    {
      max=mark[0];
      maxloc=0;
      for(int j=1;j<mark.length;j++)
      {
        if(max<mark[j])
        {
          max=mark[j];
          maxloc=j;
        }
      }
       temp=mark[i];
       mark[i]=mark[maxloc];
       mark[maxloc]=temp;
       break;
    }
     for(int i=0;i<mark.length;i++)
       System.out.print(mark[i]+",");
  }
}
   
      