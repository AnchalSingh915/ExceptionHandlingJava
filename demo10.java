import java.io.*;
class demo10//ArrayOutOfBoundException
{
    public void throwexp()throws Exception
    {
        int i=0;
        int a[]=new int[5];
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         for(i=0;i<5;i++)
         {
           System.out.println("enter the no");
           a[i]=Integer.parseInt(br.readLine());
         }
         for(i=0;i<10;i++)
         {
          System.out.println(a[i]);
         }
    }
    public static void main(String ar[])
    { 
      try
      {
         demo10 obj=new demo10();
         obj.throwexp(); 
      } 
      catch(Exception kajal)
      {
        System.out.println(kajal);
      }
    }
}
       
    
