import java.util.Scanner;
public class Lab16
{
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        int row=sc.nextInt();
        for(int i=1;i<=row;i++)
        {
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