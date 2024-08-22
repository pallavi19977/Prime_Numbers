public class Primeno100
{
     public static void main(String args[])
     {
        int num=100;
       int count=0;
      for(int i=1;i<=num;i++)
      {
      if(num%i==0)
      {
      count++;
     }
    }
       if(count==2)
       {
       System.out.println(num+ " Number is Prime");
       }
       else
       {
       System.out.println(num+ " Number is not Prime");
      }
  }
}
