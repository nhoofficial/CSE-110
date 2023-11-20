import java.util.Scanner;
public class Lab15
{
  public static void main(String[]args)
  {
      
    Scanner sc= new Scanner(System.in);
    int row = sc.nextInt();
    int col= sc.nextInt();
    for(int rc=1;rc<=row;rc++)
    {
        for(int cc=1;cc<=col;cc++)
        if((rc==1) || (rc==row) ||  (cc==1) || (cc==col))
            System.out.print(cc);
        else
            System.out.print(" ");
        System.out.println();
    }
  }
}  