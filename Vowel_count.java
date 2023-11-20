import java.util.Scanner;
public class Vowel_count
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    String s =sc.nextLine();
    s=s.toLowerCase();
    int c=0;
    char[]a={'a','e','i','o','u'};  
    for(int i=0;i<s.length();i++){
      for(int j=0;j<5;j++){
        if(s.charAt(i)==a[j]){
          c++;
          break;
       }
           }
}
    System.out.print(c);
           
  }
}
  