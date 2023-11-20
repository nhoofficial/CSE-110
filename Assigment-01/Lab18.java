import java.util.Scanner;
public class Lab18
{
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        int row=sc.nextInt();
        for(int i=1;i<=row;i++)
        {
            for(int space=1;space<=row-i;space++)
              System.out.print(" ");
            for(int j=1;j<=i;j++)
            {    
                if(i==1||i==row||j==1||j==i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }  
            System.out.println();
            
        }
    }
}  