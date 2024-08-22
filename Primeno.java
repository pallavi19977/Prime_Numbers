import java.util.*;
public class Primeno
{
    public static void main(String args[])
    {
      int count=0;
      int num;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter any No");
       num=sc.nextInt();
      
       for(int i=1; i<=num;i++)
       {
        if(num%i==0)
        {
         count++;
        
        }
      }
      if (count==2)
      {
       System.out.println("Number is Prime: "+num);
       }
       else
       {
       System.out.println("Number is not Prime: "+num);
      } 
 }
}
